package org.geysermc.connector.network.translators.item;

import lombok.Getter;

@Getter
public class ToolItemEntry extends ItemEntry {
    private final String toolType;
    private final String toolTier;

    public ToolItemEntry(String javaIdentifier, int javaId, int bedrockId, int bedrockData, String toolType, String toolTier, boolean isBlock) {
        super(javaIdentifier, javaId, bedrockId, bedrockData, isBlock);
        this.toolType = toolType;
        this.toolTier = toolTier;
    }
}
