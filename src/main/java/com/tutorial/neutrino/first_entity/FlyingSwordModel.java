package com.tutorial.neutrino.first_entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class FlyingSwordModel extends EntityModel<FlyingSwordEntity> {
    private final ModelRenderer body;

    public FlyingSwordModel() {
        textureWidth = 128;
        textureHeight = 128;

        body = new ModelRenderer(this);
        body.setRotationPoint(13.0F, 24.0F, -13.0F);
        body.setTextureOffset(0, 50);
        body.addBox(-1.1053F, -16.0F, -2.7368F, 4, 2, 6, 0.0F, false);
        body.setTextureOffset(60, 40);
        body.addBox(-3.1053F, -16.0F, -2.7368F, 2, 2, 8, 0.0F, false);
        body.setTextureOffset(52, 50);
        body.addBox(-5.1053F, -16.0F, 1.2632F, 2, 2, 6, 0.0F, false);
        body.setTextureOffset(60, 0);
        body.addBox(-7.1053F, -16.0F, 3.2632F, 2, 2, 12, 0.0F, false);
        body.setTextureOffset(40, 40);
        body.addBox(-5.1053F, -16.0F, 9.2632F, 2, 2, 8, 0.0F, false);
        body.setTextureOffset(12, 58);
        body.addBox(-3.1053F, -16.0F, 13.2632F, 2, 2, 4, 0.0F, false);
        body.setTextureOffset(20, 40);
        body.addBox(-9.1053F, -16.0F, 5.2632F, 2, 2, 8, 0.0F, false);
        body.setTextureOffset(32, 0);
        body.addBox(-11.1053F, -16.0F, 3.2632F, 2, 2, 12, 0.0F, false);
        body.setTextureOffset(0, 0);
        body.addBox(-13.1053F, -16.0F, 3.2632F, 2, 2, 14, 0.0F, false);
        body.setTextureOffset(36, 50);
        body.addBox(-15.1053F, -16.0F, 1.2632F, 2, 2, 6, 0.0F, false);
        body.setTextureOffset(0, 58);
        body.addBox(-17.1053F, -16.0F, 1.2632F, 2, 2, 4, 0.0F, false);
        body.setTextureOffset(48, 28);
        body.addBox(-15.1053F, -16.0F, 9.2632F, 2, 2, 10, 0.0F, false);
        body.setTextureOffset(24, 28);
        body.addBox(-17.1053F, -16.0F, 11.2632F, 2, 2, 10, 0.0F, false);
        body.setTextureOffset(0, 28);
        body.addBox(-19.1053F, -16.0F, 13.2632F, 2, 2, 10, 0.0F, false);
        body.setTextureOffset(48, 16);
        body.addBox(-21.1053F, -16.0F, 15.2632F, 2, 2, 10, 0.0F, false);
        body.setTextureOffset(24, 16);
        body.addBox(-23.1053F, -16.0F, 17.2632F, 2, 2, 10, 0.0F, false);
        body.setTextureOffset(0, 16);
        body.addBox(-25.1053F, -16.0F, 19.2632F, 2, 2, 10, 0.0F, false);
        body.setTextureOffset(0, 40);
        body.addBox(-27.1053F, -16.0F, 21.2632F, 2, 2, 8, 0.0F, false);
        body.setTextureOffset(20, 50);
        body.addBox(-29.1053F, -16.0F, 23.2632F, 2, 2, 6, 0.0F, false);
    }

    @Override
    public void setRotationAngles(FlyingSwordEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        body.rotateAngleX = limbSwing;
        body.rotateAngleY = netHeadYaw;
        body.rotateAngleZ = headPitch;
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        body.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn);
    }
}
