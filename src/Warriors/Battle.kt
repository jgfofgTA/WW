package Warriors

import kotlin.random.Random

class Battle(var command1: Team, var command2: Team, var endOfBattle: Boolean = false) {

    var random: Int = 0

    fun getBattleState() : String {

        return if (command1.listWarrior.isNotEmpty() && command2.listWarrior.isNotEmpty()) {

            BattleState.Progress(command1.sumHealth, command2.sumHealth).message
        }
        else if (command1.listWarrior.isNotEmpty() && command2.listWarrior.isEmpty()) {

            endOfBattle = true
            BattleState.CommandOneWon().message
        }
        else if (command1.listWarrior.isEmpty() && command2.listWarrior.isNotEmpty()) {

            endOfBattle = true; BattleState.CommandTwoWon().message
        }
        else {

            endOfBattle = true; BattleState.Draw().message
        }
    }

    fun Battle() {

        command1.shuffle()
        command2.shuffle()

        for (i in 0 until command1.valueOfWarriors) {

            if (command2.listWarrior.isNotEmpty()) {

                random = Random.nextInt(0, command2.valueOfWarriors)
                command2.sumHealth -= command2.listWarrior[random].takeDamage(command1.listWarrior[i].attack(command2.listWarrior[random]))

                if (command2.listWarrior[random].isKilled) {

                    command2.listWarrior.removeAt(random)
                    command2.valueOfWarriors--
                }
            }
        }

        for (i in 0 until command2.valueOfWarriors) {

            if (command1.listWarrior.isNotEmpty()) {

                random = Random.nextInt(0, command1.valueOfWarriors)
                command1.sumHealth -= command1.listWarrior[random].takeDamage(command2.listWarrior[i].attack(command1.listWarrior[random]))

                if (command1.listWarrior[random].isKilled) {

                    command1.listWarrior.removeAt(random)
                    command1.valueOfWarriors--
                }
            }
        }
    }
}