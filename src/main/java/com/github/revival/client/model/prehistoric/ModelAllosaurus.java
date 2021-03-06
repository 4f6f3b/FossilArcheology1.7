package com.github.revival.client.model.prehistoric;

import net.ilexiconn.llibrary.client.model.modelbase.MowzieModelRenderer;
import net.minecraft.entity.Entity;

import com.github.revival.client.model.base.ModelPrehistoric;
import com.github.revival.common.entity.mob.test.EntityNewPrehistoric;

public class ModelAllosaurus extends ModelPrehistoric {
    public MowzieModelRenderer rightUpperLeg;
    public MowzieModelRenderer leftUpperLeg;
    public MowzieModelRenderer lowerBody;
    public MowzieModelRenderer rightLowerLeg;
    public MowzieModelRenderer rightFoot;
    public MowzieModelRenderer leftLowerLeg;
    public MowzieModelRenderer leftFoot;
    public MowzieModelRenderer tail1;
    public MowzieModelRenderer upperBody;
    public MowzieModelRenderer tail2;
    public MowzieModelRenderer tail3;
    public MowzieModelRenderer neck;
    public MowzieModelRenderer leftUpperArm;
    public MowzieModelRenderer rightUpperArm;
    public MowzieModelRenderer head;
    public MowzieModelRenderer rightCrest;
    public MowzieModelRenderer leftCrest;
    public MowzieModelRenderer lowerJaw;
    public MowzieModelRenderer upperJaw;
    public MowzieModelRenderer teeth;
    public MowzieModelRenderer rightLowerArm;
    public MowzieModelRenderer leftLowerArm;

