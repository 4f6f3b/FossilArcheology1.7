package com.github.revival.client.model.prehistoric;

import net.ilexiconn.llibrary.client.model.modelbase.MowzieModelRenderer;
import net.minecraft.entity.Entity;

import com.github.revival.client.model.base.ModelPrehistoric;
import com.github.revival.common.entity.mob.test.EntityNewPrehistoric;

/**
 * Ceratosaurus - Bluestreak
 * Created using Tabula 4.1.1
 */
public class ModelCeratosaurus extends ModelPrehistoric {
    public MowzieModelRenderer leftThigh;
    public MowzieModelRenderer rightThigh;
    public MowzieModelRenderer lowerBody;
    public MowzieModelRenderer leftLeg;
    public MowzieModelRenderer leftFoot;
    public MowzieModelRenderer rightLeg;
    public MowzieModelRenderer rightFoot;
    public MowzieModelRenderer upperBody;
    public MowzieModelRenderer tail1;
    public MowzieModelRenderer leftUpperArm;
    public MowzieModelRenderer rightUpperArm;
    public MowzieModelRenderer neck;
    public MowzieModelRenderer leftLowerArm;
    public MowzieModelRenderer rightLowerArm;
    public MowzieModelRenderer head;
    public MowzieModelRenderer upperJaw;
    public MowzieModelRenderer lowerJaw;
    public MowzieModelRenderer rightHorn;
    public MowzieModelRenderer leftHorn;
    public MowzieModelRenderer frontNasalCrest;
    public MowzieModelRenderer backNasalCrest;
    public MowzieModelRenderer tail2;
    public MowzieModelRenderer tail3;

