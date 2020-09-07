package Warriors

import Weapons.Weapons

class ClassesOfWarriors {

    class Juggernaut(): AbstractWarrior(2000, false,25, 50, abstractWeapon = Weapons.ANNIHILATORGUN)
    class FootSoldier(): AbstractWarrior(350, false, 40, 50, abstractWeapon = Weapons.GUN)
    class Commander(): AbstractWarrior(700, false,55, 75, abstractWeapon = Weapons.PISTOL)
    class TheExpendables(): AbstractWarrior(1000, false,65, 85, abstractWeapon = Weapons.MACHINEGUN)
}