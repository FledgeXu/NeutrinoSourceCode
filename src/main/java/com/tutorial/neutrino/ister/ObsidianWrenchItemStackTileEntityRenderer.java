package com.tutorial.neutrino.ister;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.client.renderer.model.IBakedModel;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.tileentity.ItemStackTileEntityRenderer;
import net.minecraft.item.ItemStack;

public class ObsidianWrenchItemStackTileEntityRenderer extends ItemStackTileEntityRenderer {
    private int degree = 0;

    @Override
    public void render(ItemStack itemStackIn, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn) {
        if (degree == 360) {
            degree = 0;
        }
        degree++;
        ItemRenderer itemRenderer = Minecraft.getInstance().getItemRenderer();
        IBakedModel ibakedmodel = itemRenderer.getItemModelWithOverrides(itemStackIn, null, null);
        matrixStackIn.push();
        matrixStackIn.translate(0.5F, 0.5F, 0.5F);
        float xOffset = -1 / 32f;
        float zOffset = 0;
        matrixStackIn.translate(-xOffset, 0, -zOffset);
        matrixStackIn.rotate(Vector3f.YP.rotationDegrees(degree));
        matrixStackIn.translate(xOffset, 0, zOffset);
        itemRenderer.renderItem(itemStackIn, ItemCameraTransforms.TransformType.NONE, false, matrixStackIn, bufferIn, combinedLightIn, combinedOverlayIn, ibakedmodel.getBakedModel());
        matrixStackIn.pop();
    }
}
