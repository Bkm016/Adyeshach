package ink.ptms.adyeshach.common.bukkit

/**
 * @Author sky
 * @Since 2020-08-17 15:39
 */
enum class BukkitFoxType {

    RED,

    SNOW;

    companion object {

        fun of(index: Int): BukkitFoxType {
            return values().first { it.ordinal == index }
        }
    }
}