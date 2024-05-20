package de.dafuqs.starryskies.spheroids.spheroids;

import com.google.gson.*;
import com.mojang.brigadier.exceptions.*;
import de.dafuqs.starryskies.*;
import de.dafuqs.starryskies.registries.*;
import de.dafuqs.starryskies.spheroids.*;
import net.minecraft.block.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.util.math.random.*;
import net.minecraft.world.chunk.*;

import java.util.*;

public class CoreSpheroid extends Spheroid {
	
	private final BlockState coreBlock;
	private final BlockState shellBlock;
	private float coreRadius;
	
	public CoreSpheroid(Spheroid.Template template, float radius, List<SpheroidDecorator> decorators, List<Pair<EntityType<?>, Integer>> spawns, ChunkRandom random,
						BlockState coreBlock, BlockState shellBlock, float coreRadius) {
		
		super(template, radius, decorators, spawns, random);
		this.coreBlock = coreBlock;
		this.shellBlock = shellBlock;
		this.coreRadius = coreRadius;
		
		if (this.coreRadius >= this.radius) {
			this.coreRadius = this.radius - 1;
		}
	}
	
	public static class Template extends Spheroid.Template {
		
		private final BlockStateSupplier coreBlock;
		private final BlockStateSupplier shellBlock;
		private final int minCoreRadius;
		private final int maxCoreRadius;
		
		public Template(Identifier identifier, JsonObject data) throws CommandSyntaxException {
			super(identifier, data);
			
			JsonObject typeData = JsonHelper.getObject(data, "type_data");
			this.coreBlock = BlockStateSupplier.of(typeData.get("core_block"));
			this.shellBlock = BlockStateSupplier.of(typeData.get("main_block"));
			this.minCoreRadius = JsonHelper.getInt(typeData, "min_core_size");
			this.maxCoreRadius = JsonHelper.getInt(typeData, "max_core_size");
		}
		
		@Override
		public CoreSpheroid generate(ChunkRandom random) {
			float radius = randomBetween(random, minSize, maxSize);
			int coreRadius = Support.getRandomBetween(random, this.minCoreRadius, this.maxCoreRadius);
			coreRadius = Math.min(coreRadius, (int) radius - 1);
			return new CoreSpheroid(this, radius, selectDecorators(random), selectSpawns(random), random, coreBlock.get(random), shellBlock.get(random), coreRadius);
		}
		
	}
	
	public String getDescription() {
		return "+++ CoreSpheroid +++" +
				"\nPosition: x=" + this.getPosition().getX() + " y=" + this.getPosition().getY() + " z=" + this.getPosition().getZ() +
				"\nTemplateID: " + this.template.getID() +
				"\nRadius: " + this.radius +
				"\nShell: " + this.shellBlock.toString() +
				"\nCore: " + this.coreBlock.toString() + " (Radius: " + this.coreRadius + ")";
	}
	
	@Override
	public void generate(Chunk chunk) {
		int chunkX = chunk.getPos().x;
		int chunkZ = chunk.getPos().z;
		
		int x = this.getPosition().getX();
		int y = this.getPosition().getY();
		int z = this.getPosition().getZ();
		
		random.setSeed(chunkX * 341873128712L + chunkZ * 132897987541L);
		int ceiledRadius = (int) Math.ceil(this.radius);
		int maxX = Math.min(chunkX * 16 + 15, x + ceiledRadius);
		int maxZ = Math.min(chunkZ * 16 + 15, z + ceiledRadius);
		BlockPos.Mutable currBlockPos = new BlockPos.Mutable();
		for (int x2 = Math.max(chunkX * 16, x - ceiledRadius); x2 <= maxX; x2++) {
			for (int y2 = y - ceiledRadius; y2 <= y + ceiledRadius; y2++) {
				for (int z2 = Math.max(chunkZ * 16, z - ceiledRadius); z2 <= maxZ; z2++) {
					long d = Math.round(Support.getDistance(x, y, z, x2, y2, z2));
					if (d > this.radius) {
						continue;
					}
					currBlockPos.set(x2, y2, z2);
					
					if (d <= this.coreRadius) {
						chunk.setBlockState(currBlockPos, this.coreBlock, false);
					} else {
						chunk.setBlockState(currBlockPos, this.shellBlock, false);
					}
				}
			}
		}
	}
	
}
