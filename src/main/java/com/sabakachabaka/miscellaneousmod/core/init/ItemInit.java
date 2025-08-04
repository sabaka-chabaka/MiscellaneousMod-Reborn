package com.sabakachabaka.miscellaneousmod.core.init;

import com.sabakachabaka.miscellaneousmod.MiscellaneousMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MiscellaneousMod.MODID);
}