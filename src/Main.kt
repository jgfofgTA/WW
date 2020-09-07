import Warriors.Battle
import Warriors.Team

/*
Создать точку входа в программу.
Пользователь вводит количество воинов в команде.
Создается битва.
Пока битва не завершена происходит совершение следующей итерации.
При итерациях выводится промежуточное состояние битвы.
По окончании битвы выводится команда - победитель.

Примерное содержание файла:
Input size of team -> 10
Start of the battle
Health of first team - 8750, health of second team - 16500
Health of first team - 8530, health of second team - 16430
Health of first team - 8320, health of second team - 16220
...
Health of first team - 80, health of second team - 6520
Health of first team - 80, health of second team - 6460
Health of first team - 10, health of second team - 6410
Second Team is wins!
*/
fun main() {

    print("Input size of team ->   ")
    var ValueOfWarriors: Int = 10//Integer.valueOf(readLine())

    var battle = Battle(Team(ValueOfWarriors), Team(ValueOfWarriors))
    println("Start of the battle")
    while (!battle.endOfBattle) {

        println(battle.getBattleState())
        battle.Battle()
    }
}
