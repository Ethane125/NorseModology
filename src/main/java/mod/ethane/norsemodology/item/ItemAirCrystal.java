package mod.ethane.norsemodology.item;

import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.*;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class ItemAirCrystal extends Item {

    public ItemAirCrystal(Properties properties) {
        super(properties);
    }


    public static RayTraceResult rayTrace1(World worldIn, PlayerEntity player, RayTraceContext.FluidMode fluidMode) {
        float f = player.rotationPitch;
        float f1 = player.rotationYaw;
        Vec3d vec3d = player.getEyePosition(1.0F);
        float f2 = MathHelper.cos(-f1 * ((float)Math.PI / 180F) - (float)Math.PI);
        float f3 = MathHelper.sin(-f1 * ((float)Math.PI / 180F) - (float)Math.PI);
        float f4 = -MathHelper.cos(-f * ((float)Math.PI / 180F));
        float f5 = MathHelper.sin(-f * ((float)Math.PI / 180F));
        float f6 = f3 * f4;
        float f7 = f2 * f4;
        double d0 = 60; //player.getAttribute(PlayerEntity.REACH_DISTANCE).getValue();
        Vec3d vec3d1 = vec3d.add((double)f6 * d0, (double)f5 * d0, (double)f7 * d0);
        return worldIn.rayTraceBlocks(new RayTraceContext(vec3d, vec3d1, RayTraceContext.BlockMode.OUTLINE, fluidMode, player));
    }

    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack itemstack = playerIn.getHeldItem(handIn);
        if (worldIn instanceof ServerWorld) {
            //BlockPos pos = ((BlockRayTraceResult) rayTrace(worldIn, playerIn, RayTraceContext.FluidMode.NONE)).getPos();
            BlockPos pos = ((BlockRayTraceResult) rayTrace1(worldIn, playerIn, RayTraceContext.FluidMode.NONE)).getPos();
            //worldIn.addLightning(new EntityLightningBolt(worldIn, pos.getX(), pos.getY(), pos.getZ(), false));
            ((ServerWorld)worldIn).addLightningBolt(new LightningBoltEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), false));
            itemstack.shrink(1);
            return ActionResult.resultSuccess(itemstack);
        }
        return ActionResult.resultFail(itemstack);
    }

}
