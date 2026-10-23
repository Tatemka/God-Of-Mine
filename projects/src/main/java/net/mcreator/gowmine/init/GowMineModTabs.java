/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gowmine.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.gowmine.GowMineMod;

@EventBusSubscriber
public class GowMineModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GowMineMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(GowMineModItems.SWORDOFOLYMPUS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(GowMineModItems.POSEYDONS_ARMOR_HELMET.get());
			tabData.accept(GowMineModItems.POSEYDONS_ARMOR_CHESTPLATE.get());
			tabData.accept(GowMineModItems.POSEYDONS_ARMOR_LEGGINGS.get());
			tabData.accept(GowMineModItems.POSEYDONS_ARMOR_BOOTS.get());
		}
	}
}