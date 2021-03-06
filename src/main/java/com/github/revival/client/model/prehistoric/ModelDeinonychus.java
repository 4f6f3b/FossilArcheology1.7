package com.github.revival.client.model.prehistoric;

import net.ilexiconn.llibrary.client.model.modelbase.MowzieModelRenderer;
import net.minecraft.entity.Entity;

import com.github.revival.client.model.base.ModelPrehistoric;
import com.github.revival.common.entity.mob.test.EntityNewPrehistoric;

/**
 * Deinonychus - Raptorfarian
 * Created using Tabula 4.1.1
 */
public class ModelDeinonychus extends ModelPrehistoric {
    public MowzieModelRenderer lowerBody;
    public MowzieModelRenderer leftThigh;
    public MowzieModelRenderer rightThigh;
    public MowzieModelRenderer upperBody;
    public MowzieModelRenderer tail1;
    public MowzieModelRenderer neck;
    public MowzieModelRenderer leftUpperArm;
    public MowzieModelRenderer rightUpperArm;
    public MowzieModelRenderer head;
    public MowzieModelRenderer crest;
    public MowzieModelRenderer upperJaw;
    public MowzieModelRenderer lowerJaw;
    public MowzieModelRenderer crest2;
    public MowzieModelRenderer crest3;
    public MowzieModelRenderer leftLowerArm;
    public MowzieModelRenderer leftUpperArmWing;
    public MowzieModelRenderer leftLowerArmWing;
    public MowzieModelRenderer rightLowerArm;
    public MowzieModelRenderer rightUpperArmWing;
    public MowzieModelRenderer rightLowerArmWing;
    public MowzieModelRenderer tail2;
    public MowzieModelRenderer TailFeather4;
    public MowzieModelRenderer tail3;
    public MowzieModelRenderer TailFeather2;
    public MowzieModelRenderer TailFeather3;
    public MowzieModelRenderer TailFeather1;
    public MowzieModelRenderer leftLeg;
    public MowzieModelRenderer leftFoot;
    public MowzieModelRenderer leftToeClaw1;
    public MowzieModelRenderer leftToeClaw2;
    public MowzieModelRenderer rightLeg;
    public MowzieModelRenderer rightFoot;
    public MowzieModelRenderer rightToeClaw1;
    public MowzieModelRenderer rightToeClaw2;

