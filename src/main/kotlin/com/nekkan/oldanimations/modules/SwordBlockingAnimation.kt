package com.nekkan.oldanimations.modules

import com.nekkan.oldanimations.MinecraftIdentifier
import net.fabricmc.fabric.api.`object`.builder.v1.client.model.FabricModelPredicateProviderRegistry
import net.minecraft.item.Item
import net.minecraft.item.Items

class SwordBlockingAnimation: LegacyAnimation {

    //override val identifier: Identifier
    //    get() = Identifier("swordblocking", "")

    companion object {
        fun registerFor(item: Item, identifier: MinecraftIdentifier) {
            FabricModelPredicateProviderRegistry.register(item, identifier) { _, _, entity ->
                if(entity != null && entity.offHandStack.item == Items.SHIELD && entity.isUsingItem) 1f else 0f
            }
        }
    }

}
