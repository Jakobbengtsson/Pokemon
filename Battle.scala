package PokemonGame

import PokemonGame.Game.slowPrint
import Moves._
import Effectiveness.totResult
import PokemonGame.Trainers.player


object Battle {

  var opponent  = Trainers.steven
  var player    = Trainers.player

  var crntPkmn: Pokemon =  player.party(Game.playerIndex)

  var optPkmn: Pokemon = opponent.party(Game.opponentIndex)
    //new Pikachu(50, "Pikachu")


  def dmgCalc(atkr: Pokemon, dfndr: Pokemon, attack: Move): Unit = {

    def dmgMultiplier = {
      if (attack.isPhysical) atkr.atk.toDouble / dfndr.dfc.toDouble
      else atkr.spAtk.toDouble / dfndr.spDfc.toDouble
    }

    def stab: Double = {
      if(atkr.typing1 == attack.types) { 1.5 }
      else 1
    }

    def efctMltplr = {    //Effectiveness Multiplier for the attack
      totResult = 1.0
      Effectiveness.effectiveness(attack.types, dfndr.typing1)
      Effectiveness.effectiveness(attack.types, dfndr.typing2)
      //println(Effectiveness.totResult)

      if(totResult == 4 || totResult == 2)      Game.slowPrint("\nIt's super effective!")
      if(totResult == 0.5 || totResult == 0.25) Game.slowPrint("\nIt's not very effective...")
      if(totResult == 0)                        Game.slowPrint("\nIt doesn't affect...")

      totResult

    }

    def damage = {
      (((((2 * atkr.level.toDouble / 5) + 2) * attack.dmg.toDouble * dmgMultiplier) / 50) * stab * efctMltplr).round.toInt
    }

    if (atkr == crntPkmn) optPkmn.HP -= damage

    if (atkr == optPkmn) crntPkmn.HP -= damage

  }

  def willHit(attack: Move): Boolean = math.random < attack.accuracy


  def userAttack(index: Int) = {
    slowPrint(crntPkmn.nickname + ", use " + crntPkmn.attacks(index) + "!")
    if (willHit(crntPkmn.attacks(index))) {
      dmgCalc(crntPkmn, optPkmn, crntPkmn.attacks(index))
    }
    else slowPrint(s"\nOh no, ${crntPkmn.nickname}s attack missed!")
  }

  def opponentAttack(index: Int) = {
    slowPrint("\nOpposing " + optPkmn.nickname + " used " + optPkmn.attacks(index) + "!")
    if (willHit(optPkmn.attacks(index))) {
      dmgCalc(optPkmn, crntPkmn, optPkmn.attacks(index))
    }
    else slowPrint(s"\n${optPkmn.nickname}s attack missed!")
  }

  val choiceMsg: String = {
    val chc1 = crntPkmn.attacks(0)
    val chc2 = crntPkmn.attacks(1)
    val chc3 = crntPkmn.attacks(2)
    val chc4 = crntPkmn.attacks(3)
    s"""What attack do you want to use?
      |1: $chc1
      |2: $chc2
      |3: $chc3
      |4: $chc4
    """.stripMargin
  }
}
