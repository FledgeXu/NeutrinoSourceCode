package com.tutorial.neutrino.teisr;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.model.IBakedModel;
import net.minecraft.client.renderer.tileentity.ItemStackTileEntityRenderer;
import net.minecraft.item.ItemStack;

public class ObsidianWrenchItemStackTileEntityRenderer extends ItemStackTileEntityRenderer {
    private int i = 0;
    private int degree = 0;

    @Override
    public void render(ItemStack itemStackIn, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn) {
        matrixStackIn.push();
//        if (++i == 5) {
//            i = 0;
//            degree++;
//        }
        degree++;
        if (degree == 360) {
            degree = 0;
        }
        matrixStackIn.rotate(Vector3f.YN.rotationDegrees(degree));
//        matrixStackIn.rotate(new Quaternion(new Vector3f(0, 0.8f, 0.5f), degree, true));
        ItemRenderer itemRenderer = Minecraft.getInstance().getItemRenderer();
//        matrixStackIn.push();
////        matrixStackIn.rotate(Vector3f.ZN.rotationDegrees(90));
//        matrixStackIn.translate(0, 1, 0);
//        ItemStack stack = new ItemStack(Items.DIAMOND);
//        IBakedModel ibakedmodel = itemRenderer.getItemModelWithOverrides(stack, null, null);
//        itemRenderer.renderItem(stack, ItemCameraTransforms.TransformType.FIXED, true, matrixStackIn, bufferIn, combinedLightIn, combinedOverlayIn, ibakedmodel);
//        matrixStackIn.pop();
        IBakedModel mainModel = itemRenderer.getItemModelWithOverrides(itemStackIn, null, null);
//        itemRenderer.renderItem(itemStackIn, ItemCameraTransforms.TransformType.FIXED, true, matrixStackIn, bufferIn, combinedLightIn, combinedOverlayIn, mainModel);
        IVertexBuilder builder = bufferIn.getBuffer(RenderType.getTranslucent());
        itemRenderer.renderQuads(matrixStackIn, builder, mainModel.getQuads(null, null, null), itemStackIn, combinedLightIn, combinedOverlayIn);
        matrixStackIn.pop();
//        super.render(itemStackIn, matrixStackIn, bufferIn, combinedLightIn, combinedOverlayIn);
    }
}
