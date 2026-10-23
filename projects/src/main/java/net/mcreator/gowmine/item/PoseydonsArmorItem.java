package net.mcreator.gowmine.item;

import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;

import java.util.Map;

public abstract class PoseydonsArmorItem extends Item {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(165, Map.of(ArmorType.BOOTS, 67, ArmorType.LEGGINGS, 67, ArmorType.CHESTPLATE, 67, ArmorType.HELMET, 67, ArmorType.BODY, 67), 255,
			BuiltInRegistries.SOUND_EVENT.wrapAsHolder(SoundEvents.EMPTY), 150f, 0f, TagKey.create(Registries.ITEM, Identifier.parse("gow_mine:poseydons_armor_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, Identifier.parse("gow_mine:poseydons_armor")));

	private PoseydonsArmorItem(Item.Properties properties) {
		super(properties);
	}

	public static class Helmet extends PoseydonsArmorItem {
		public Helmet(Item.Properties properties) {
			super(properties.rarity(Rarity.EPIC).humanoidArmor(ARMOR_MATERIAL, ArmorType.HELMET));
		}
	}

	public static class Chestplate extends PoseydonsArmorItem {
		public Chestplate(Item.Properties properties) {
			super(properties.rarity(Rarity.EPIC).humanoidArmor(ARMOR_MATERIAL, ArmorType.CHESTPLATE));
		}
	}

	public static class Leggings extends PoseydonsArmorItem {
		public Leggings(Item.Properties properties) {
			super(properties.rarity(Rarity.EPIC).humanoidArmor(ARMOR_MATERIAL, ArmorType.LEGGINGS));
		}
	}

	public static class Boots extends PoseydonsArmorItem {
		public Boots(Item.Properties properties) {
			super(properties.rarity(Rarity.EPIC).humanoidArmor(ARMOR_MATERIAL, ArmorType.BOOTS));
		}
	}
}