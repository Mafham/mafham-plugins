package com.slayertaghighlight;

import net.runelite.client.config.*;

import java.awt.*;

@ConfigGroup("slayertaghighlight")
public interface SlayerTagHighlightConfig extends Config
{
	@Alpha
	@ConfigItem(
			position = 0,
			keyName = "highlightColor",
			name = "Highlight Color",
			description = "Sets the color of NPC/menu entry highlights"
	)
	default Color highlightColor() {return Color.RED;}

	@Range(min = 0, max = 50)
	@ConfigItem(
			position = 6,
			keyName = "tileWidth",
			name = "Tile Width",
			description = "Sets the width of tile highlight"
	)
	default double tileWidth() {return 2;}

	@Range(min = 0, max = 50)
	@ConfigItem(
			position = 7,
			keyName = "outlineWidth",
			name = "Outline Width",
			description = "Sets the width of outline highlight"
	)
	default double outlineWidth() {return 2;}

	@ConfigItem(
			position = 1,
			keyName = "tileHighlight",
			name = "Tile Highlight",
			description = "Highlights NPCs tiles"
	)
	default boolean tileHighlight()
	{
		return false;
	}

	@ConfigItem(
			position = 3,
			keyName = "hullHighlight",
			name = "Hull Highlight",
			description = "Highlight NPCs hulls"
	)
	default boolean hullHighlight()
	{
		return false;
	}

	@ConfigItem(
			position = 2,
			keyName = "outlineHighlight",
			name = "Outline Highlight",
			description = "Highlights NPCs outlines"
	)
	default boolean outlineHighlight()
	{
		return true;
	}


	@ConfigItem(
			position = 4,
			keyName = "menuHighlight",
			name = "Highlight Menu Names",
			description = "Highlights names in the right-click menu"
	)
	default boolean menuHighlight() {return true;}

	@ConfigItem(
			position = 5,
			keyName = "minimapHighlight",
			name = "Highlight Minimap",
			description = "Highlights the NPC on the minimap"
	)
	default boolean minimapHighlight(){return true;}

}
