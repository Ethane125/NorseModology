package mod.ethane.norsemodology.item;

import mod.ethane.norsemodology.NorseModology;
import mod.ethane.norsemodology.init.ModItemGroups;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            new DeferredRegister<>(ForgeRegistries.ITEMS, NorseModology.MODID);

    public static final RegistryObject<Item> air_crystal = ITEMS.register("air_crystal",
            ()-> new ItemAirCrystal(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));

    public static final RegistryObject<Item> fire_crystal = ITEMS.register("fire_crystal",
            ()-> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));

    public static final RegistryObject<Item> water_crystal = ITEMS.register("water_crystal",
            ()-> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
}
