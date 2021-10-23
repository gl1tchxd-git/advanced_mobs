package at.thebuckey_.advanced_mobs.core.init;

import at.thebuckey_.advanced_mobs.core.init.item.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab ADVANCED_MOBS = new CreativeModeTab("advanced_mobs_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.TITANIUM_NUGGET.get());
        }
    };
    public static final CreativeModeTab ADVANCED_MOBS_MISC = new CreativeModeTab("advanced_mobs_misc_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.TITANIUM_INGOT.get());
        }
    };


}
