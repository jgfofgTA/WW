import Warriors.Battle
import Warriors.Team

fun main() {

    print("Input size of team ->   ")

    var ValueOfWarriors: Int = Integer.valueOf(readLine())
    var battle = Battle(Team(ValueOfWarriors), Team(ValueOfWarriors))

    println("Start of the battle")
    while (!battle.endOfBattle) {

        println(battle.getBattleState())
        battle.Battle()
    }
}