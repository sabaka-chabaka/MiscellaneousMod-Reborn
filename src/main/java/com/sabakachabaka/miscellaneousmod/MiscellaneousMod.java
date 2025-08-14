package com.sabakachabaka.miscellaneousmod;

import com.sabakachabaka.miscellaneousmod.core.init.BlockInit;
import com.sabakachabaka.miscellaneousmod.core.init.FoodInit;
import com.sabakachabaka.miscellaneousmod.core.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = MiscellaneousMod.MODID)
public class MiscellaneousMod {
    public static final String MODID = "miscellaneousmod";

    public MiscellaneousMod() {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();

        BlockInit.BLOCKS.register(bus);
        ItemInit.ITEMS.register(bus);
        FoodInit.FOODS.register(bus);
    }

    public static final CreativeModeTab FOOD_TAB = new CreativeModeTab(MODID + "food_tab") {
        @Override
        public ItemStack makeIcon() {
            return null;
        }
    };
}