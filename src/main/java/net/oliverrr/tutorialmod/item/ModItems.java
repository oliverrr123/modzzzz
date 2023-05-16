package net.oliverrr.tutorialmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.oliverrr.tutorialmod.TutorialMod;
import net.oliverrr.tutorialmod.item.custom.Chocolate;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> RAW_ZIRCON = ITEMS.register("raw_zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> CHOCOLATE = ITEMS.register("chocolate",
            () -> new Chocolate(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> DROP_OF_CHOCOLATE = ITEMS.register("drop_of_chocolate",
            () -> new Chocolate(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

//    public static class Foods() {
//        public static final Food CHOCOLATE;
//    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

//    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
//            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
//
//    public static void register(IEventBus eventBus) {
//        ITEMS.register(eventBus);
//    }
}
