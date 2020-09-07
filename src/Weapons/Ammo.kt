package Weapons

import kotlin.random.Random

enum class Ammo(val damage: Int, val chanceOfCriticalDamage: Int, val coefficientOfCriticalDamage: Int) {

    PISTOLAMMO(20,35, 2),
    GUNAMMO(5, 25, 3),
    MACHINEGUNAMMO(7, 15, 4),
    ANNIHILATORGUNAMMO(100, 5, 7);

    private fun randomDamage() : Boolean {

        return Random.nextInt(0, 100)< chanceOfCriticalDamage
    }

    fun damage(): Int {

        if (randomDamage()) {

            return damage * coefficientOfCriticalDamage
        }
        else {

            return damage
        }
    }
}