package com.purplenetwork.invictus.item;

import com.purplenetwork.invictus.Invictus;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Invictus.MODID);


    public static void register(IEventBus bus) {ITEMS.register(bus);}
}

