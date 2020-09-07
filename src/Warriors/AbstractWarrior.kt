package Warriors

import Weapons.AbstractWeapon
import kotlin.random.Random

abstract class AbstractWarrior(
        maxHealth: Int,
        override var isKilled: Boolean,
        override val chanceToAvoidBeingHit: Int,
        val accuracy: Int,
        val abstractWeapon: AbstractWeapon
) : Warrior {

    var health: Int = maxHealth
    var sumDamage: Int = 0

    override fun attack(warrior: Warrior): Int {

        if(abstractWeapon.checkOfRecharge()) {

            abstractWeapon.recharge()
        }
        else {

            for (i in 0 until abstractWeapon.fireType.weaponValue) {

                if((Random.nextInt(0, 100) >= accuracy) && (Random.nextInt(0, 100) >= warrior.chanceToAvoidBeingHit)) {

                    sumDamage += abstractWeapon.shoot()
                }
                abstractWeapon.listAmmo.removeAt(0)
            }
        }
        return sumDamage
    }

    override fun takeDamage(damage: Int): Int {

        if (health <= damage) {

            isKilled = true
            return health
        }
        else {

            health -= damage
            return damage
        }
    }
}