package Warriors

import kotlin.random.Random

class Team(var valueOfWarriors: Int) {

    var listWarrior: MutableList<AbstractWarrior> = filling(valueOfWarriors)
    var sumHealth: Int = 0

    fun shuffle() {

        listWarrior.shuffle()
    }

    private fun filling(valueOfWarriors: Int): MutableList<AbstractWarrior> {

        val helpList: MutableList<AbstractWarrior> = mutableListOf()

        for ( i in 0 until valueOfWarriors) {

            when(Random.nextInt(1, 5)) {

                1 -> helpList.add(ClassesOfWarriors.Juggernaut())
                2 -> helpList.add(ClassesOfWarriors.FootSoldier())
                3 -> helpList.add(ClassesOfWarriors.Commander())
                4 -> helpList.add(ClassesOfWarriors.TheExpendables())
            }
            sumHealth += helpList[i].health
        }
        return helpList
    }
}