    public ModelCeratosaurus() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.tail3 = new MowzieModelRenderer(this, 28, 5);
        this.tail3.setRotationPoint(0.0F, 0.8F, 9.0F);
        this.tail3.addBox(-2.0F, 0.0F, 0.0F, 4, 4, 10, 0.0F);
        this.setRotateAngle(tail3, -0.10471975511965977F, -0.0F, 0.0F);
        this.leftLowerArm = new MowzieModelRenderer(this, 20, 25);
        this.leftLowerArm.setRotationPoint(0.9F, 1.5F, 0.0F);
        this.leftLowerArm.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(leftLowerArm, -0.7391469382195985F, -0.0F, 0.0F);
        this.leftThigh = new MowzieModelRenderer(this, 0, 17);
        this.leftThigh.mirror = true;
        this.leftThigh.setRotationPoint(4.0F, 7.8F, 7.5F);
        this.leftThigh.addBox(0.0F, -1.0F, -3.0F, 4, 9, 6, 0.0F);
        this.leftUpperArm = new MowzieModelRenderer(this, 20, 18);
        this.leftUpperArm.setRotationPoint(4.0F, 3.5F, -11.2F);
        this.leftUpperArm.addBox(0.0F, -1.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(leftUpperArm, 0.3633775502652194F, -0.0F, 0.0F);
        this.rightLowerArm = new MowzieModelRenderer(this, 20, 25);
        this.rightLowerArm.mirror = true;
        this.rightLowerArm.setRotationPoint(-0.9F, 1.5F, 0.0F);
        this.rightLowerArm.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(rightLowerArm, -0.7391469382195985F, -0.0F, 0.0F);
        this.rightHorn = new MowzieModelRenderer(this, 47, 46);
        this.rightHorn.setRotationPoint(-2.2F, -2.9F, -4.6F);
        this.rightHorn.addBox(0.0F, -2.0F, -1.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(rightHorn, 0.24644049038159932F, -0.239459173373622F, -0.4242895411598215F);
        this.tail2 = new MowzieModelRenderer(this, 49, 12);
        this.tail2.setRotationPoint(0.0F, 0.3F, 8.3F);
        this.tail2.addBox(-2.5F, 0.0F, 0.0F, 5, 6, 9, 0.0F);
        this.setRotateAngle(tail2, 0.06981317007977318F, 0.0F, 0.0F);
        this.rightFoot = new MowzieModelRenderer(this, 10, 9);
        this.rightFoot.setRotationPoint(0.1F, 9.4F, 0.5F);
        this.rightFoot.addBox(-2.0F, 0.0F, -5.0F, 3, 2, 6, 0.0F);
        this.setRotateAngle(rightFoot, 0.2617993877991494F, -0.0F, 0.0F);
        this.leftHorn = new MowzieModelRenderer(this, 47, 46);
        this.leftHorn.setRotationPoint(2.2F, -2.9F, -4.6F);
        this.leftHorn.addBox(-1.0F, -2.0F, -1.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(leftHorn, 0.24644049038159932F, 0.239459173373622F, 0.4242895411598215F);
        this.rightThigh = new MowzieModelRenderer(this, 0, 17);
        this.rightThigh.setRotationPoint(-4.0F, 7.8F, 7.5F);
        this.rightThigh.addBox(-4.0F, -1.0F, -3.0F, 4, 9, 6, 0.0F);
        this.leftLeg = new MowzieModelRenderer(this, 0, 4);
        this.leftLeg.mirror = true;
        this.leftLeg.setRotationPoint(1.5F, 5.0F, 2.0F);
        this.leftLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 3, 0.0F);
        this.setRotateAngle(leftLeg, -0.2617993877991494F, -0.0F, 0.0F);
        this.tail1 = new MowzieModelRenderer(this, 61, 27);
        this.tail1.setRotationPoint(0.0F, -0.7F, 10.0F);
        this.tail1.addBox(-4.0F, 0.0F, 0.0F, 8, 7, 9, 0.0F);
        this.setRotateAngle(tail1, -0.017453292519943295F, -0.0F, 0.0F);
        this.rightUpperArm = new MowzieModelRenderer(this, 20, 18);
        this.rightUpperArm.setRotationPoint(-4.0F, 3.5F, -11.2F);
        this.rightUpperArm.addBox(-2.0F, -1.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(rightUpperArm, 0.35220744305245566F, -0.0F, 0.0F);
        this.lowerBody = new MowzieModelRenderer(this, 54, 43);
        this.lowerBody.setRotationPoint(0.0F, 4.8F, 1.0F);
        this.lowerBody.addBox(-5.0F, -1.0F, 0.0F, 10, 11, 10, 0.0F);
        this.setRotateAngle(lowerBody, -0.03490658503988659F, -0.0F, 0.0F);
        this.leftFoot = new MowzieModelRenderer(this, 10, 9);
        this.leftFoot.mirror = true;
        this.leftFoot.setRotationPoint(-0.1F, 9.4F, 0.5F);
        this.leftFoot.addBox(-1.0F, 0.0F, -5.0F, 3, 2, 6, 0.0F);
        this.setRotateAngle(leftFoot, 0.2617993877991494F, -0.0F, 0.0F);
        this.backNasalCrest = new MowzieModelRenderer(this, 103, 50);
        this.backNasalCrest.setRotationPoint(-0.5F, -1.35F, -5.1F);
        this.backNasalCrest.addBox(0.0F, -3.0F, -1.0F, 1, 3, 4, 0.0F);
        this.setRotateAngle(backNasalCrest, -0.8199556825869361F, -0.0F, 0.0F);
        this.rightLeg = new MowzieModelRenderer(this, 0, 4);
        this.rightLeg.setRotationPoint(-1.5F, 5.0F, 2.0F);
        this.rightLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 3, 0.0F);
        this.setRotateAngle(rightLeg, -0.2617993877991494F, -0.0F, 0.0F);
        this.lowerJaw = new MowzieModelRenderer(this, 23, 42);
        this.lowerJaw.setRotationPoint(0.0F, 2.2F, -6.7F);
        this.lowerJaw.addBox(-2.0F, 0.0F, -8.0F, 4, 1, 8, 0.0F);
        this.upperBody = new MowzieModelRenderer(this, 21, 19);
        this.upperBody.setRotationPoint(0.0F, 3.0F, 4.0F);
        this.upperBody.addBox(-4.0F, -4.0F, -12.0F, 8, 10, 12, 0.0F);
        this.setRotateAngle(upperBody, 0.08342673824532895F, -0.0F, 0.0F);
        this.neck = new MowzieModelRenderer(this, 0, 32);
        this.neck.setRotationPoint(0.0F, -1.2F, -10.0F);
        this.neck.addBox(-3.0F, -3.0F, -9.0F, 6, 7, 9, 0.0F);
        this.setRotateAngle(neck, -0.33161255787892263F, -0.0F, 0.0F);
        this.head = new MowzieModelRenderer(this, 0, 48);
        this.head.setRotationPoint(0.0F, 0.8F, -7.5F);
        this.head.addBox(-3.5F, -4.0F, -8.0F, 7, 8, 8, 0.0F);
        this.setRotateAngle(head, 0.3839724354387525F, 0.0F, 0.0F);
        this.frontNasalCrest = new MowzieModelRenderer(this, 95, 52);
        this.frontNasalCrest.setRotationPoint(-0.5F, -1.1F, -4.6F);
        this.frontNasalCrest.addBox(0.0F, -2.0F, 0.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(frontNasalCrest, 0.9309586230137754F, 0.0F, 0.0F);
        this.upperJaw = new MowzieModelRenderer(this, 30, 51);
        this.upperJaw.setRotationPoint(0.0F, -0.8F, -8.0F);
        this.upperJaw.addBox(-2.5F, -3.0F, -7.0F, 5, 6, 7, 0.0F);
        this.tail2.addChild(this.tail3);
        this.leftUpperArm.addChild(this.leftLowerArm);
        this.upperBody.addChild(this.leftUpperArm);
        this.rightUpperArm.addChild(this.rightLowerArm);
        this.head.addChild(this.rightHorn);
        this.tail1.addChild(this.tail2);
        this.rightLeg.addChild(this.rightFoot);
        this.head.addChild(this.leftHorn);
        this.leftThigh.addChild(this.leftLeg);
        this.lowerBody.addChild(this.tail1);
        this.upperBody.addChild(this.rightUpperArm);
        this.leftLeg.addChild(this.leftFoot);
        this.upperJaw.addChild(this.backNasalCrest);
        this.rightThigh.addChild(this.rightLeg);
        this.head.addChild(this.lowerJaw);
        this.lowerBody.addChild(this.upperBody);
        this.upperBody.addChild(this.neck);
        this.neck.addChild(this.head);
        this.upperJaw.addChild(this.frontNasalCrest);
        this.head.addChild(this.upperJaw);
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
