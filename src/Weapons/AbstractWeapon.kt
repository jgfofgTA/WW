package Weapons

abstract class AbstractWeapon(val maxValueOfWeapon: Int, val fireType: FireType) {

    var listAmmo: MutableList<Ammo> = mutableListOf()

    fun checkOfRecharge(): Boolean {

        return listAmmo.size < fireType.weaponValue
    }

    abstract fun createOfAmmo(): Ammo

    fun recharge() {

        for(i in listAmmo.size until maxValueOfWeapon) {

            listAmmo.add(createOfAmmo())
        }
    }

    fun shoot(): Int {

        return createOfAmmo().damage()
    }
}