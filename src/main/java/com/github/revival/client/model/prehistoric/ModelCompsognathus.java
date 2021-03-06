package com.github.revival.client.model.prehistoric;

import net.ilexiconn.llibrary.client.model.modelbase.MowzieModelRenderer;
import net.minecraft.entity.Entity;

import com.github.revival.client.model.base.ModelPrehistoric;
import com.github.revival.common.entity.mob.test.EntityNewPrehistoric;

/**
 * Compsognathus - Either Mojang or a mod author
 * Created using Tabula 4.1.1
 */
public class ModelCompsognathus extends ModelPrehistoric {
    public MowzieModelRenderer body;
    public MowzieModelRenderer leftUpperArm;
    public MowzieModelRenderer leftUpperArmWing;
    public MowzieModelRenderer leftUpperLeg;
    public MowzieModelRenderer neck;
    public MowzieModelRenderer rightUpperLeg;
    public MowzieModelRenderer tail1;
    public MowzieModelRenderer rightUpperArm;
    public MowzieModelRenderer rightUpperArmWing;
    public MowzieModelRenderer leftlowerArm;
    public MowzieModelRenderer leftLowerLeg;
    public MowzieModelRenderer leftFoot;
    public MowzieModelRenderer head;
    public MowzieModelRenderer headFront;
    public MowzieModelRenderer crest;
    public MowzieModelRenderer headFront_1;
    public MowzieModelRenderer EyeR;
    public MowzieModelRenderer EyeL;
    public MowzieModelRenderer rightLowerLeg;
    public MowzieModelRenderer RightFoot;
    public MowzieModelRenderer tail2;
    public MowzieModelRenderer RightLowerArm;

