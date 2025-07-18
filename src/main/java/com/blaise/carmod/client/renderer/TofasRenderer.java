package com.blaise.carmod.client.renderer;

import com.blaise.carmod.entity.TofasEntity;
import com.blaise.carmod.client.model.TofasModel;
import net.minecraft.client.render.entity.EntityRendererFactory;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class TofasRenderer extends GeoEntityRenderer<TofasEntity> {
    public TofasRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new TofasModel());
    }
}
