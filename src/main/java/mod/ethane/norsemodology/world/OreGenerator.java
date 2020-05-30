package mod.ethane.norsemodology.world;

import mod.ethane.norsemodology.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.ReplaceBlockConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGenerator {
    private static int veinsize = 8;

    public static void setupOreGen(){
        for(Biome biome : ForgeRegistries.BIOMES){
            if(biome.getCategory() == Biome.Category.NETHER){
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.fire_crystal_ore.get().getDefaultState(),veinsize))
                .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(16, 10, 20, 128))));
            }else {
                if(biome.getCategory() == Biome.Category.OCEAN){
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.EMERALD_ORE.withConfiguration(
                            new ReplaceBlockConfig(Blocks.GRAVEL.getDefaultState(),ModBlocks.water_crystal_gravel_ore.get().getDefaultState()))
                            .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(32, 10, 20, 128))));

                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.EMERALD_ORE.withConfiguration(
                            new ReplaceBlockConfig(Blocks.SAND.getDefaultState(),ModBlocks.water_crystal_sand_ore.get().getDefaultState()))
                            .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(32, 10, 20, 128))));
                } else {
                    if(biome.getCategory() != Biome.Category.THEEND){
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                                new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.air_crystal_ore.get().getDefaultState(),veinsize))
                                .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(16, 110, 20, 150))));
                    }
                }


            }


        }
    }
}

//.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(
// new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, Blocks.NETHER_QUARTZ_ORE.getDefaultState(), 14))
// .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(16, 10, 20, 128))));