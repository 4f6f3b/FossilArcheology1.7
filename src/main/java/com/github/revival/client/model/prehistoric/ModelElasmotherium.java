package com.github.revival.client.model.prehistoric;

import net.ilexiconn.llibrary.client.model.modelbase.MowzieModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;

import org.lwjgl.opengl.GL11;

import com.github.revival.client.model.base.ModelPrehistoric;
import com.github.revival.common.entity.mob.EntityElasmotherium;
import com.github.revival.common.entity.mob.test.EntityNewPrehistoric;

public class ModelElasmotherium extends ModelPrehistoric
{
    private MowzieModelRenderer headpivot;
    private MowzieModelRenderer head;
    private MowzieModelRenderer rightHorn;
    private MowzieModelRenderer leftHorn;
    private MowzieModelRenderer crest;
    private MowzieModelRenderer rightBackUpperLeg;
    private MowzieModelRenderer beakHorn;
    private MowzieModelRenderer beak;
    private MowzieModelRenderer rightBackLowerLeg;
    private MowzieModelRenderer leftBackUpperLeg;
    private MowzieModelRenderer leftBackLowerLeg;
    private MowzieModelRenderer leftFrontUpperLeg;
    private MowzieModelRenderer leftFrontLowerLeg;
    private MowzieModelRenderer rightFrontUpperLeg;
    private MowzieModelRenderer rightFrontLowerLeg;
    private MowzieModelRenderer lowerBody;
    private MowzieModelRenderer tail1;
    private MowzieModelRenderer neck;
    private MowzieModelRenderer headdummy;
    private MowzieModelRenderer upperBody;
    private MowzieModelRenderer lowerJaw;
    private MowzieModelRenderer upperJaw;
    private MowzieModelRenderer torso;
    private MowzieModelRenderer upperHorn;
    private MowzieModelRenderer lowerHorn;
    private MowzieModelRenderer elasmotherium;
    private MowzieModelRenderer neckpivot;

