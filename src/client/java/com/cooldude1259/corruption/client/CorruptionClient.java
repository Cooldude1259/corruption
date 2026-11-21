package com.cooldude1259.corruption.client;

import com.cooldude12.unnoficialtadc.client.CostumeBlockEntityRenderer;
import com.cooldude1259.corruption.CorruptionBlockEntities;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;

public class CorruptionClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// Reuse tadc-mc's costume renderer for this mod's own block entity type
		BlockEntityRenderers.register(CorruptionBlockEntities.COSTUME, CostumeBlockEntityRenderer::new);
	}
}