    public ModelDeinonychus() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.leftThigh = new MowzieModelRenderer(this, 2, 36);
        this.leftThigh.mirror = true;
        this.leftThigh.setRotationPoint(3.5F, 13.0F, 4.5F);
        this.leftThigh.addBox(0.0F, -1.0F, -2.5F, 3, 6, 5, 0.0F);
        this.lowerBody = new MowzieModelRenderer(this, 80, 20);
        this.lowerBody.setRotationPoint(0.0F, 10.5F, -3.0F);
        this.lowerBody.addBox(-4.0F, -3.5F, 0.0F, 8, 7, 10, 0.0F);
        this.setRotateAngle(lowerBody, -0.14189526818713902F, -0.0F, 0.0F);
        this.rightUpperArmWing = new MowzieModelRenderer(this, 38, 6);
        this.rightUpperArmWing.mirror = true;
        this.rightUpperArmWing.setRotationPoint(-1.8F, 2.8F, 1.0F);
        this.rightUpperArmWing.addBox(-0.5F, 0.0F, -3.5F, 1, 4, 7, 0.0F);
        this.setRotateAngle(rightUpperArmWing, 1.5184364492350666F, -0.0F, 0.0F);
        this.leftLeg = new MowzieModelRenderer(this, 1, 25);
        this.leftLeg.mirror = true;
        this.leftLeg.setRotationPoint(1.5F, 3.0F, 2.5F);
        this.leftLeg.addBox(-1.0F, -1.0F, -8.0F, 2, 2, 8, 0.0F);
        this.setRotateAngle(leftLeg, 1.1435397259066846F, -0.0F, 0.0F);
        this.tail2 = new MowzieModelRenderer(this, 50, 5);
        this.tail2.setRotationPoint(0.0F, 0.4F, 8.9F);
        this.tail2.addBox(-1.0F, -1.6F, 0.0F, 2, 3, 17, 0.0F);
        this.setRotateAngle(tail2, 0.03630284844148206F, -0.0F, 0.0F);
        this.rightUpperArm = new MowzieModelRenderer(this, 19, 17);
        this.rightUpperArm.setRotationPoint(-3.0F, 1.3F, -5.5F);
        this.rightUpperArm.addBox(-2.0F, -1.0F, -1.0F, 2, 5, 3, 0.0F);
        this.setRotateAngle(rightUpperArm, 0.006806784082777885F, -0.0F, 0.0F);
        this.leftLowerArmWing = new MowzieModelRenderer(this, 37, 4);
        this.leftLowerArmWing.setRotationPoint(0.8F, 0.7F, 1.5F);
        this.leftLowerArmWing.addBox(-0.5F, 0.0F, -8.0F, 1, 5, 8, 0.0F);
        this.setRotateAngle(leftLowerArmWing, 0.01361356816555577F, -0.0F, 0.0F);
        this.leftToeClaw2 = new MowzieModelRenderer(this, 5, 16);
        this.leftToeClaw2.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.leftToeClaw2.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(leftToeClaw2, -1.7627825445142729F, -0.0F, 0.0F);
        this.tail1 = new MowzieModelRenderer(this, 86, 4);
        this.tail1.setRotationPoint(0.0F, -0.7F, 8.3F);
        this.tail1.addBox(-2.0F, -2.0F, 0.0F, 4, 5, 9, 0.0F);
        this.setRotateAngle(tail1, 0.14901485447841145F, -0.0F, 0.0F);
        this.lowerJaw = new MowzieModelRenderer(this, 97, 54);
        this.lowerJaw.setRotationPoint(0.0F, 1.07F, -6.6F);
        this.lowerJaw.addBox(-1.5F, -1.0F, -6.6F, 3, 2, 7, 0.0F);
        this.setRotateAngle(lowerJaw, -0.0622576080153868F, -0.0F, 0.0F);
        this.neck = new MowzieModelRenderer(this, 46, 52);
        this.neck.setRotationPoint(0.0F, 0.8F, -5.7F);
        this.neck.addBox(-2.0F, -2.0F, -7.0F, 4, 4, 7, 0.0F);
        this.setRotateAngle(neck, -0.9773843811168246F, -0.0F, 0.0F);
        this.rightThigh = new MowzieModelRenderer(this, 2, 36);
        this.rightThigh.setRotationPoint(-3.5F, 13.0F, 4.5F);
        this.rightThigh.addBox(-3.0F, -1.0F, -2.5F, 3, 6, 5, 0.0F);
        this.TailFeather4 = new MowzieModelRenderer(this, 73, 37);
        this.TailFeather4.setRotationPoint(0.0F, -0.5F, 0.1F);
        this.TailFeather4.addBox(-4.0F, 0.2F, 1.5F, 8, 1, 8, 0.0F);
        this.rightLeg = new MowzieModelRenderer(this, 1, 25);
        this.rightLeg.setRotationPoint(-1.5F, 3.0F, 2.5F);
        this.rightLeg.addBox(-1.0F, -1.0F, -8.0F, 2, 2, 8, 0.0F);
        this.setRotateAngle(rightLeg, 1.1435397259066846F, -0.0F, 0.0F);
        this.leftUpperArm = new MowzieModelRenderer(this, 19, 17);
        this.leftUpperArm.mirror = true;
        this.leftUpperArm.setRotationPoint(3.0F, 1.3F, -5.5F);
        this.leftUpperArm.addBox(0.0F, -1.0F, -1.0F, 2, 5, 3, 0.0F);
        this.setRotateAngle(leftUpperArm, 0.006806784082777885F, -0.0F, 0.0F);
        this.TailFeather3 = new MowzieModelRenderer(this, 53, 36);
        this.TailFeather3.setRotationPoint(0.0F, -0.5F, 0.1F);
        this.TailFeather3.addBox(-3.5F, -0.3F, 0.0F, 7, 1, 8, 0.0F);
        this.rightFoot = new MowzieModelRenderer(this, 21, 34);
        this.rightFoot.setRotationPoint(0.0F, -0.9F, -7.0F);
        this.rightFoot.addBox(-1.5F, 0.0F, -3.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(rightFoot, -1.1435397259066846F, -0.0F, 0.0F);
        this.leftToeClaw1 = new MowzieModelRenderer(this, 5, 20);
        this.leftToeClaw1.setRotationPoint(-1.1F, 1.0F, -1.0F);
        this.leftToeClaw1.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(leftToeClaw1, -0.8726646259971648F, -0.0F, 0.0F);
        this.rightLowerArm = new MowzieModelRenderer(this, 15, 3);
        this.rightLowerArm.setRotationPoint(-0.9F, 3.0F, 0.0F);
        this.rightLowerArm.addBox(-0.9F, 0.0F, -6.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(rightLowerArm, 0.704240353179712F, -0.0F, 0.0F);
        this.leftFoot = new MowzieModelRenderer(this, 21, 34);
        this.leftFoot.mirror = true;
        this.leftFoot.setRotationPoint(0.0F, -0.9F, -7.0F);
        this.leftFoot.addBox(-1.5F, 0.0F, -3.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(leftFoot, -1.1435397259066846F, -0.0F, 0.0F);
        this.leftUpperArmWing = new MowzieModelRenderer(this, 38, 6);
        this.leftUpperArmWing.setRotationPoint(1.8F, 2.8F, 1.0F);
        this.leftUpperArmWing.addBox(-0.5F, 0.0F, -3.5F, 1, 4, 7, 0.0F);
        this.setRotateAngle(leftUpperArmWing, 1.5184364492350666F, -0.0F, 0.0F);
        this.TailFeather2 = new MowzieModelRenderer(this, 53, 36);
        this.TailFeather2.setRotationPoint(0.0F, -0.5F, 0.1F);
        this.TailFeather2.addBox(-3.5F, -0.3F, 7.9F, 7, 1, 8, 0.0F);
        this.crest = new MowzieModelRenderer(this, 30, 17);
        this.crest.setRotationPoint(0.0F, -2.0F, -3.5F);
        this.crest.addBox(-0.5F, -2.0F, 0.0F, 1, 5, 8, 0.0F);
        this.setRotateAngle(crest, 0.367697721415797F, -0.0F, 0.0F);
        this.crest2 = new MowzieModelRenderer(this, 30, 17);
        this.crest2.setRotationPoint(1.1F, -1.4F, -2.2F);
        this.crest2.addBox(-0.5F, -2.0F, 0.0F, 1, 5, 8, 0.0F);
        this.setRotateAngle(crest2, -0.3141592653589793F, 0.17453292519943295F, 0.08726646259971647F);
        this.rightLowerArmWing = new MowzieModelRenderer(this, 37, 4);
        this.rightLowerArmWing.mirror = true;
        this.rightLowerArmWing.setRotationPoint(-0.8F, 0.7F, 1.5F);
        this.rightLowerArmWing.addBox(-0.5F, 0.0F, -8.0F, 1, 5, 8, 0.0F);
        this.setRotateAngle(rightLowerArmWing, 0.01361356816555577F, -0.0F, 0.0F);
        this.rightToeClaw1 = new MowzieModelRenderer(this, 5, 20);
        this.rightToeClaw1.setRotationPoint(1.1F, 1.0F, -1.0F);
        this.rightToeClaw1.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(rightToeClaw1, -0.8726646259971648F, -0.0F, 0.0F);
        this.upperJaw = new MowzieModelRenderer(this, 97, 39);
        this.upperJaw.setRotationPoint(0.0F, -2.1F, -5.5F);
        this.upperJaw.addBox(-2.0F, -2.0F, -8.0F, 4, 4, 8, 0.0F);
        this.setRotateAngle(upperJaw, 0.07661995416255106F, -0.0F, 0.0F);
        this.tail3 = new MowzieModelRenderer(this, 62, 28);
        this.tail3.setRotationPoint(0.0F, -0.4F, 17.0F);
        this.tail3.addBox(-0.5F, -0.9F, 0.0F, 1, 2, 6, 0.0F);
        this.setRotateAngle(tail3, -0.08256616149996648F, -0.0F, 0.0F);
        this.leftLowerArm = new MowzieModelRenderer(this, 15, 3);
        this.leftLowerArm.mirror = true;
        this.leftLowerArm.setRotationPoint(0.9F, 3.0F, 0.0F);
        this.leftLowerArm.addBox(-1.0F, 0.0F, -6.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(leftLowerArm, 0.704240353179712F, -0.0F, 0.0F);
        this.head = new MowzieModelRenderer(this, 68, 47);
        this.head.setRotationPoint(0.0F, -1.5F, -7.0F);
        this.head.addBox(-2.5F, -4.0F, -7.0F, 5, 6, 7, 0.0F);
        this.setRotateAngle(head, 1.1344640137963142F, -0.0F, 0.0F);
        this.rightToeClaw2 = new MowzieModelRenderer(this, 5, 16);
        this.rightToeClaw2.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.rightToeClaw2.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rightToeClaw2, -1.7627825445142729F, -0.0F, 0.0F);
        this.crest3 = new MowzieModelRenderer(this, 30, 17);
        this.crest3.setRotationPoint(-1.1F, -1.4F, -2.2F);
        this.crest3.addBox(-0.5F, -2.0F, -0.2F, 1, 5, 8, 0.0F);
        this.setRotateAngle(crest3, -0.3141592653589793F, -0.17453292519943295F, -0.08726646259971647F);
        this.TailFeather1 = new MowzieModelRenderer(this, 29, 33);
        this.TailFeather1.setRotationPoint(0.0F, -0.5F, 0.1F);
        this.TailFeather1.addBox(-3.0F, 0.0F, -1.2F, 6, 1, 12, 0.0F);
        this.upperBody = new MowzieModelRenderer(this, 13, 48);
        this.upperBody.setRotationPoint(0.0F, -1.5F, 1.0F);
        this.upperBody.addBox(-3.0F, -2.0F, -7.0F, 6, 6, 7, 0.0F);
        this.setRotateAngle(upperBody, 0.22916173078685548F, -0.0F, 0.0F);
        this.rightUpperArm.addChild(this.rightUpperArmWing);
        this.leftThigh.addChild(this.leftLeg);
        this.tail1.addChild(this.tail2);
        this.upperBody.addChild(this.rightUpperArm);
        this.leftLowerArm.addChild(this.leftLowerArmWing);
        this.leftToeClaw1.addChild(this.leftToeClaw2);
        this.lowerBody.addChild(this.tail1);
        this.head.addChild(this.lowerJaw);
        this.upperBody.addChild(this.neck);
        this.tail1.addChild(this.TailFeather4);
        this.rightThigh.addChild(this.rightLeg);
        this.upperBody.addChild(this.leftUpperArm);
        this.tail2.addChild(this.TailFeather3);
        this.rightLeg.addChild(this.rightFoot);
        this.leftFoot.addChild(this.leftToeClaw1);
        this.rightUpperArm.addChild(this.rightLowerArm);
        this.leftLeg.addChild(this.leftFoot);
        this.leftUpperArm.addChild(this.leftUpperArmWing);
        this.tail2.addChild(this.TailFeather2);
        this.head.addChild(this.crest);
        this.head.addChild(this.crest2);
        this.rightLowerArm.addChild(this.rightLowerArmWing);
        this.rightFoot.addChild(this.rightToeClaw1);
        this.head.addChild(this.upperJaw);
        this.tail2.addChild(this.tail3);
        this.leftUpperArm.addChild(this.leftLowerArm);
        this.neck.addChild(this.head);
        this.rightToeClaw1.addChild(this.rightToeClaw2);
        this.head.addChild(this.crest3);
        this.tail3.addChild(this.TailFeather1);
        this.lowerBody.addChild(this.upperBody);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.leftThigh.render(f5);
        this.lowerBody.render(f5);
        this.rightThigh.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(MowzieModelRenderer MowzieModelRenderer, float x, float y, float z) {
        MowzieModelRenderer.rotateAngleX = x;
        MowzieModelRenderer.rotateAngleY = y;
        MowzieModelRenderer.rotateAngleZ = z;
    }

	@Override
	public void renderFossil(EntityNewPrehistoric entity, float f, float f1,
			float f2, float f3, float f4, float f5) {
		
	}

	@Override
	public void renderLiving(EntityNewPrehistoric entity, float f, float f1,
			float f2, float f3, float f4, float f5) {
		
	}

	@Override
	public void renderSleeping(EntityNewPrehistoric entity, float f, float f1,
			float f2, float f3, float f4, float f5) {
		
	}
}