    public ModelAllosaurus() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.rightCrest = new MowzieModelRenderer(this, 100, 0);
        this.rightCrest.mirror = true;
        this.rightCrest.setRotationPoint(-1.5F, -3.0F, -2.0F);
        this.rightCrest.addBox(-0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(rightCrest, -0.6981316804885863F, 0.0F, -0.3141592741012573F);
        this.teeth = new MowzieModelRenderer(this, 80, 10);
        this.teeth.mirror = true;
        this.teeth.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.teeth.addBox(-1.5F, -0.5F, -5.0F, 3, 1, 5, 0.0F);
        this.tail3 = new MowzieModelRenderer(this, 19, 48);
        this.tail3.mirror = true;
        this.tail3.setRotationPoint(0.0F, -0.20000000298023224F, 9.0F);
        this.tail3.addBox(-1.0F, -1.5F, 0.0F, 2, 3, 10, 0.0F);
        this.neck = new MowzieModelRenderer(this, 100, 18);
        this.neck.mirror = true;
        this.neck.setRotationPoint(0.0F, 2.7F, -5.6F);
        this.neck.addBox(-1.5F, -2.5F, -8.0F, 3, 5, 8, 0.0F);
        this.setRotateAngle(neck, -0.5585053606381855F, 0.0F, 0.0F);
        this.lowerBody = new MowzieModelRenderer(this, 96, 41);
        this.lowerBody.mirror = true;
        this.lowerBody.setRotationPoint(0.0F, 8.3F, 0.0F);
        this.lowerBody.addBox(-3.5F, 0.0F, 0.0F, 7, 8, 7, 0.0F);
        this.setRotateAngle(lowerBody, -0.03490658503988659F, 0.0F, 0.0F);
        this.leftFoot = new MowzieModelRenderer(this, 50, 23);
        this.leftFoot.mirror = true;
        this.leftFoot.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.leftFoot.addBox(-1.5F, 0.0F, -3.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(leftFoot, 0.3141592741012573F, 0.0F, 0.0F);
        this.upperBody = new MowzieModelRenderer(this, 75, 28);
        this.upperBody.mirror = true;
        this.upperBody.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.upperBody.addBox(-2.5F, 0.0F, -7.0F, 5, 7, 7, 0.0F);
        this.setRotateAngle(upperBody, 0.05235987755982988F, 0.0F, 0.0F);
        this.leftUpperArm = new MowzieModelRenderer(this, 10, 9);
        this.leftUpperArm.mirror = true;
        this.leftUpperArm.setRotationPoint(2.5F, 2.5F, -5.5F);
        this.leftUpperArm.addBox(0.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(leftUpperArm, 0.16110743555066584F, 0.0F, 0.0F);
        this.rightUpperLeg = new MowzieModelRenderer(this, 8, 26);
        this.rightUpperLeg.setRotationPoint(-3.0F, 12.3F, 5.5F);
        this.rightUpperLeg.addBox(-3.0F, 0.0F, -2.5F, 3, 6, 5, 0.0F);
        this.tail1 = new MowzieModelRenderer(this, 67, 46);
        this.tail1.mirror = true;
        this.tail1.setRotationPoint(0.0F, 3.2F, 6.0F);
        this.tail1.addBox(-2.5F, -3.0F, 0.0F, 5, 6, 6, 0.0F);
        this.leftCrest = new MowzieModelRenderer(this, 100, 0);
        this.leftCrest.mirror = true;
        this.leftCrest.setRotationPoint(1.5F, -3.0F, -2.0F);
        this.leftCrest.addBox(-0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(leftCrest, -0.6981316804885863F, 0.0F, 0.3141592741012573F);
        this.head = new MowzieModelRenderer(this, 100, 6);
        this.head.mirror = true;
        this.head.setRotationPoint(0.0F, -0.5F, -6.1F);
        this.head.addBox(-2.0F, -3.0F, -4.0F, 4, 6, 4, 0.0F);
        this.setRotateAngle(head, 0.8377580409572781F, 0.0F, 0.0F);
        this.lowerJaw = new MowzieModelRenderer(this, 80, 17);
        this.lowerJaw.mirror = true;
        this.lowerJaw.setRotationPoint(0.0F, 2.0F, -3.2F);
        this.lowerJaw.addBox(-1.0F, -0.8F, -5.6F, 2, 2, 5, 0.0F);
        this.setRotateAngle(lowerJaw, -0.06430079482153023F, 0.0F, 0.0F);
        this.leftLowerArm = new MowzieModelRenderer(this, 20, 8);
        this.leftLowerArm.mirror = true;
        this.leftLowerArm.setRotationPoint(-1.0F, 2.9F, -0.3F);
        this.leftLowerArm.addBox(-0.9F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(leftLowerArm, -0.6981317007977318F, 0.0F, 0.0F);
        this.rightLowerLeg = new MowzieModelRenderer(this, 35, 26);
        this.rightLowerLeg.mirror = true;
        this.rightLowerLeg.setRotationPoint(-1.4F, 4.0F, 2.5F);
        this.rightLowerLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(rightLowerLeg, -0.3141592653589793F, 0.0F, 0.0F);
        this.rightFoot = new MowzieModelRenderer(this, 50, 23);
        this.rightFoot.mirror = true;
        this.rightFoot.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.rightFoot.addBox(-1.5F, 0.0F, -3.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(rightFoot, 0.3141592741012573F, 0.0F, 0.0F);
        this.rightUpperArm = new MowzieModelRenderer(this, 10, 9);
        this.rightUpperArm.mirror = true;
        this.rightUpperArm.setRotationPoint(-2.5F, 2.5F, -5.5F);
        this.rightUpperArm.addBox(-2.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(rightUpperArm, 0.16109388995907664F, 0.0F, 0.0F);
        this.upperJaw = new MowzieModelRenderer(this, 80, 0);
        this.upperJaw.mirror = true;
        this.upperJaw.setRotationPoint(0.0F, -2.799999952316284F, -4.0F);
        this.upperJaw.addBox(-1.5F, 0.0F, -5.0F, 3, 4, 5, 0.0F);
        this.leftUpperLeg = new MowzieModelRenderer(this, 8, 26);
        this.leftUpperLeg.mirror = true;
        this.leftUpperLeg.setRotationPoint(3.0F, 12.3F, 5.5F);
        this.leftUpperLeg.addBox(0.0F, 0.0F, -2.5F, 3, 6, 5, 0.0F);
        this.leftLowerLeg = new MowzieModelRenderer(this, 35, 26);
        this.leftLowerLeg.mirror = true;
        this.leftLowerLeg.setRotationPoint(1.4F, 4.0F, 2.5F);
        this.leftLowerLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(leftLowerLeg, -0.3141592653589793F, 0.0F, 0.0F);
        this.tail2 = new MowzieModelRenderer(this, 39, 42);
        this.tail2.mirror = true;
        this.tail2.setRotationPoint(0.0F, -0.8F, 6.0F);
        this.tail2.addBox(-1.5F, -2.0F, 0.0F, 3, 4, 9, 0.0F);
        this.setRotateAngle(tail2, 0.017453292519943295F, 0.0F, 0.0F);
        this.rightLowerArm = new MowzieModelRenderer(this, 20, 8);
        this.rightLowerArm.setRotationPoint(1.0F, 2.9F, -0.3F);
        this.rightLowerArm.addBox(-1.1F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(rightLowerArm, -0.6981317007977318F, 0.0F, 0.0F);
        this.head.addChild(this.rightCrest);
        this.upperJaw.addChild(this.teeth);
        this.tail2.addChild(this.tail3);
        this.upperBody.addChild(this.neck);
        this.leftLowerLeg.addChild(this.leftFoot);
        this.lowerBody.addChild(this.upperBody);
        this.upperBody.addChild(this.leftUpperArm);
        this.lowerBody.addChild(this.tail1);
        this.head.addChild(this.leftCrest);
        this.neck.addChild(this.head);
        this.head.addChild(this.lowerJaw);
        this.rightUpperArm.addChild(this.leftLowerArm);
        this.rightUpperLeg.addChild(this.rightLowerLeg);
        this.rightLowerLeg.addChild(this.rightFoot);
        this.upperBody.addChild(this.rightUpperArm);
        this.head.addChild(this.upperJaw);
        this.leftUpperLeg.addChild(this.leftLowerLeg);
        this.tail1.addChild(this.tail2);
        this.leftUpperArm.addChild(this.rightLowerArm);
        doMowzieStuff(false);
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
