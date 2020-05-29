package mod.ethane.norsemodology.init;

import mod.ethane.norsemodology.NorseModology;
import mod.ethane.norsemodology.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import java.util.function.Supplier;

public class ModItemGroups
{
    public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(NorseModology.MODID, () -> new ItemStack(ModBlocks.air_crystal_ore.get()));

    public static class ModItemGroup extends ItemGroup
    {

        private final Supplier<ItemStack> iconSupplier;

        public ModItemGroup(final String name, final Supplier<ItemStack> iconSupplier) {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Override
        public ItemStack createIcon() {
            return iconSupplier.get();
        }
    }
}
