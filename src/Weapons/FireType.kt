package Weapons

sealed class FireType(val weaponValue: Int) {

    class SingleType(): FireType(1)
    class QueueType(ammoCount: Int): FireType(ammoCount)
}