package Warriors

sealed class BattleState() {

    abstract val message: String

    class Progress(var sumHealthFirstCommand: Int, var sumHealthSecondCommand: Int,override val message: String = "HealthOfFirstTeam -> $sumHealthFirstCommand, health of second team -> $sumHealthSecondCommand"): BattleState()
    class CommandOneWon(override val message: String = "First command WON!"): BattleState()
    class CommandTwoWon(override val message: String = "Second command WON!"): BattleState()
    class Draw(override val message: String = "Draw!"): BattleState()
}