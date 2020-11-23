package de.dafuqs.starrysky.spheroidtypes.special_overworld;

import de.dafuqs.starrysky.advancements.SpheroidAdvancementIdentifier;
import de.dafuqs.starrysky.spheroiddecorators.SpheroidDecorator;
import de.dafuqs.starrysky.spheroids.special_overworld.OceanMonumentSpheroid;
import de.dafuqs.starrysky.spheroidtypes.SpheroidType;
import net.minecraft.world.gen.ChunkRandom;

import java.util.ArrayList;

public class OceanMonumentSpheroidType extends SpheroidType {

    private final int minTreasureRadius;
    private final int maxTreasureRadius;
    private final int minShellRadius;
    private final int maxShellRadius;

    public OceanMonumentSpheroidType(SpheroidAdvancementIdentifier spheroidAdvancementIdentifier, int minRadius, int maxRadius, int minTreasureRadius, int maxTreasureRadius, int minShellRadius, int maxShellRadius) {
        super(spheroidAdvancementIdentifier, minRadius, maxRadius);

        this.minTreasureRadius = minTreasureRadius;
        this.maxTreasureRadius = maxTreasureRadius;
        this.minShellRadius = minShellRadius;
        this.maxShellRadius = maxShellRadius;
    }

    public String getDescription() {
        return "OceanMonumentSpheroid";
    }

    public OceanMonumentSpheroid getRandomSphere(ChunkRandom chunkRandom) {
        int radius = getRandomRadius(chunkRandom);
        int treasureRadius = chunkRandom.nextInt(this.maxTreasureRadius - this.minTreasureRadius + 1) + this.minTreasureRadius;
        int shellRadius = chunkRandom.nextInt(this.maxShellRadius - this.minShellRadius + 1) + this.minShellRadius;
        ArrayList<SpheroidDecorator> spheroidDecorators = getSpheroidDecoratorsWithChance(chunkRandom);

        return new OceanMonumentSpheroid(chunkRandom, spheroidAdvancementIdentifier, radius, spheroidDecorators, treasureRadius, shellRadius);
    }

}
