package com.tutorial.neutrino.first_entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.item.BoatEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FlyingSwordEntity extends Entity {
    private Logger logger = LogManager.getLogger();
    private static final DataParameter<Integer> COUNTER = EntityDataManager.createKey(BoatEntity.class, DataSerializers.VARINT);

    public FlyingSwordEntity(EntityType<?> entityTypeIn, World worldIn) {
        super(entityTypeIn, worldIn);
    }

    @Override
    protected void registerData() {
        this.dataManager.register(COUNTER, 0);
    }

    @Override
    protected void readAdditional(CompoundNBT compound) {
        this.dataManager.set(COUNTER, compound.getInt("counter"));
    }

    @Override
    protected void writeAdditional(CompoundNBT compound) {
        compound.putInt("counter", this.dataManager.get(COUNTER));
    }

    @Override
    public void tick() {
        if (world.isRemote) {
            logger.info(this.dataManager.get(COUNTER));
        }
        if (!world.isRemote) {
            logger.info(this.dataManager.get(COUNTER));
            this.dataManager.set(COUNTER, this.dataManager.get(COUNTER) + 1);
        }
        super.tick();
    }

    @Override
    public IPacket<?> createSpawnPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }
}
