/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gowmine.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.gowmine.item.SwordofolympusItem;
import net.mcreator.gowmine.item.PoseydonsArmorItem;
import net.mcreator.gowmine.GowMineMod;

import java.util.function.Function;

public class GowMineModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(GowMineMod.MODID);
	public static final DeferredItem<Item> SWORDOFOLYMPUS;
	public static final DeferredItem<Item> POSEYDONS_ARMOR_HELMET;
	public static final DeferredItem<Item> POSEYDONS_ARMOR_CHESTPLATE;
	public static final DeferredItem<Item> POSEYDONS_ARMOR_LEGGINGS;
	public static final DeferredItem<Item> POSEYDONS_ARMOR_BOOTS;
	static {
		SWORDOFOLYMPUS = register("swordofolympus", SwordofolympusItem::new);
		POSEYDONS_ARMOR_HELMET = register("poseydons_armor_helmet", PoseydonsArmorItem.Helmet::new);
		POSEYDONS_ARMOR_CHESTPLATE = register("poseydons_armor_chestplate", PoseydonsArmorItem.Chestplate::new);
		POSEYDONS_ARMOR_LEGGINGS = register("poseydons_armor_leggings", PoseydonsArmorItem.Leggings::new);
		POSEYDONS_ARMOR_BOOTS = register("poseydons_armor_boots", PoseydonsArmorItem.Boots::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, Item.Properties::new);
	}
}