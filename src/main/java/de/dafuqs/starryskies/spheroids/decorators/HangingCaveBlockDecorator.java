package de.dafuqs.starryskies.spheroids.decorators;

import com.google.gson.*;
import com.mojang.brigadier.exceptions.*;
import de.dafuqs.starryskies.*;
import de.dafuqs.starryskies.registries.*;
import de.dafuqs.starryskies.spheroids.spheroids.*;
import net.minecraft.block.*;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.util.math.random.*;
import net.minecraft.world.*;

public class HangingCaveBlockDecorator extends SpheroidDecorator {
	
	private final BlockState block;
	private final float chance;
	
	public HangingCaveBlockDecorator(JsonObject data) throws CommandSyntaxException {
		super(data);
		block = StarrySkies.getStateFromString(JsonHelper.getString(data, "block"));
		chance = JsonHelper.getFloat(data, "chance");
	}
	
	@Override
	public void decorate(StructureWorldAccess world, ChunkPos origin, Spheroid spheroid, Random random) {
		for (BlockPos bp : getBottomBlocks(world, origin, spheroid)) {
			if (!world.getBlockState(bp).isAir() && random.nextFloat() < chance) {
				if (world.getBlockState(bp.down()).isAir()) {
					world.setBlockState(bp.down(), block, 3);
				}
				break;
			}
		}
	}
}
