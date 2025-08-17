package net.kuko.nikamod.item;

import net.kuko.nikamod.OwnerHolder;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.UUID;


public abstract class FruitItem extends Item {
    public OwnerHolder ownerHolder = new OwnerHolder();
    public FruitItem(Settings settings, FoodComponent foodComponent) {
        super(settings.food(foodComponent));
    }

    // maxTier
    public int getMaxTier(ItemStack stack) {
        return stack.getOrCreateNbt().getInt("MaxTier");
    }

    public void setMaxTier(ItemStack stack, int maxTier) {
        stack.getOrCreateNbt().putInt("MaxTier", maxTier);
    }

    // owner;
    // This will save to an NBT the owner of the itemstack.
    public UUID getOwner(ItemStack stack) {
        NbtCompound tag = stack.getOrCreateNbt();
        if (tag.contains("Owner")) {
            return tag.getUuid("Owner");
        }
        return null;
    }

    public void setOwner(ItemStack stack, UUID owner) {
        stack.getOrCreateNbt().putUuid("Owner", owner);
    }

//    @Override
//    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
//        UUID uuidOfEntity = user.getUuid();
//        ItemStack stack = user.getStackInHand(hand);
//
//        if (ownerHolder.().containsKey(uuidOfEntity)) {
//            return super.use(world, user, hand);
//        }
//        return TypedActionResult.fail(stack);
//    }


    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        return super.use(world, user, hand);
    }
}
