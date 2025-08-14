package com.sabakachabaka.miscellaneousmod.core.init;

import com.sabakachabaka.miscellaneousmod.MiscellaneousMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FoodInit {
    public static final DeferredRegister<Item> FOODS = DeferredRegister.create(ForgeRegistries.ITEMS, MiscellaneousMod.MODID);
}