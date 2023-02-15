package net.oliverrr.tutorialmod.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.oliverrr.tutorialmod.TutorialMod;
import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethods;
import org.spongepowered.asm.mixin.Mutable;

public class Multitool extends Item {
    public static final String NAME = "Multitool";

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> MULTITOOL = ITEMS.register("multitool",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.TUTORIAL_TAB)
                    .rarity(Rarity.EPIC)
                    .stacksTo(1)
                    .durability(255)
            ));

    public Multitool(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        player.giveExperienceLevels(-1);
        return super.use(level, player, interactionHand);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        context.getPlayer().giveExperienceLevels(1);
        return InteractionResult.SUCCESS;
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
