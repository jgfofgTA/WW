package Warriors

interface Warrior {

    var isKilled: Boolean
    val chanceToAvoidBeingHit: Int

    fun attack(warrior: Warrior): Int
    fun takeDamage(damage: Int): Int
}