    public ModelElasmotherium()
    {
        textureWidth = 256;
        textureHeight = 128;
        setTextureOffset("leftBackUpperLeg.leftBackUpperLeg", 89, 60);
        setTextureOffset("leftBackLowerLeg.leftBackLowerLeg", 68, 98);
        setTextureOffset("rightBackUpperLeg.rightBackUpperLeg", 89, 60);
        setTextureOffset("rightBackLowerLeg.rightBackLowerLeg", 68, 98);
        setTextureOffset("rightFrontUpperLeg.rightFrontUpperLeg", 157, 0);
        setTextureOffset("rightFrontLowerLeg.rightFrontLowerLeg", 68, 98);
        setTextureOffset("leftFrontUpperLeg.leftFrontUpperLeg", 157, 0);
        setTextureOffset("leftFrontLowerLeg.leftFrontLowerLeg", 68, 98);
        setTextureOffset("torso.torso", 0, 0);
        setTextureOffset("upperBody.upperBody", 0, 64);
        setTextureOffset("neck.neck", 0, 102);
        setTextureOffset("head.head", 0, 42);
        setTextureOffset("lowerJaw.lowerJaw", 78, 81);
        setTextureOffset("upperJaw.upperJaw", 86, 42);
        setTextureOffset("lowerHorn.lowerHorn", 57, 61);
        setTextureOffset("upperHorn.upperHorn", 53, 44);
        setTextureOffset("lowerBody.lowerBody", 89, 0);
        setTextureOffset("tail1.tail1", 0, 0);
        
        elasmotherium = new MowzieModelRenderer(this, "elasmotherium");
        elasmotherium.setRotationPoint(0F, 24F, 0F);
        setRotateAngle(elasmotherium, 0F, 0F, 0F);
        elasmotherium.mirror = true;
        leftBackUpperLeg = new MowzieModelRenderer(this, "leftBackUpperLeg");
        leftBackUpperLeg.setRotationPoint(6F, -16.5F, 20.5F);
        setRotateAngle(leftBackUpperLeg, 0F, 0F, 0F);
        leftBackUpperLeg.mirror = true;
        leftBackUpperLeg.mirror = true;
        leftBackUpperLeg.addBox("leftBackUpperLeg", 0F, 0F, -2.9F, 4, 10, 6);
        leftBackUpperLeg.mirror = false;
        leftBackLowerLeg = new MowzieModelRenderer(this, "leftBackLowerLeg");
        leftBackLowerLeg.setRotationPoint(1F, 8F, 2F);
        setRotateAngle(leftBackLowerLeg, 0F, 0F, 0F);
        leftBackLowerLeg.mirror = true;
        leftBackLowerLeg.mirror = true;
        leftBackLowerLeg.addBox("leftBackLowerLeg", -2F, 0.5F, -3.5F, 4, 8, 5);
        leftBackLowerLeg.mirror = false;
        leftBackUpperLeg.addChild(leftBackLowerLeg);
        elasmotherium.addChild(leftBackUpperLeg);
        rightBackUpperLeg = new MowzieModelRenderer(this, "rightBackUpperLeg");
        rightBackUpperLeg.setRotationPoint(-6F, -16.5F, 20.5F);
        setRotateAngle(rightBackUpperLeg, 0F, 0F, 0F);
        rightBackUpperLeg.mirror = true;
        rightBackUpperLeg.addBox("rightBackUpperLeg", -4F, 0F, -2.9F, 4, 10, 6);
        rightBackLowerLeg = new MowzieModelRenderer(this, "rightBackLowerLeg");
        rightBackLowerLeg.setRotationPoint(-1F, 8F, 2F);
        setRotateAngle(rightBackLowerLeg, 0F, 0F, 0F);
        rightBackLowerLeg.mirror = true;
        rightBackLowerLeg.addBox("rightBackLowerLeg", -2F, 0.5F, -3.5F, 4, 8, 5);
        rightBackUpperLeg.addChild(rightBackLowerLeg);
        elasmotherium.addChild(rightBackUpperLeg);
        rightFrontUpperLeg = new MowzieModelRenderer(this, "rightFrontUpperLeg");
        rightFrontUpperLeg.setRotationPoint(-7F, -17.5F, -7F);
        setRotateAngle(rightFrontUpperLeg, 0F, 0F, 0F);
        rightFrontUpperLeg.mirror = true;
        rightFrontUpperLeg.addBox("rightFrontUpperLeg", -3.6F, 0F, -3F, 4, 10, 6);
        rightFrontLowerLeg = new MowzieModelRenderer(this, "rightFrontLowerLeg");
        rightFrontLowerLeg.setRotationPoint(-1F, 9.5F, -0.3F);
        setRotateAngle(rightFrontLowerLeg, 0F, 0F, 0F);
        rightFrontLowerLeg.mirror = true;
        rightFrontLowerLeg.addBox("rightFrontLowerLeg", -2.2F, 0F, -2F, 4, 8, 5);
        rightFrontUpperLeg.addChild(rightFrontLowerLeg);
        elasmotherium.addChild(rightFrontUpperLeg);
        leftFrontUpperLeg = new MowzieModelRenderer(this, "leftFrontUpperLeg");
        leftFrontUpperLeg.setRotationPoint(7F, -17.5F, -7F);
        setRotateAngle(leftFrontUpperLeg, 0F, 0F, 0F);
        leftFrontUpperLeg.mirror = true;
        leftFrontUpperLeg.mirror = true;
        leftFrontUpperLeg.addBox("leftFrontUpperLeg", -0.2F, 0F, -3F, 4, 10, 6);
        leftFrontUpperLeg.mirror = false;
        leftFrontLowerLeg = new MowzieModelRenderer(this, "leftFrontLowerLeg");
        leftFrontLowerLeg.setRotationPoint(1F, 9.5F, -0.3F);
        setRotateAngle(leftFrontLowerLeg, 0F, 0F, 0F);
        leftFrontLowerLeg.mirror = true;
        leftFrontLowerLeg.mirror = true;
        leftFrontLowerLeg.addBox("leftFrontLowerLeg", -1.8F, 0F, -2F, 4, 8, 5);
        leftFrontLowerLeg.mirror = false;
        leftFrontUpperLeg.addChild(leftFrontLowerLeg);
        elasmotherium.addChild(leftFrontUpperLeg);
        torso = new MowzieModelRenderer(this, "torso");
        torso.setRotationPoint(0F, -16.5F, -2.5F);
        setRotateAngle(torso, 0F, 0F, 0F);
        torso.mirror = true;
        torso.addBox("torso", -8F, -11F, 0F, 16, 22, 17);
        upperBody = new MowzieModelRenderer(this, "upperBody");
        upperBody.setRotationPoint(0F, -10.5F, 1F);
        setRotateAngle(upperBody, 0F, 0F, 0F);
        upperBody.mirror = true;
        upperBody.addBox("upperBody", -7F, -1F, -11F, 14, 22, 11);
        neckpivot = new MowzieModelRenderer(this, "neckpivot");
        neckpivot.setRotationPoint(0F, 10.5F, -7F);
        setRotateAngle(neckpivot, 0F, 0F, 0F);
        neck = new MowzieModelRenderer(this, "neck");
        neck.setRotationPoint(0F, 0F, 0F);
        setRotateAngle(neck, 0F, 0F, 0F);
        neck.mirror = true;
        neck.addBox("neck", -5.5F, -8F, -9F, 11, 16, 9);
        head = new MowzieModelRenderer(this, "head");
        head.setRotationPoint(0F, -4F, -10.5F);
        setRotateAngle(head, 0F, 0F, 0F);
        head.mirror = true;
        head.addBox("head", -4.5F, -3F, -4F, 9, 10, 7);
        lowerJaw = new MowzieModelRenderer(this, "lowerJaw");
        lowerJaw.setRotationPoint(0F, 4F, -2.8F);
        setRotateAngle(lowerJaw, 0F, 0F, 0F);
        lowerJaw.mirror = true;
        lowerJaw.addBox("lowerJaw", -1.5F, -1.5F, -7F, 3, 3, 7);
        head.addChild(lowerJaw);
        upperJaw = new MowzieModelRenderer(this, "upperJaw");
        upperJaw.setRotationPoint(0F, 0F, -3F);
        setRotateAngle(upperJaw, 0F, 0F, 0F);
        upperJaw.mirror = true;
        upperJaw.addBox("upperJaw", -2.5F, -3F, -7F, 5, 6, 7);
        lowerHorn = new MowzieModelRenderer(this, "lowerHorn");
        lowerHorn.setRotationPoint(0F, -2.5F, -1F);
        setRotateAngle(lowerHorn, 0F, 0F, 0F);
        lowerHorn.mirror = true;
        lowerHorn.addBox("lowerHorn", -1.5F, -8F, -2F, 3, 8, 4);
        upperHorn = new MowzieModelRenderer(this, "upperHorn");
        upperHorn.setRotationPoint(0F, -5F, 0F);
        setRotateAngle(upperHorn, 0F, 0F, 0F);
        upperHorn.mirror = true;
        upperHorn.addBox("upperHorn", -1F, -12F, -1F, 2, 12, 2);
        lowerHorn.addChild(upperHorn);
        upperJaw.addChild(lowerHorn);
        head.addChild(upperJaw);
        neck.addChild(head);
        neckpivot.addChild(neck);
        upperBody.addChild(neckpivot);
        torso.addChild(upperBody);
        lowerBody = new MowzieModelRenderer(this, "lowerBody");
        lowerBody.setRotationPoint(0F, -9.5F, 16F);
        setRotateAngle(lowerBody, 0F, 0F, 0F);
        lowerBody.mirror = true;
        lowerBody.addBox("lowerBody", -6F, 0F, 0F, 12, 18, 12);
        tail1 = new MowzieModelRenderer(this, "tail1");
        tail1.setRotationPoint(0F, 8F, 12F);
        setRotateAngle(tail1, 0F, 0F, 0F);
        tail1.mirror = true;
        tail1.addBox("tail1", -1F, 0F, -3F, 2, 8, 3);
        lowerBody.addChild(tail1);
        torso.addChild(lowerBody);
        elasmotherium.addChild(torso);
        doMowzieStuff(false);
    }

