package de.dafuqs.starrysky.spheroidlists;

import de.dafuqs.starrysky.dimension.SpheroidDistributionType;
import de.dafuqs.starrysky.dimension.SpheroidLoader;
import de.dafuqs.starrysky.StarrySkyCommon;
import de.dafuqs.starrysky.spheroidtypes.CoreSpheroidType;
import de.dafuqs.starrysky.spheroidtypes.LiquidSpheroidType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.BlockState;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SpheroidListAstromine extends SpheroidList {

    private static final String MOD_ID = "astromine";

    public static boolean shouldGenerate() {
        return FabricLoader.getInstance().isModLoaded(MOD_ID) && StarrySkyCommon.STARRY_SKY_CONFIG.generateAstromineSpheroids;
    }

    public static void setup(SpheroidLoader spheroidLoader) {
        BlockState astromine_crude_oil         = Registry.BLOCK.get(new Identifier(MOD_ID,"crude_oil")).getDefaultState();
        BlockState astromine_copper_ore        = Registry.BLOCK.get(new Identifier(MOD_ID,"copper_ore")).getDefaultState();
        BlockState astromine_tin_ore           = Registry.BLOCK.get(new Identifier(MOD_ID,"tin_ore")).getDefaultState();
        BlockState astromine_silver_ore        = Registry.BLOCK.get(new Identifier(MOD_ID,"silver_ore")).getDefaultState();
        BlockState astromine_lead_ore          = Registry.BLOCK.get(new Identifier(MOD_ID,"lead_ore")).getDefaultState();
        BlockState astromine_meteor_metite_ore = Registry.BLOCK.get(new Identifier(MOD_ID,"meteor_metite_ore")).getDefaultState();
        BlockState astromine_meteor_stone      = Registry.BLOCK.get(new Identifier(MOD_ID,"meteor_stone")).getDefaultState();

        CoreSpheroidType ASTROMINE_METEORITE         = new CoreSpheroidType(null, 8, 13, astromine_meteor_metite_ore, astromine_meteor_stone, 5, 8);
        LiquidSpheroidType ASTROMINE_CRUDE_OIL_STONE = new LiquidSpheroidType(null, 8, 15, astromine_crude_oil, MAP_STONES, 5, 8, 50, 100, 30);
        LiquidSpheroidType ASTROMINE_CRUDE_OIL_GLASS = new LiquidSpheroidType(null, 7, 12, astromine_crude_oil, MAP_GLASS, 2, 3, 50, 80, 50);

        spheroidLoader.registerDynamicOre("lead", astromine_lead_ore);
        spheroidLoader.registerDynamicOre("silver", astromine_silver_ore);
        spheroidLoader.registerDynamicOre("tin", astromine_tin_ore);
        spheroidLoader.registerDynamicOre("copper", astromine_copper_ore);

        spheroidLoader.registerSpheroidType(SpheroidDistributionType.ORE, 0.5F, ASTROMINE_METEORITE);
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.FLUID, 1.0F, ASTROMINE_CRUDE_OIL_STONE);
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.FLUID, 1.0F, ASTROMINE_CRUDE_OIL_GLASS);
    }

}
