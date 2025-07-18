package com.blaise.carmod.client.model;

import com.blaise.carmod.entity.TofasEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class TofasModel extends DefaultedEntityGeoModel<TofasEntity> {
    public TofasModel() {
        super("blaise:tofas");
    }
}
