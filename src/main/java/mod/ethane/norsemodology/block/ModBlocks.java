package mod.ethane.norsemodology.block;

import mod.ethane.norsemodology.NorseModology;
import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.material.Material;
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

    public static final RegistryObject<BaseOre> water_crystal_ore = BLOCKS.register("water_crystal_ore",
            () -> new BaseOre(Block.Properties.create(Material.ROCK)
                    .hardnessAndResistance( 7.0F, 3.0F)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(3)));
}
