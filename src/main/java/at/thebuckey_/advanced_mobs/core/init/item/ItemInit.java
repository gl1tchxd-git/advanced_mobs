package at.thebuckey_.advanced_mobs.core.init.item;

import at.thebuckey_.advanced_mobs.Advanced_mobs;
import at.thebuckey_.advanced_mobs.core.init.ModCreativeModeTab;
import net.minecraft.client.renderer.EffectInstance;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.io.IOException;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Advanced_mobs.MOD_ID);
    // Titanium Ingot:
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ADVANCED_MOBS_MISC)));
    // Titanium Nugget
    public static final RegistryObject<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ADVANCED_MOBS_MISC)));
    // Raw Titanium
    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ADVANCED_MOBS_MISC)));
    //Power Tomato
    public static final RegistryObject<Item> POWER_TOMATO = ITEMS.register("power_tomato", () -> new Item(
            new Item.Properties()
                    .tab(ModCreativeModeTab.ADVANCED_MOBS)
                    .food(new FoodProperties.Builder()
                            .nutrition(2)
                            .saturationMod(1f)
                            .alwaysEat()
                            .fast()
                            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 400, 25), 1)
                            .build()
                    )
    ));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }



}
