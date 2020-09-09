package Warriors

import Weapons.Weapons

class ClassesOfWarriors {

    class Juggernaut(): AbstractWarrior(2000, 25, 50, abstractWeapon = Weapons.ANNIHILATORGUN)
    class FootSoldier(): AbstractWarrior(350, 40, 50, abstractWeapon = Weapons.GUN)
    class Commander(): AbstractWarrior(700, 55, 75, abstractWeapon = Weapons.PISTOL)
    class TheExpendables(): AbstractWarrior(1000, 65, 85, abstractWeapon = Weapons.MACHINEGUN)
}