package de.dafuqs.starrysky.spheroidtypes.special_overworld;

import de.dafuqs.starrysky.StarrySkyCommon;
import de.dafuqs.starrysky.Support;
import de.dafuqs.starrysky.advancements.SpheroidAdvancementIdentifier;
import de.dafuqs.starrysky.spheroiddecorators.SpheroidDecorator;
import de.dafuqs.starrysky.spheroids.special_overworld.DungeonSpheroid;
import de.dafuqs.starrysky.spheroidtypes.SpheroidType;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.world.gen.ChunkRandom;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class DungeonSpheroidType extends SpheroidType {

    private final EntityType entityType;
    private final LinkedHashMap<BlockState, Float> validShellBlocks;
    private final int minShellRadius;
    private final int maxShellRadius;

    public DungeonSpheroidType(SpheroidAdvancementIdentifier spheroidAdvancementIdentifier, int minRadius, int maxRadius, EntityType entityType, LinkedHashMap<BlockState, Float> validShellBlocks, int minShellRadius, int maxShellRadius) {
        super(spheroidAdvancementIdentifier, minRadius, maxRadius);

        if(entityType == null) {
            StarrySkyCommon.LOGGER.error("DungeonSpheroidType: Registered a SpheroidType with null entity!");
        }

        this.entityType = entityType;
        this.validShellBlocks = validShellBlocks;
        this.minShellRadius = minShellRadius;
        this.maxShellRadius = maxShellRadius;
    }

    @Override
    public String getDescription() {
        return "DungeonSpheroid";
    }

    public DungeonSpheroid getRandomSphere(ChunkRandom chunkRandom) {
        int radius = getRandomRadius(chunkRandom);
        BlockState shellBlock = Support.getWeightedRandom(validShellBlocks, chunkRandom);
        int shellRadius = chunkRandom.nextInt(maxShellRadius - minShellRadius  + 1) + minShellRadius;

        ArrayList<SpheroidDecorator> spheroidDecorators = getSpheroidDecoratorsWithChance(chunkRandom);
        return new DungeonSpheroid(chunkRandom, spheroidAdvancementIdentifier, radius, spheroidDecorators, entityType, shellBlock, shellRadius);
    }

}
