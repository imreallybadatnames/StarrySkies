package de.dafuqs.starrysky.spheroidlists;

import de.dafuqs.starrysky.SpheroidLoader;
import de.dafuqs.starrysky.StarrySkyCommon;
import de.dafuqs.starrysky.spheroiddecorators.SpheroidDecorators;
import de.dafuqs.starrysky.spheroidtypes.*;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;

public class SpheroidListBYG extends SpheroidList {

    private static final String MOD_ID = "byg";

    // VERY RARE ORES
    private static final BlockState byg_ametrine_ore = Registry.BLOCK.get(new Identifier(MOD_ID,"ametrine_ore")).getDefaultState();
    private static final BlockState byg_pendorite_ore = Registry.BLOCK.get(new Identifier(MOD_ID,"pendorite_ore")).getDefaultState();

    // WOOD
    private static final BlockState byg_aspen_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"aspen_leaves")).getDefaultState();
    private static final BlockState byg_aspen_log          = Registry.BLOCK.get(new Identifier(MOD_ID,"aspen_log")).getDefaultState();
    private static final BlockState byg_blue_enchanted_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"blue_enchanted_leaves")).getDefaultState();
    private static final BlockState byg_blue_enchanted_log          = Registry.BLOCK.get(new Identifier(MOD_ID,"blue_enchanted_log")).getDefaultState();
    private static final BlockState byg_baobab_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"baobab_leaves")).getDefaultState();
    private static final BlockState byg_baobab_log          = Registry.BLOCK.get(new Identifier(MOD_ID,"baobab_log")).getDefaultState();
    private static final BlockState byg_pink_cherry_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"pink_cherry_leaves")).getDefaultState();
    private static final BlockState byg_white_cherry_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"white_cherry_leaves")).getDefaultState();
    private static final BlockState byg_cherry_log          = Registry.BLOCK.get(new Identifier(MOD_ID,"cherry_log")).getDefaultState();
    private static final BlockState byg_cika_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"cika_leaves")).getDefaultState();
    private static final BlockState byg_cika_log          = Registry.BLOCK.get(new Identifier(MOD_ID,"cika_log")).getDefaultState();
    private static final BlockState byg_cypress_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"cypress_leaves")).getDefaultState();
    private static final BlockState byg_cypress_log          = Registry.BLOCK.get(new Identifier(MOD_ID,"cypress_log")).getDefaultState();
    private static final BlockState byg_ebony_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"ebony_leaves")).getDefaultState();
    private static final BlockState byg_ebony_log          = Registry.BLOCK.get(new Identifier(MOD_ID,"ebony_log")).getDefaultState();
    private static final BlockState byg_fir_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"fir_leaves")).getDefaultState();
    private static final BlockState byg_fir_log          = Registry.BLOCK.get(new Identifier(MOD_ID,"fir_log")).getDefaultState();
    private static final BlockState byg_green_enchanted_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"green_enchanted_leaves")).getDefaultState();
    private static final BlockState byg_green_enchanted_log          = Registry.BLOCK.get(new Identifier(MOD_ID,"green_enchanted_log")).getDefaultState();
    private static final BlockState byg_holly_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"holly_leaves")).getDefaultState();
    private static final BlockState byg_holly_berry_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"holly_berry_leaves")).getDefaultState();
    private static final BlockState byg_holly_log          = Registry.BLOCK.get(new Identifier(MOD_ID,"holly_log")).getDefaultState();
    private static final BlockState byg_jacaranda_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"jacaranda_leaves")).getDefaultState();
    private static final BlockState byg_indigo_jacaranda_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"indigo_jacaranda_leaves")).getDefaultState();
    private static final BlockState byg_jacaranda_log          = Registry.BLOCK.get(new Identifier(MOD_ID,"jacaranda_log")).getDefaultState();
    private static final BlockState byg_mahogany_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"mahogany_leaves")).getDefaultState();
    private static final BlockState byg_mahogany_log          = Registry.BLOCK.get(new Identifier(MOD_ID,"mahogany_log")).getDefaultState();
    private static final BlockState byg_mangrove_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"mangrove_leaves")).getDefaultState();
    private static final BlockState byg_mangrove_log          = Registry.BLOCK.get(new Identifier(MOD_ID,"mangrove_log")).getDefaultState();
    private static final BlockState byg_maple_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"maple_leaves")).getDefaultState();
    private static final BlockState byg_red_maple_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"red_maple_leaves")).getDefaultState();
    private static final BlockState byg_silver_maple_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"silver_maple_leaves")).getDefaultState();
    private static final BlockState byg_maple_log          = Registry.BLOCK.get(new Identifier(MOD_ID,"maple_log")).getDefaultState();
    private static final BlockState byg_nightshade_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"nightshade_leaves")).getDefaultState();
    private static final BlockState byg_flowering_nightshade_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"flowering_nightshade_leaves")).getDefaultState();
    private static final BlockState byg_nightshade_log          = Registry.BLOCK.get(new Identifier(MOD_ID,"nightshade_log")).getDefaultState();
    private static final BlockState byg_palm_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"palm_leaves")).getDefaultState();
    private static final BlockState byg_palm_log          = Registry.BLOCK.get(new Identifier(MOD_ID,"palm_log")).getDefaultState();
    private static final BlockState byg_palo_verde_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"palo_verde_leaves")).getDefaultState();
    private static final BlockState byg_flowering_palo_verde_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"flowering_palo_verde_leaves")).getDefaultState();
    private static final BlockState byg_palo_verde_log          = Registry.BLOCK.get(new Identifier(MOD_ID,"palo_verde_log")).getDefaultState();
    private static final BlockState byg_pine_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"pine_leaves")).getDefaultState();
    private static final BlockState byg_pine_log          = Registry.BLOCK.get(new Identifier(MOD_ID,"pine_log")).getDefaultState();
    private static final BlockState byg_rainbow_eucalyptus_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"rainbow_eucalyptus_leaves")).getDefaultState();
    private static final BlockState byg_rainbow_eucalyptus_log          = Registry.BLOCK.get(new Identifier(MOD_ID,"rainbow_eucalyptus_log")).getDefaultState();
    private static final BlockState byg_redwood_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"redwood_leaves")).getDefaultState();
    private static final BlockState byg_redwood_log          = Registry.BLOCK.get(new Identifier(MOD_ID,"redwood_log")).getDefaultState();
    private static final BlockState byg_willow_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"willow_leaves")).getDefaultState();
    private static final BlockState byg_willow_log          = Registry.BLOCK.get(new Identifier(MOD_ID,"willow_log")).getDefaultState();


    private static final BlockState byg_lament_log       = Registry.BLOCK.get(new Identifier(MOD_ID,"byg_lament_log")).getDefaultState();
    private static final BlockState byg_lament_leaves          = Registry.BLOCK.get(new Identifier(MOD_ID,"byg_lament_leaves")).getDefaultState();
    private static final BlockState byg_skyris_log       = Registry.BLOCK.get(new Identifier(MOD_ID,"byg_skyris_log")).getDefaultState();
    private static final BlockState byg_skyris_leaves          = Registry.BLOCK.get(new Identifier(MOD_ID,"byg_skyris_leaves")).getDefaultState();
    private static final BlockState byg_green_apple_skyris_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"byg_green_apple_skyris_leaves")).getDefaultState();
    private static final BlockState byg_witch_hazel_log          = Registry.BLOCK.get(new Identifier(MOD_ID,"byg_witch_hazel_log")).getDefaultState();
    private static final BlockState byg_witch_hazel_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"byg_witch_hazel_leaves")).getDefaultState();
    private static final BlockState byg_blooming_witch_hazel_leaves          = Registry.BLOCK.get(new Identifier(MOD_ID,"byg_blooming_witch_hazel_leaves")).getDefaultState();
    private static final BlockState byg_zelkova_log       = Registry.BLOCK.get(new Identifier(MOD_ID,"byg_zelkova_log")).getDefaultState();
    private static final BlockState byg_zelkova_leaves          = Registry.BLOCK.get(new Identifier(MOD_ID,"byg_zelkova_leaves")).getDefaultState();
    private static final BlockState byg_withering_oak_log       = Registry.BLOCK.get(new Identifier(MOD_ID,"byg_withering_oak_log")).getDefaultState();
    private static final BlockState byg_withering_oak_leaves          = Registry.BLOCK.get(new Identifier(MOD_ID,"byg_withering_oak_leaves")).getDefaultState();
    private static final BlockState byg_araucaria_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"byg_araucaria_leaves")).getDefaultState();

    // no dedicated log types
    private static final BlockState byg_blue_spruce_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"blue_spruce_leaves")).getDefaultState();
    private static final BlockState byg_brown_birch_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"brown_birch_leaves")).getDefaultState();
    private static final BlockState byg_joshua_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"joshua_leaves")).getDefaultState();
    private static final BlockState byg_ripe_joshua_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"ripe_joshua_leaves")).getDefaultState();
    private static final BlockState byg_orange_birch_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"orange_birch_leaves")).getDefaultState();
    private static final BlockState byg_orange_oak_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"orange_oak_leaves")).getDefaultState();
    private static final BlockState byg_orange_spruce_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"orange_spruce_leaves")).getDefaultState();
    private static final BlockState byg_orchard_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"orchard_leaves")).getDefaultState();
    private static final BlockState byg_flowering_orchard_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"flowering_orchard_leaves")).getDefaultState();
    private static final BlockState byg_ripe_orchard_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"ripe_orchard_leaves")).getDefaultState();
    private static final BlockState byg_red_birch_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"red_birch_leaves")).getDefaultState();
    private static final BlockState byg_red_oak_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"red_oak_leaves")).getDefaultState();
    private static final BlockState byg_red_spruce_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"red_spruce_leaves")).getDefaultState();
    private static final BlockState byg_yellow_birch_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"yellow_birch_leaves")).getDefaultState();
    private static final BlockState byg_yellow_spruce_leaves       = Registry.BLOCK.get(new Identifier(MOD_ID,"yellow_spruce_leaves")).getDefaultState();

    // MEADOW
    private static final BlockState byg_meadow_dirt = Registry.BLOCK.get(new Identifier(MOD_ID,"meadow_dirt")).getDefaultState();
    private static final BlockState byg_meadow_grass_block = Registry.BLOCK.get(new Identifier(MOD_ID,"meadow_grass_block")).getDefaultState();

    // DACITE
    private static final BlockState byg_dacite = Registry.BLOCK.get(new Identifier(MOD_ID,"dacite")).getDefaultState();
    private static final BlockState byg_podzol_dacite = Registry.BLOCK.get(new Identifier(MOD_ID,"podzol_dacite")).getDefaultState();
    private static final BlockState byg_overgrown_dacite = Registry.BLOCK.get(new Identifier(MOD_ID,"overgrown_dacite")).getDefaultState();

    // VANILLA STONE VARIANTS
    private static final BlockState byg_overgrown_stone = Registry.BLOCK.get(new Identifier(MOD_ID,"overgrown_stone")).getDefaultState();
    private static final BlockState byg_mossy_stone = Registry.BLOCK.get(new Identifier(MOD_ID,"mossy_stone")).getDefaultState();

    // COMMON STONES
    private static final BlockState byg_red_rock = Registry.BLOCK.get(new Identifier(MOD_ID,"red_rock")).getDefaultState();
    private static final BlockState byg_rocky_stone = Registry.BLOCK.get(new Identifier(MOD_ID,"rocky_stone")).getDefaultState();
    private static final BlockState byg_scoria_stone = Registry.BLOCK.get(new Identifier(MOD_ID,"scoria_stone")).getDefaultState();
    private static final BlockState byg_soapstone = Registry.BLOCK.get(new Identifier(MOD_ID,"soapstone")).getDefaultState();

    // COLORED SAND
    private static final BlockState byg_black_sand = Registry.BLOCK.get(new Identifier(MOD_ID,"black_sand")).getDefaultState();
    private static final BlockState byg_white_sand = Registry.BLOCK.get(new Identifier(MOD_ID,"white_sand")).getDefaultState();
    private static final BlockState byg_blue_sand = Registry.BLOCK.get(new Identifier(MOD_ID,"blue_sand")).getDefaultState();
    private static final BlockState byg_purple_sand = Registry.BLOCK.get(new Identifier(MOD_ID,"purple_sand")).getDefaultState();
    private static final BlockState byg_pink_sand = Registry.BLOCK.get(new Identifier(MOD_ID,"pink_sand")).getDefaultState();

    // OTHERS
    private static final BlockState byg_peat = Registry.BLOCK.get(new Identifier(MOD_ID,"peat")).getDefaultState();
    private static final BlockState byg_mud_block = Registry.BLOCK.get(new Identifier(MOD_ID,"mud_block")).getDefaultState();
    private static final BlockState byg_black_ice = Registry.BLOCK.get(new Identifier(MOD_ID,"black_ice")).getDefaultState();
    private static final BlockState byg_packed_black_ice = Registry.BLOCK.get(new Identifier(MOD_ID,"packed_black_ice")).getDefaultState();

    // PLANTS
    // TODO
    private static final BlockState byg_blueberry_bush = Registry.BLOCK.get(new Identifier(MOD_ID,"blueberry_bush")).getDefaultState(); // => blue dye
    private static final BlockState byg_cattail = Registry.BLOCK.get(new Identifier(MOD_ID,"cattail")).getDefaultState();
    private static final BlockState byg_golden_spined_cactus = Registry.BLOCK.get(new Identifier(MOD_ID,"golden_spined_cactus")).getDefaultState();
    private static final BlockState byg_horseweed = Registry.BLOCK.get(new Identifier(MOD_ID,"horseweed")).getDefaultState();
    private static final BlockState byg_mini_cactus = Registry.BLOCK.get(new Identifier(MOD_ID,"mini_cactus")).getDefaultState();
    private static final BlockState byg_poison_ivy = Registry.BLOCK.get(new Identifier(MOD_ID,"poison_ivy")).getDefaultState();
    private static final BlockState byg_prickly_pear_cactus = Registry.BLOCK.get(new Identifier(MOD_ID,"prickly_pear_cactus")).getDefaultState();
    private static final BlockState byg_reeds = Registry.BLOCK.get(new Identifier(MOD_ID,"reeds")).getDefaultState(); // => brown dye

    // FLOWERS
    private static final BlockState byg_allium_flower_bush = Registry.BLOCK.get(new Identifier(MOD_ID,"allium_flower_bush")).getDefaultState();
    private static final BlockState byg_alpine_bellfower = Registry.BLOCK.get(new Identifier(MOD_ID,"alpine_bellfower")).getDefaultState();
    private static final BlockState byg_amaranth = Registry.BLOCK.get(new Identifier(MOD_ID,"amaranth")).getDefaultState();
    private static final BlockState byg_angelica = Registry.BLOCK.get(new Identifier(MOD_ID,"angelica")).getDefaultState();
    private static final BlockState byg_azalea = Registry.BLOCK.get(new Identifier(MOD_ID,"azalea")).getDefaultState();
    private static final BlockState byg_begonia = Registry.BLOCK.get(new Identifier(MOD_ID,"begonia")).getDefaultState();
    private static final BlockState byg_bistort = Registry.BLOCK.get(new Identifier(MOD_ID,"bistort")).getDefaultState();
    private static final BlockState byg_black_rose = Registry.BLOCK.get(new Identifier(MOD_ID,"black_rose")).getDefaultState();
    private static final BlockState byg_blue_sage = Registry.BLOCK.get(new Identifier(MOD_ID,"blue_sage")).getDefaultState();
    private static final BlockState byg_california_poppy = Registry.BLOCK.get(new Identifier(MOD_ID,"california_poppy")).getDefaultState();
    private static final BlockState byg_crocus = Registry.BLOCK.get(new Identifier(MOD_ID,"crocus")).getDefaultState();
    private static final BlockState byg_cyan_amaranth = Registry.BLOCK.get(new Identifier(MOD_ID,"cyan_amaranth")).getDefaultState();
    private static final BlockState byg_cyan_rose = Registry.BLOCK.get(new Identifier(MOD_ID,"cyan_rose")).getDefaultState();
    private static final BlockState byg_cyan_tulip = Registry.BLOCK.get(new Identifier(MOD_ID,"cyan_tulip")).getDefaultState();
    private static final BlockState byg_daffodil = Registry.BLOCK.get(new Identifier(MOD_ID,"daffodil")).getDefaultState();
    private static final BlockState byg_delphinium = Registry.BLOCK.get(new Identifier(MOD_ID,"delphinium")).getDefaultState();
    private static final BlockState byg_fairy_slipper = Registry.BLOCK.get(new Identifier(MOD_ID,"fairy_slipper")).getDefaultState();
    private static final BlockState byg_firecrasker_flower_bush = Registry.BLOCK.get(new Identifier(MOD_ID,"firecrasker_flower_bush")).getDefaultState();
    private static final BlockState byg_foxglove = Registry.BLOCK.get(new Identifier(MOD_ID,"foxglove")).getDefaultState();
    private static final BlockState byg_green_tulip = Registry.BLOCK.get(new Identifier(MOD_ID,"green_tulip")).getDefaultState();
    private static final BlockState byg_guzmania = Registry.BLOCK.get(new Identifier(MOD_ID,"guzmania")).getDefaultState();
    private static final BlockState byg_incan_lily = Registry.BLOCK.get(new Identifier(MOD_ID,"incan_lily")).getDefaultState();
    private static final BlockState byg_iris = Registry.BLOCK.get(new Identifier(MOD_ID,"iris")).getDefaultState();
    private static final BlockState byg_japanese_orchid = Registry.BLOCK.get(new Identifier(MOD_ID,"japanese_orchid")).getDefaultState();
    private static final BlockState byg_kovan_flower = Registry.BLOCK.get(new Identifier(MOD_ID,"kovan_flower")).getDefaultState();
    private static final BlockState byg_lazarus_bellflower = Registry.BLOCK.get(new Identifier(MOD_ID,"lazarus_bellflower")).getDefaultState();
    private static final BlockState byg_lolipop_flower = Registry.BLOCK.get(new Identifier(MOD_ID,"lolipop_flower")).getDefaultState();
    private static final BlockState byg_magenta_amaranth = Registry.BLOCK.get(new Identifier(MOD_ID,"magenta_amaranth")).getDefaultState();
    private static final BlockState byg_magenta_tulip = Registry.BLOCK.get(new Identifier(MOD_ID,"magenta_tulip")).getDefaultState();
    private static final BlockState byg_orange_amaranth = Registry.BLOCK.get(new Identifier(MOD_ID,"orange_amaranth")).getDefaultState();
    private static final BlockState byg_orange_daisy = Registry.BLOCK.get(new Identifier(MOD_ID,"orange_daisy")).getDefaultState();
    private static final BlockState byg_osiria_rose = Registry.BLOCK.get(new Identifier(MOD_ID,"osiria_rose")).getDefaultState();
    private static final BlockState byg_peach_leather_flower = Registry.BLOCK.get(new Identifier(MOD_ID,"peach_leather_flower")).getDefaultState();
    private static final BlockState byg_pink_allium = Registry.BLOCK.get(new Identifier(MOD_ID,"pink_allium")).getDefaultState();
    private static final BlockState byg_pink_allium_flower_bush = Registry.BLOCK.get(new Identifier(MOD_ID,"pink_allium_flower_bush")).getDefaultState();
    private static final BlockState byg_pink_anemone = Registry.BLOCK.get(new Identifier(MOD_ID,"pink_anemone")).getDefaultState();
    private static final BlockState byg_pink_daffodil = Registry.BLOCK.get(new Identifier(MOD_ID,"pink_daffodil")).getDefaultState();
    private static final BlockState byg_pink_orchid = Registry.BLOCK.get(new Identifier(MOD_ID,"pink_orchid")).getDefaultState();
    private static final BlockState byg_protea_flower = Registry.BLOCK.get(new Identifier(MOD_ID,"protea_flower")).getDefaultState();
    private static final BlockState byg_purple_amaranth = Registry.BLOCK.get(new Identifier(MOD_ID,"purple_amaranth")).getDefaultState();
    private static final BlockState byg_purple_orchid = Registry.BLOCK.get(new Identifier(MOD_ID,"purple_orchid")).getDefaultState();
    private static final BlockState byg_purple_sage = Registry.BLOCK.get(new Identifier(MOD_ID,"purple_sage")).getDefaultState();
    private static final BlockState byg_purple_tulip = Registry.BLOCK.get(new Identifier(MOD_ID,"purple_tulip")).getDefaultState();
    private static final BlockState byg_red_cornflower = Registry.BLOCK.get(new Identifier(MOD_ID,"red_cornflower")).getDefaultState();
    private static final BlockState byg_red_orchid = Registry.BLOCK.get(new Identifier(MOD_ID,"red_orchid")).getDefaultState();
    private static final BlockState byg_richea = Registry.BLOCK.get(new Identifier(MOD_ID,"richea")).getDefaultState();
    private static final BlockState byg_rose = Registry.BLOCK.get(new Identifier(MOD_ID,"rose")).getDefaultState();
    private static final BlockState byg_silver_vase_flower = Registry.BLOCK.get(new Identifier(MOD_ID,"silver_vase_flower")).getDefaultState();
    private static final BlockState byg_snowdrops = Registry.BLOCK.get(new Identifier(MOD_ID,"snowdrops")).getDefaultState();
    private static final BlockState byg_torch_ginger = Registry.BLOCK.get(new Identifier(MOD_ID,"torch_ginger")).getDefaultState();
    private static final BlockState byg_violet_leather_flower = Registry.BLOCK.get(new Identifier(MOD_ID,"violet_leather_flower")).getDefaultState();
    private static final BlockState byg_white_anemone = Registry.BLOCK.get(new Identifier(MOD_ID,"white_anemone")).getDefaultState();
    private static final BlockState byg_white_sage = Registry.BLOCK.get(new Identifier(MOD_ID,"white_sage")).getDefaultState();
    private static final BlockState byg_winter_cyclamen = Registry.BLOCK.get(new Identifier(MOD_ID,"winter_cyclamen")).getDefaultState();
    private static final BlockState byg_winter_rose = Registry.BLOCK.get(new Identifier(MOD_ID,"winter_rose")).getDefaultState();
    private static final BlockState byg_winter_scilla = Registry.BLOCK.get(new Identifier(MOD_ID,"winter_scilla")).getDefaultState();
    private static final BlockState byg_yellow_daffodil = Registry.BLOCK.get(new Identifier(MOD_ID,"yellow_daffodil")).getDefaultState();
    private static final BlockState byg_yellow_tulip = Registry.BLOCK.get(new Identifier(MOD_ID,"yellow_tulip")).getDefaultState();

    // TALL FLOWERS
    private static final BlockState byg_tall_allium = Registry.BLOCK.get(new Identifier(MOD_ID,"tall_allium")).getDefaultState();
    private static final BlockState byg_tall_pink_allium = Registry.BLOCK.get(new Identifier(MOD_ID,"tall_pink_allium")).getDefaultState();

    public static boolean shouldGenerate() {
        return FabricLoader.getInstance().isModLoaded(MOD_ID) && StarrySkyCommon.STARRY_SKY_CONFIG.generateBYGSpheroids;
    }

    public static void setup(SpheroidLoader spheroidLoader) {

        ArrayList<BlockState> coloredSand = new ArrayList<BlockState>() {{
            add(byg_black_sand);
            add(byg_white_sand);
            add(byg_blue_sand);
            add(byg_purple_sand);
            add(byg_pink_sand);
        }};

        // VERY RARE ORES
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.ORE, 0.01F, new CoreSpheroidType(null, byg_ametrine_ore, MAP_STONES, 5, 6, 2, 3));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.ORE, 0.01F, new CoreSpheroidType(null, byg_pendorite_ore, MAP_STONES, 5, 6, 2, 3));

        // WOOD
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.5F, new ShellSpheroidType(null, byg_mahogany_log, byg_mahogany_leaves, 7, 14, 2, 4));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.4F, new ShellSpheroidType(null, byg_rainbow_eucalyptus_log, byg_rainbow_eucalyptus_leaves, 8, 15, 2, 3));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.5F, new ShellSpheroidType(null, byg_fir_log, byg_fir_leaves, 10, 14, 3, 4));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.5F, new ShellSpheroidType(null, byg_aspen_log, byg_aspen_leaves, 6, 10, 2, 2));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.5F, new ShellSpheroidType(null, byg_baobab_log, byg_baobab_leaves, 10, 15, 2, 3));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.1F, new ShellSpheroidType(null, byg_blue_enchanted_log, byg_blue_enchanted_leaves, 6, 9, 2, 3));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.1F, new ShellSpheroidType(null, byg_green_enchanted_log, byg_green_enchanted_leaves, 6, 9, 2, 3));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.3F, new ShellSpheroidType(null, byg_cherry_log, byg_pink_cherry_leaves, 9, 13, 2, 3));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.3F, new ShellSpheroidType(null, byg_cherry_log, byg_white_cherry_leaves, 9, 13, 2, 3));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.5F, new ShellSpheroidType(null, byg_cika_log, byg_cika_leaves, 8, 16, 2, 3));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.5F, new ShellSpheroidType(null, byg_cypress_log, byg_cypress_leaves, 7, 10, 2, 3));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.5F, new ShellSpheroidType(null, byg_ebony_log, byg_ebony_leaves, 8, 11, 2, 3));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.3F, new ShellSpheroidType(null, byg_jacaranda_log, byg_indigo_jacaranda_leaves, 7, 11, 3, 4));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.3F, new ShellSpheroidType(null, byg_jacaranda_log, byg_jacaranda_leaves, 7, 11, 3, 4));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.5F, new ShellSpheroidType(null, byg_lament_log, byg_lament_leaves, 6, 9, 2, 2));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.5F, new ShellSpheroidType(null, byg_mangrove_log, byg_mangrove_leaves, 7, 10, 2, 3));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.3F, new ShellSpheroidType(null, byg_maple_log, byg_maple_leaves, 7, 11, 2, 3));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.3F, new ShellSpheroidType(null, byg_maple_log, byg_red_maple_leaves, 7, 13, 2, 3));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.3F, new ShellSpheroidType(null, byg_maple_log, byg_silver_maple_leaves, 7, 13, 2, 3));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.5F, new ShellSpheroidType(null, byg_palm_log, byg_palm_leaves, 6, 12, 2, 3));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.5F, new ShellSpheroidType(null, byg_palo_verde_log, byg_palo_verde_leaves, 7, 10, 2, 3).addShellSpeckles(byg_flowering_palo_verde_leaves, 0.2F));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.5F, new ShellSpheroidType(null, byg_skyris_log, byg_skyris_leaves, 7, 10, 2, 2).addShellSpeckles(byg_green_apple_skyris_leaves, 0.08F));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.5F, new ShellSpheroidType(null, byg_witch_hazel_log, byg_witch_hazel_leaves, 7, 10, 2, 2).addShellSpeckles(byg_blooming_witch_hazel_leaves, 0.08F));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.5F, new ShellSpheroidType(null, byg_pine_log, byg_pine_leaves, 8, 15, 2, 3));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.5F, new ShellSpheroidType(null, byg_redwood_log, byg_redwood_leaves, 13, 17, 2, 3));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.5F, new ShellSpheroidType(null, byg_willow_log, byg_willow_leaves, 7, 11, 2, 3));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.9F, new ShellSpheroidType(null, byg_zelkova_log, byg_zelkova_leaves, 6, 10, 1, 2));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.9F, new ShellSpheroidType(null, byg_withering_oak_log, byg_withering_oak_leaves, 5, 7, 1, 1));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.9F, new ShellSpheroidType(null, byg_pine_log, byg_araucaria_leaves, 7, 13, 2, 3));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.9F, new ShellSpheroidType(null, byg_holly_log, byg_holly_leaves, 7, 13, 2, 3).addShellSpeckles(byg_holly_berry_leaves, 0.2F));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.5F, new ShellSpheroidType(null, byg_nightshade_log, byg_nightshade_leaves, 7, 13, 2, 3));

        // WOOD USING OAK LOGS
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.8F, new ShellSpheroidType(null, Blocks.OAK_LOG.getDefaultState(), byg_joshua_leaves, 6, 8, 1, 1).addShellSpeckles(byg_ripe_joshua_leaves, 0.15F));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 1.0F, new ShellSpheroidType(null, Blocks.OAK_LOG.getDefaultState(), byg_orchard_leaves, 7, 14, 2, 3).addShellSpeckles(byg_flowering_orchard_leaves, 0.15F).addShellSpeckles(byg_ripe_orchard_leaves, 0.15F));

        // ALTERNATE LEAF TYPES
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.4F, new ShellSpheroidType(null, Blocks.SPRUCE_LOG.getDefaultState(), byg_blue_spruce_leaves,   5, 15, 2, 3));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.4F, new ShellSpheroidType(null, Blocks.SPRUCE_LOG.getDefaultState(), byg_red_spruce_leaves,   5, 15, 2, 3));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.4F, new ShellSpheroidType(null, Blocks.SPRUCE_LOG.getDefaultState(), byg_yellow_spruce_leaves,   5, 15, 2, 3));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.4F, new ShellSpheroidType(null, Blocks.SPRUCE_LOG.getDefaultState(), byg_orange_spruce_leaves,   5, 15, 2, 3));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.4F, new ShellSpheroidType(null, Blocks.BIRCH_LOG.getDefaultState(), byg_brown_birch_leaves,    5, 15, 2, 3));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.4F, new ShellSpheroidType(null, Blocks.BIRCH_LOG.getDefaultState(), byg_orange_birch_leaves,    5, 15, 2, 3));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.4F, new ShellSpheroidType(null, Blocks.BIRCH_LOG.getDefaultState(), byg_red_birch_leaves,    5, 15, 2, 3));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.4F, new ShellSpheroidType(null, Blocks.BIRCH_LOG.getDefaultState(), byg_yellow_birch_leaves,    5, 15, 2, 3));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.4F, new ShellSpheroidType(null, Blocks.OAK_LOG.getDefaultState(), byg_orange_oak_leaves,      8, 15, 2, 3));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.WOOD, 0.4F, new ShellSpheroidType(null, Blocks.OAK_LOG.getDefaultState(), byg_red_oak_leaves,      8, 15, 2, 3));

        // OTHER SPHEROID TYPES
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.DECORATIVE, 0.5F, new ModularSpheroidType(null, byg_meadow_dirt, 5, 14).setTopBlockState(byg_meadow_grass_block));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.DECORATIVE, 0.5F, new ModularSpheroidType(null, byg_dacite, 8, 14).setTopBlockState(byg_overgrown_dacite));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.DECORATIVE, 0.5F, new ModularSpheroidType(null, byg_dacite, 8, 12).setTopBlockState(byg_podzol_dacite).addDecorator(SpheroidDecorators.BAMBOO, 0.2F));

        spheroidLoader.registerSpheroidType(SpheroidDistributionType.DECORATIVE, 0.5F, new SupportedRainbowSpheroidType(null, coloredSand, Blocks.SANDSTONE.getDefaultState(), 9, 14));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.DECORATIVE, 0.5F, new LiquidSpheroidType(null, Blocks.WATER.getDefaultState(), MAP_GLASS, 8, 13, 1, 2, 70, 100, 75).setCoreBlock(byg_mud_block, 4, 6));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.DECORATIVE, 0.4F, new ModularSpheroidType(null, byg_peat, 6, 11));
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.DECORATIVE, 0.1F, new CoreSpheroidType(null, byg_packed_black_ice, byg_black_ice, 7, 13, 3, 5));


        // FLOWERS
        SpheroidList.LIST_FLOWERS.add(byg_allium_flower_bush);
        SpheroidList.LIST_FLOWERS.add(byg_alpine_bellfower);
        SpheroidList.LIST_FLOWERS.add(byg_amaranth);
        SpheroidList.LIST_FLOWERS.add(byg_angelica);
        SpheroidList.LIST_FLOWERS.add(byg_azalea);
        SpheroidList.LIST_FLOWERS.add(byg_begonia);
        SpheroidList.LIST_FLOWERS.add(byg_bistort);
        SpheroidList.LIST_FLOWERS.add(byg_black_rose);
        SpheroidList.LIST_FLOWERS.add(byg_blue_sage);
        SpheroidList.LIST_FLOWERS.add(byg_california_poppy);
        SpheroidList.LIST_FLOWERS.add(byg_crocus);
        SpheroidList.LIST_FLOWERS.add(byg_cyan_amaranth);
        SpheroidList.LIST_FLOWERS.add(byg_cyan_rose);
        SpheroidList.LIST_FLOWERS.add(byg_cyan_tulip);
        SpheroidList.LIST_FLOWERS.add(byg_daffodil);
        SpheroidList.LIST_FLOWERS.add(byg_delphinium);
        SpheroidList.LIST_FLOWERS.add(byg_fairy_slipper);
        SpheroidList.LIST_FLOWERS.add(byg_firecrasker_flower_bush);
        SpheroidList.LIST_FLOWERS.add(byg_foxglove);
        SpheroidList.LIST_FLOWERS.add(byg_green_tulip);
        SpheroidList.LIST_FLOWERS.add(byg_guzmania);
        SpheroidList.LIST_FLOWERS.add(byg_incan_lily);
        SpheroidList.LIST_FLOWERS.add(byg_iris);
        SpheroidList.LIST_FLOWERS.add(byg_japanese_orchid);
        SpheroidList.LIST_FLOWERS.add(byg_kovan_flower);
        SpheroidList.LIST_FLOWERS.add(byg_lazarus_bellflower);
        SpheroidList.LIST_FLOWERS.add(byg_lolipop_flower);
        SpheroidList.LIST_FLOWERS.add(byg_magenta_amaranth);
        SpheroidList.LIST_FLOWERS.add(byg_magenta_tulip);
        SpheroidList.LIST_FLOWERS.add(byg_orange_amaranth);
        SpheroidList.LIST_FLOWERS.add(byg_orange_daisy);
        SpheroidList.LIST_FLOWERS.add(byg_osiria_rose);
        SpheroidList.LIST_FLOWERS.add(byg_peach_leather_flower);
        SpheroidList.LIST_FLOWERS.add(byg_pink_allium);
        SpheroidList.LIST_FLOWERS.add(byg_pink_allium_flower_bush);
        SpheroidList.LIST_FLOWERS.add(byg_pink_anemone);
        SpheroidList.LIST_FLOWERS.add(byg_pink_daffodil);
        SpheroidList.LIST_FLOWERS.add(byg_pink_orchid);
        SpheroidList.LIST_FLOWERS.add(byg_protea_flower);
        SpheroidList.LIST_FLOWERS.add(byg_purple_amaranth);
        SpheroidList.LIST_FLOWERS.add(byg_purple_orchid);
        SpheroidList.LIST_FLOWERS.add(byg_purple_sage);
        SpheroidList.LIST_FLOWERS.add(byg_purple_tulip);
        SpheroidList.LIST_FLOWERS.add(byg_red_cornflower);
        SpheroidList.LIST_FLOWERS.add(byg_red_orchid);
        SpheroidList.LIST_FLOWERS.add(byg_richea);
        SpheroidList.LIST_FLOWERS.add(byg_rose);
        SpheroidList.LIST_FLOWERS.add(byg_silver_vase_flower);
        SpheroidList.LIST_FLOWERS.add(byg_snowdrops);
        SpheroidList.LIST_FLOWERS.add(byg_torch_ginger);
        SpheroidList.LIST_FLOWERS.add(byg_violet_leather_flower);
        SpheroidList.LIST_FLOWERS.add(byg_white_anemone);
        SpheroidList.LIST_FLOWERS.add(byg_white_sage);
        SpheroidList.LIST_FLOWERS.add(byg_winter_cyclamen);
        SpheroidList.LIST_FLOWERS.add(byg_winter_rose);
        SpheroidList.LIST_FLOWERS.add(byg_winter_scilla);
        SpheroidList.LIST_FLOWERS.add(byg_yellow_daffodil);
        SpheroidList.LIST_FLOWERS.add(byg_yellow_tulip);

        // TALL FLOWERS
        SpheroidList.LIST_TALL_FLOWERS.add(byg_tall_allium);
        SpheroidList.LIST_TALL_FLOWERS.add(byg_tall_pink_allium);

        SpheroidList.MAP_STONES.put(byg_red_rock, 0.5F);
        SpheroidList.MAP_STONES.put(byg_rocky_stone, 0.5F);
        SpheroidList.MAP_STONES.put(byg_scoria_stone, 0.5F);
        SpheroidList.MAP_STONES.put(byg_soapstone, 0.5F);

        SpheroidList.MAP_DUNGEON_STONES.put(byg_overgrown_stone, 1.0F);
        SpheroidList.MAP_DUNGEON_STONES.put(byg_mossy_stone, 1.0F);

    }
}
