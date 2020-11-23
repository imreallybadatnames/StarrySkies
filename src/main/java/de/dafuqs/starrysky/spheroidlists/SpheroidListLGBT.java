package de.dafuqs.starrysky.spheroidlists;

import de.dafuqs.starrysky.dimension.SpheroidDistributionType;
import de.dafuqs.starrysky.dimension.SpheroidLoader;
import de.dafuqs.starrysky.StarrySkyCommon;
import de.dafuqs.starrysky.spheroidtypes.StripesSpheroidType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;

import java.util.ArrayList;

public class SpheroidListLGBT extends SpheroidList {

    private static final ArrayList<BlockState> LIST_GAY = new ArrayList<BlockState>() {{
        add(Blocks.RED_WOOL.getDefaultState());
        add(Blocks.ORANGE_WOOL.getDefaultState());
        add(Blocks.YELLOW_WOOL.getDefaultState());
        add(Blocks.GREEN_WOOL.getDefaultState());
        add(Blocks.CYAN_WOOL.getDefaultState());
        add(Blocks.PURPLE_WOOL.getDefaultState());
    }};

    private static final ArrayList<BlockState> LIST_BI = new ArrayList<BlockState>() {{
        add(Blocks.MAGENTA_WOOL.getDefaultState());
        add(Blocks.PURPLE_WOOL.getDefaultState());
        add(Blocks.BLUE_WOOL.getDefaultState());
    }};

    private static final ArrayList<BlockState> LIST_PAN = new ArrayList<BlockState>() {{
        add(Blocks.MAGENTA_WOOL.getDefaultState());
        add(Blocks.YELLOW_WOOL.getDefaultState());
        add(Blocks.LIGHT_BLUE_WOOL.getDefaultState());
    }};

    private static final ArrayList<BlockState> LIST_ASEXUAL = new ArrayList<BlockState>() {{
        add(Blocks.BLACK_WOOL.getDefaultState());
        add(Blocks.GRAY_WOOL.getDefaultState());
        add(Blocks.WHITE_WOOL.getDefaultState());
        add(Blocks.PURPLE_WOOL.getDefaultState());
    }};

    private static final ArrayList<BlockState> LIST_GENDERQUEER = new ArrayList<BlockState>() {{
        add(Blocks.PURPLE_WOOL.getDefaultState());
        add(Blocks.WHITE_WOOL.getDefaultState());
        add(Blocks.GREEN_WOOL.getDefaultState());
    }};

    private static final ArrayList<BlockState> LIST_TRANSGENDER = new ArrayList<BlockState>() {{
        add(Blocks.LIGHT_BLUE_WOOL.getDefaultState());
        add(Blocks.PINK_WOOL.getDefaultState());
        add(Blocks.WHITE_WOOL.getDefaultState());
        add(Blocks.PINK_WOOL.getDefaultState());
        add(Blocks.LIGHT_BLUE_WOOL.getDefaultState());
    }};

    private static final ArrayList<BlockState> LIST_NONBINARY = new ArrayList<BlockState>() {{
        add(Blocks.YELLOW_WOOL.getDefaultState());
        add(Blocks.WHITE_WOOL.getDefaultState());
        add(Blocks.PURPLE_WOOL.getDefaultState());
        add(Blocks.BLACK_WOOL.getDefaultState());
    }};

    public static boolean shouldGenerate() {
        return StarrySkyCommon.STARRY_SKY_CONFIG.generatePrideSpheroids;
    }

    public static void setup(SpheroidLoader spheroidLoader) {
        StripesSpheroidType PRIDE_GAY = new StripesSpheroidType(null,  6, 12, LIST_GAY);
        StripesSpheroidType PRIDE_BI = new StripesSpheroidType(null, 6, 12, LIST_BI);
        StripesSpheroidType PRIDE_PAN = new StripesSpheroidType(null, 6, 12, LIST_PAN);
        StripesSpheroidType PRIDE_ASEXUAL = new StripesSpheroidType(null, 6, 12, LIST_ASEXUAL);
        StripesSpheroidType PRIDE_GENDERQUEER = new StripesSpheroidType(null, 6, 12, LIST_GENDERQUEER);
        StripesSpheroidType PRIDE_TRANSGENDER = new StripesSpheroidType(null, 6, 12, LIST_TRANSGENDER);
        StripesSpheroidType PRIDE_NONBINARY = new StripesSpheroidType(null, 6, 12, LIST_NONBINARY);

        spheroidLoader.registerSpheroidType(SpheroidDistributionType.DECORATIVE, 0.5F, PRIDE_GAY);
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.DECORATIVE, 0.5F, PRIDE_BI);
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.DECORATIVE, 0.5F, PRIDE_PAN);
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.DECORATIVE, 0.5F, PRIDE_ASEXUAL);
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.DECORATIVE, 0.5F, PRIDE_GENDERQUEER);
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.DECORATIVE, 0.5F, PRIDE_TRANSGENDER);
        spheroidLoader.registerSpheroidType(SpheroidDistributionType.DECORATIVE, 0.5F, PRIDE_NONBINARY);
    }

}
