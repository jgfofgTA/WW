package Weapons

object Weapons {

    val singleType: FireType.SingleType = FireType.SingleType()

    object PISTOL: AbstractWeapon(maxValueOfWeapon = 7, fireType = singleType) {

        override fun createOfAmmo(): Ammo {

            return Ammo.PISTOLAMMO
        }
    }

    object GUN: AbstractWeapon(maxValueOfWeapon = 30, fireType = FireType.QueueType(30)) {

        override fun createOfAmmo(): Ammo {

            return Ammo.GUNAMMO
        }
    }

    object MACHINEGUN: AbstractWeapon(maxValueOfWeapon = 120, fireType = FireType.QueueType(60)) {

        override fun createOfAmmo(): Ammo {

            return Ammo.MACHINEGUNAMMO
        }
    }

    object ANNIHILATORGUN: AbstractWeapon(maxValueOfWeapon = 1, fireType = singleType) {

        override fun createOfAmmo(): Ammo {

            return Ammo.ANNIHILATORGUNAMMO
        }
    }
}