package com.blaise.carmod.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;

public class TofasEntity extends MobEntity {

    public TofasEntity(EntityType<? extends MobEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public void tick() {
        super.tick();
        // Test amaçlı her tikte ileri gitme efekti:
        this.setVelocity(0.1, this.getVelocity().y, 0);
    }
}
