package ink.ptms.adyeshach.api.event

import ink.ptms.adyeshach.common.entity.EntityInstance
import io.izzel.taboolib.module.event.EventNormal
import org.bukkit.Bukkit

/**
 * @Author sky
 * @Since 2020-08-14 19:21
 */
class AdyeshachEntityRemoveEvent(val entity: EntityInstance) : EventNormal<AdyeshachEntityRemoveEvent>() {

    init {
        async(!Bukkit.isPrimaryThread())
    }
}