    public ModelCompsognathus() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.leftlowerArm = new MowzieModelRenderer(this, 4, 0);
        this.leftlowerArm.setRotationPoint(0.0F, 1.9F, 0.0F);
        this.leftlowerArm.addBox(-0.01F, -0.6F, -0.6F, 1, 3, 1, 0.0F);
        this.setRotateAngle(leftlowerArm, -0.22689280275926282F, 0.0F, 0.0F);
        this.RightFoot = new MowzieModelRenderer(this, 38, 0);
        this.RightFoot.mirror = true;
        this.RightFoot.setRotationPoint(0.0F, 4.7F, 0.7F);
        this.RightFoot.addBox(-1.5F, 0.0F, -2.4F, 3, 0, 3, 0.0F);
        this.setRotateAngle(RightFoot, 0.18203784098300857F, 0.0F, 0.0F);
        this.leftUpperArm = new MowzieModelRenderer(this, 0, 0);
        this.leftUpperArm.mirror = true;
        this.leftUpperArm.setRotationPoint(2.0F, -1.5F, -1.5F);
        this.leftUpperArm.addBox(0.01F, 0.0F, -0.6F, 1, 2, 1, 0.0F);
        this.setRotateAngle(leftUpperArm, -0.17453292519943295F, 0.0F, 0.0F);
        this.head = new MowzieModelRenderer(this, 16, 2);
        this.head.setRotationPoint(0.0F, -2.4F, 0.2F);
        this.head.addBox(-1.5F, -2.3F, -4.3F, 3, 3, 4, 0.0F);
        this.setRotateAngle(head, -0.6829473363053812F, 0.0F, 0.0F);
        this.tail1 = new MowzieModelRenderer(this, 4, 22);
        this.tail1.mirror = true;
        this.tail1.setRotationPoint(0.0F, -4.0F, 4.1F);
        this.tail1.addBox(-1.5F, 0.0F, 0.0F, 3, 3, 5, 0.0F);
        this.setRotateAngle(tail1, -0.045553093477052F, 0.0F, 0.0F);
        this.RightLowerArm = new MowzieModelRenderer(this, 4, 0);
        this.RightLowerArm.mirror = true;
        this.RightLowerArm.setRotationPoint(-1.1F, 1.9F, 0.0F);
        this.RightLowerArm.addBox(0.19F, -0.6F, -0.6F, 1, 3, 1, 0.0F);
        this.setRotateAngle(RightLowerArm, -0.22689280275926282F, 0.0F, 0.0F);
        this.rightLowerLeg = new MowzieModelRenderer(this, 47, 2);
        this.rightLowerLeg.mirror = true;
        this.rightLowerLeg.setRotationPoint(-0.5F, 4.0F, 0.0F);
        this.rightLowerLeg.addBox(-0.49F, -0.2F, 0.3F, 1, 5, 1, 0.0F);
        this.setRotateAngle(rightLowerLeg, -0.22689280275926282F, 0.0F, 0.0F);
        this.leftFoot = new MowzieModelRenderer(this, 38, 0);
        this.leftFoot.mirror = true;
        this.leftFoot.setRotationPoint(0.5F, 4.7F, 0.7F);
        this.leftFoot.addBox(-1.5F, 0.0F, -2.4F, 3, 0, 3, 0.0F);
        this.setRotateAngle(leftFoot, 0.18203784098300857F, 0.0F, 0.0F);
        this.neck = new MowzieModelRenderer(this, 4, 4);
        this.neck.mirror = true;
        this.neck.setRotationPoint(0.0F, -2.3F, -2.3F);
        this.neck.addBox(-1.0F, -4.0F, -1.5F, 2, 5, 3, 0.0F);
        this.setRotateAngle(neck, 0.7853981633974483F, 0.0F, 0.0F);
        this.EyeL = new MowzieModelRenderer(this, 16, 14);
        this.EyeL.setRotationPoint(0.001F, 0.0F, 0.0F);
        this.EyeL.addBox(1.51F, -2.3F, -4.3F, 0, 3, 4, 0.0F);
        this.leftUpperArmWing = new MowzieModelRenderer(this, 0, 11);
        this.leftUpperArmWing.mirror = true;
        this.leftUpperArmWing.setRotationPoint(2.0F, -1.5F, -1.5F);
        this.leftUpperArmWing.addBox(-0.0F, 0.0F, 0.5F, 1, 4, 2, 0.0F);
        this.setRotateAngle(leftUpperArmWing, -0.45378560551852565F, 0.0F, 0.0F);
        this.tail2 = new MowzieModelRenderer(this, 26, 20);
        this.tail2.mirror = true;
        this.tail2.setRotationPoint(0.0F, 0.8F, 3.9F);
        this.tail2.addBox(-1.0F, -0.6F, 0.0F, 2, 2, 10, 0.0F);
        this.rightUpperArmWing = new MowzieModelRenderer(this, 0, 11);
        this.rightUpperArmWing.mirror = true;
        this.rightUpperArmWing.setRotationPoint(-2.0F, -1.5F, -1.5F);
        this.rightUpperArmWing.addBox(-1.0F, 0.0F, 0.5F, 1, 4, 2, 0.0F);
        this.setRotateAngle(rightUpperArmWing, -0.45378560551852565F, 0.0F, 0.0F);
        this.headFront_1 = new MowzieModelRenderer(this, 20, 10);
        this.headFront_1.setRotationPoint(0.0F, 0.6F, -2.0F);
        this.headFront_1.addBox(-1.0F, -0.6F, -4.4F, 2, 1, 5, 0.0F);
        this.rightUpperArm = new MowzieModelRenderer(this, 0, 0);
        this.rightUpperArm.setRotationPoint(-2.0F, -1.5F, -1.5F);
        this.rightUpperArm.addBox(-1.01F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rightUpperArm, -0.17453292519943295F, 0.0F, 0.0F);
        this.leftLowerLeg = new MowzieModelRenderer(this, 47, 2);
        this.leftLowerLeg.mirror = true;
        this.leftLowerLeg.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.leftLowerLeg.addBox(-0.01F, -0.2F, 0.3F, 1, 5, 1, 0.0F);
        this.setRotateAngle(leftLowerLeg, -0.22689280275926282F, 0.0F, 0.0F);
        this.headFront = new MowzieModelRenderer(this, 28, 0);
        this.headFront.setRotationPoint(0.0F, -0.7F, -5.1F);
        this.headFront.addBox(-1.0F, -1.0F, -1.5F, 2, 2, 3, 0.0F);
        this.leftUpperLeg = new MowzieModelRenderer(this, 38, 8);
        this.leftUpperLeg.mirror = true;
        this.leftUpperLeg.setRotationPoint(2.0F, -3.0F, 4.0F);
        this.leftUpperLeg.addBox(0.0F, 0.0F, -1.0F, 1, 5, 2, 0.0F);
        this.rightUpperLeg = new MowzieModelRenderer(this, 38, 8);
        this.rightUpperLeg.mirror = true;
        this.rightUpperLeg.setRotationPoint(-2.0F, -3.0F, 4.0F);
        this.rightUpperLeg.addBox(-1.0F, 0.0F, -1.0F, 1, 5, 2, 0.0F);
        this.EyeR = new MowzieModelRenderer(this, 16, 14);
        this.EyeR.setRotationPoint(-0.001F, 0.0F, 0.0F);
        this.EyeR.addBox(-1.51F, -2.3F, -4.3F, 0, 3, 4, 0.0F);
        this.body = new MowzieModelRenderer(this, 0, 18);
        this.body.mirror = true;
        this.body.setRotationPoint(0.0F, 18.0F, 0.0F);
        this.body.addBox(-2.0F, -4.0F, -3.0F, 4, 5, 8, 0.0F);
        this.crest = new MowzieModelRenderer(this, 9, 12);
        this.crest.setRotationPoint(0.0F, -0.6F, -2.4F);
        this.crest.addBox(0.0F, -1.0F, 2.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(crest, 0.31869712141416456F, 0.0F, 0.0F);
        this.leftUpperArm.addChild(this.leftlowerArm);
        this.rightLowerLeg.addChild(this.RightFoot);
        this.body.addChild(this.leftUpperArm);
        this.neck.addChild(this.head);
        this.body.addChild(this.tail1);
        this.rightUpperArm.addChild(this.RightLowerArm);
        this.rightUpperLeg.addChild(this.rightLowerLeg);
        this.leftLowerLeg.addChild(this.leftFoot);
        this.body.addChild(this.neck);
        this.head.addChild(this.EyeL);
        this.body.addChild(this.leftUpperArmWing);
        this.tail1.addChild(this.tail2);
        this.body.addChild(this.rightUpperArmWing);
        this.head.addChild(this.headFront_1);
        this.body.addChild(this.rightUpperArm);
        this.leftUpperLeg.addChild(this.leftLowerLeg);
        this.head.addChild(this.headFront);
        this.body.addChild(this.leftUpperLeg);
        this.body.addChild(this.rightUpperLeg);
        this.head.addChild(this.EyeR);
        this.head.addChild(this.crest);
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
