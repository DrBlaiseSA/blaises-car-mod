package com.blaise.carmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlaiseCarMod implements ModInitializer {

    public static final String MOD_ID = "blaise_car_mod";

    // Örnek sprey item (ileride detaylandırılacak)
    public static final Item RED_SPRAY = new Item(new FabricItemSettings());

    @Override
    public void onInitialize() {
        System.out.println("Blaise's Car Mod başlatılıyor...");

        // Örnek item kaydı (gerçek kodlarda daha fazlası olacak)
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "red_spray"), RED_SPRAY);
    }
}
