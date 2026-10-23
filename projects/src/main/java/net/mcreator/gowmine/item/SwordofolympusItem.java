package net.mcreator.gowmine.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class SwordofolympusItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 100, 20f, 0, 20, TagKey.create(Registries.ITEM, Identifier.parse("gow_mine:swordofolympus_repair_items")));

	public SwordofolympusItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 19f, -1.7f));
	}
}