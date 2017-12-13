package PokemonGame

import Moves._

trait Pokemon {
  var level: Int
  var nickname: String
  val typing1: Types
  val typing2: Types
  val baseHP: Int
  val baseAtk: Int
  val baseSpAtk: Int
  val baseDfc: Int
  val baseSpDfc: Int
  val baseSpeed: Int
  def atk = (((2 * baseAtk) * level) / 100) + 5
  def spAtk = (((2 * baseSpAtk) * level) / 100) + 5
  def dfc = (((2 * baseDfc) * level) / 100) + 5
  def spDfc = (((2 * baseSpDfc) * level) / 100) + 5
  def speed = (((2 * baseSpeed) * level) / 100) + 5
  def maxHP = (((baseHP * 2) * level) / 100) + level + 10
  var HP: Int
  //val dmg: Int
  //val atk: Int //Pokemons attack stat
  //val dfc: Int //Pokemons defence stat
  val attacks: Array[Move]

  override def toString: String = nickname + " " + "lvl: " + level
}


class Charizard(var initLvl: Int, val name: String) extends Pokemon {
  var level = initLvl
  var nickname = name
  val baseHP = 85
  val typing1 = Fire
  val typing2 = Flying
  val baseAtk = 84
  val baseDfc = 78
  val baseSpAtk = 109
  val baseSpDfc = 85
  val baseSpeed = 100
  var HP = maxHP
 // val dmg = 20
  val attacks = Array(flamethrower, slash, rage, wingattack)
 // val atk = 84 + level
  //val dfc = 78 + level
}

class Pikachu(var initLvl: Int, val name: String) extends Pokemon {
  var level = initLvl
  var nickname = name
  val baseHP = 35
  val typing1 = Electric
  val typing2 = None
  var HP = maxHP
  val baseAtk = 50
  val baseDfc = 35
  val baseSpAtk = 50
  val baseSpDfc = 50
  val baseSpeed = 90

  val dmg = 10
  val attacks = Array(leechLife)
  //val atk = 50 + (1 * level)
  //val dfc = 35 + (1 * level)
}

class Skarmory(var initLvl: Int, val name: String) extends Pokemon {
  var level = initLvl
  var nickname = name
  val baseHP = 65
  val typing1 = Steel
  val typing2 = Flying
  val baseAtk = 80
  val baseDfc = 140
  val baseSpAtk = 40
  val baseSpDfc = 70
  val baseSpeed = 70

  var HP = maxHP
  //val dmg = 20
  val attacks = Array(steelWing, aerialAce, slash, nightSlash)
}

class Claydol(var initLvl: Int, val name: String) extends Pokemon {
  var level = initLvl
  var nickname = name
  val baseHP = 60
  val typing1 = Ground
  val typing2 = Psychic
  val baseAtk = 70
  val baseDfc = 105
  val baseSpAtk = 70
  val baseSpDfc = 120
  val baseSpeed = 75

  var HP = maxHP
  //val dmg = 20
  val attacks = Array(earthquake, ancientPower, psybeam, extrasensory)
}

class Aggron(var initLvl: Int, val name: String) extends Pokemon {
  var level = initLvl
  var nickname = name
  val baseHP = 70
  val typing1 = Steel
  val typing2 = Rock
  val baseAtk = 110
  val baseDfc = 180
  val baseSpAtk = 60
  val baseSpDfc = 60
  val baseSpeed = 50

  var HP = maxHP
  //val dmg = 20
  val attacks = Array(earthquake, dragonClaw, thunder, solarBeam)
}

class Cradily(var initLvl: Int, val name: String) extends Pokemon {
  var level = initLvl
  var nickname = name
  val baseHP = 86
  val typing1 = Rock
  val typing2 = Grass
  val baseAtk = 81
  val baseDfc = 97
  val baseSpAtk = 81
  val baseSpDfc = 107
  val baseSpeed = 43
  var HP = maxHP
  //val dmg = 20
  val attacks = Array(sludgeBomb, ancientPower, gigaDrain, brine)
}

class Armaldo(var initLvl: Int, val name: String) extends Pokemon {
  var level = initLvl
  var nickname = name
  val baseHP = 75
  val typing1 = Rock
  val typing2 = Bug
  val baseAtk = 125
  val baseDfc = 100
  val baseSpAtk = 70
  val baseSpDfc = 80
  val baseSpeed = 45
  var HP = maxHP
  //val dmg = 20
  val attacks = Array(slash, ancientPower, aerialAce, waterPulse)
}

class Metagross(var initLvl: Int, val name: String) extends Pokemon {
  var level = initLvl
  var nickname = name
  val baseHP = 80
  val typing1 = Steel
  val typing2 = Psychic
  val baseAtk = 135
  val baseDfc = 130
  val baseSpAtk = 95
  val baseSpDfc = 90
  val baseSpeed = 70
  var HP = maxHP
  //val dmg = 20
  val attacks = Array(meteorMash, earthquake, psychic, hyperBeam)
}

class Swampert(var initLvl: Int, val name: String) extends Pokemon {
  var level = initLvl
  var nickname = name
  val baseHP = 100
  val typing1 = Water
  val typing2 = Ground
  val baseAtk = 110
  val baseDfc = 90
  val baseSpAtk = 95
  val baseSpDfc = 110
  val baseSpeed = 70
  var HP = maxHP
  //val dmg = 20
  val attacks = Array(meteorMash, earthquake, psychic, hyperBeam)
}