    /*
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        EntityElasmotherium entity = (EntityElasmotherium) var1;
        this.setRotationAngles(var2, var3, var4, var5, var6, var7);
        
        boolean isAdult = entity.isAdult();
        float childSize = entity.getEntitySize();
        
        GL11.glPushMatrix();

        if (!isAdult)
        {
            GL11.glScalef(childSize, childSize, childSize);
            GL11.glTranslatef(0.0F, 2.0F - childSize * 2, 0.0F);
        }
        else
        {
            GL11.glScalef(1.5F, 1.5F, 1.5F);
            GL11.glTranslatef(0.0F, -0.5F, 0.0F);
        }
        
        this.elasmotherium.render(var7);
        
        GL11.glPopMatrix();
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6)
    {
        this.lowerBody.rotateAngleX = (float) Math.toRadians(-5);
        this.upperBody.rotateAngleX = (float) Math.toRadians(7);
        //this.neck.rotateAngleX = (float)Math.toRadians(10);
        this.lowerHorn.rotateAngleX = (float) Math.toRadians(10);
        this.upperHorn.rotateAngleX = (float) Math.toRadians(-5);
        this.tail1.rotateAngleX = (float) Math.toRadians(30);

        this.neckpivot.rotateAngleX = (var5 * 0.3F) / (180F / (float) Math.PI);
        this.neckpivot.rotateAngleY = (var4 * 0.3F) / (180F / (float) Math.PI);

        this.leftFrontUpperLeg.rotateAngleX = MathHelper.cos((var1) * 0.63330555F + 1) * 0.7F * var2;
        this.rightFrontUpperLeg.rotateAngleX = MathHelper.cos((var1) * 0.63330555F + (float) Math.PI) * 0.7F * var2;
        this.leftBackUpperLeg.rotateAngleX = MathHelper.cos((var1) * 0.63330555F + (float) Math.PI + 2) * 0.7F * var2;
        this.rightBackUpperLeg.rotateAngleX = MathHelper.cos((var1) * 0.63330555F + 1) * 0.7F * var2;
    }

   
    public void setLivingAnimations(EntityLivingBase entity, float var2, float var3, float var4)
    {
        EntityElasmotherium elasmotherium = (EntityElasmotherium) entity;
        int attackTimer = elasmotherium.getattackTimer();
        if (attackTimer > 0)
        {
            this.neck.rotateAngleX = (float) Math.toRadians(-15) + 0.125F * this.swingProgress((float) attackTimer - var4, 10.0F);
        }
        else
        {
            if (elasmotherium.isAngry())
            {
                this.neck.rotateAngleX = (float) Math.toRadians(30);
            }
            else
            {
                this.neck.rotateAngleX = (float) Math.toRadians(10);
            }
        }

    }

    private float swingProgress(float var1, float var2)
    {
        return (Math.abs(var1 % var2 - var2 * 0.5F) - var2 * 0.25F) / (var2 * 0.25F);
    }
 */
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
