package mod.ethane.norsemodology.block;

import mod.ethane.norsemodology.NorseModology;
import net.minecraft.block.Block;
import net.minecraft.block.GravelBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, NorseModology.MODID);

    public static final RegistryObject<BaseOre> air_crystal_ore = BLOCKS.register("air_crystal_ore",
            () -> new BaseOre(Block.Properties.create(Material.ROCK)
                    .hardnessAndResistance( 7.0F, 3.0F)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(3)));

    public static final RegistryObject<BaseOre> fire_crystal_ore = BLOCKS.register("fire_crystal_ore",
            () -> new BaseOre(Block.Properties.create(Material.ROCK)
                    .hardnessAndResistance( 7.0F, 3.0F)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(3)));

    public static final RegistryObject<BaseGravelOre> water_crystal_gravel_ore = BLOCKS.register("water_crystal_gravel_ore",
            () -> new BaseGravelOre(Block.Properties.create(Material.ROCK, MaterialColor.STONE) //TODO probs shouldn't be ROCK but needs to require tool.
                    .sound(SoundType.GROUND)
                    .hardnessAndResistance( 7.0F, 3.0F)
                    .harvestTool(ToolType.SHOVEL).harvestLevel(3)));

    public static final RegistryObject<BaseSandOre> water_crystal_sand_ore = BLOCKS.register("water_crystal_sand_ore",
            () -> new BaseSandOre(Block.Properties.create(Material.ROCK, MaterialColor.SAND) //TODO probs shouldn't be ROCK but needs to require tool.
                    .sound(SoundType.SAND)
                    .hardnessAndResistance( 7.0F, 3.0F)
                    .harvestTool(ToolType.SHOVEL).harvestLevel(3)));
}
