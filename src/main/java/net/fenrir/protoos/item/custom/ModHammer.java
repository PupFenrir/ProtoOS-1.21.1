package net.fenrir.protoos.item.custom;

import net.fenrir.protoos.util.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.*;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ModHammer extends DiggerItem
{
    public ModHammer(Tier pTier, Properties pProperties)
    {
        super(pTier, ModTags.Blocks.NEEDS_HAMMER, pProperties);
    }

    public static List<BlockPos> getBlocksToBeDestroyed(int range, BlockPos initalBlockPos, ServerPlayer player) {
        List<BlockPos> positions = new ArrayList<>();

        BlockHitResult traceResult = player.level().clip(new ClipContext(player.getEyePosition(1f),
                (player.getEyePosition(1f).add(player.getViewVector(1f).scale(6f))),
                ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, player));
        if (traceResult.getType() == HitResult.Type.MISS) {
            return positions;
        }

        Direction face = traceResult.getDirection();
        for (int x = -range; x <= range; x++) {
            for (int y = -range; y <= range; y++) {
                for (int z = -range; z <= range; z++) {
                    positions.add(new BlockPos(initalBlockPos.getX() + x, initalBlockPos.getY() + z, initalBlockPos.getZ() + y).offset(-face.getStepX(), -face.getStepY(), -face.getStepZ()));
                }
            }
        }

        return positions;
    }

    @Override
    public void appendHoverText(@NotNull ItemStack pStack, @NotNull TooltipContext pContext, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pTooltipFlag)
    {

    }
}

