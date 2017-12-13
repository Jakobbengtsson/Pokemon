package PokemonGame

import scala.io.StdIn.readLine
import Battle.{crntPkmn, optPkmn, player, opponent}

object Game {

  def slowPrint(text: String) = {
    for (i <- text.toVector) {
      print(i)
      Thread.sleep(100)
    }
  }


  def initBattle = {
    slowPrint(s"You have been challenged by $opponent! \n$opponent sent out " + optPkmn.nickname + ".\nGo " + crntPkmn.nickname + "!")
  }


  def battleScene = {
    def optHp = optPkmn.HP
    def optMaxHp = optPkmn.maxHP
    def usrHp = crntPkmn.HP
    def usrMaxHp = crntPkmn.maxHP
    println(
      s"""
        |
        |
        |--------------------$optPkmn
        |-----------------------HP: $optHp/$optMaxHp---
        |
        |
        |$crntPkmn------------------
        |----HP: $usrHp/$usrMaxHp--------------------
        |
      """.stripMargin)
  }

  var opponentIndex = 0

  var playerIndex   = 0

  var lost = false

  var won  = false

  def round = {
    var i = 0

    battleScene
    //crntPkmn.HP > 0 && optPkmn.HP > 0 &&
    while (opponentIndex < 6 && playerIndex < 6 && !lost && !won) {

      var usrChoice = readLine(Battle.choiceMsg)

      usrChoice match {
        case choice1 if choice1.startsWith("1") => Battle.userAttack(0)
        case choice2 if choice2.startsWith("2") => Battle.userAttack(1)
        case choice3 if choice3.startsWith("3") => Battle.userAttack(2)
        case choice4 if choice4.startsWith("4") => Battle.userAttack(3)
        case other => println(s"$other is not a valid choice. Try again")
      }

      if (optPkmn.HP < 0) optPkmn.HP = 0

      battleScene
      if (optPkmn.HP == 0) {
        opponentIndex += 1
        if (opponentIndex < 6) {
          optPkmn = opponent.party(opponentIndex)
          slowPrint("\n" + opponent.party(opponentIndex + -1).nickname + " fainted!\n" + opponent + " sent out " + optPkmn.nickname + "!")
        }
        else won = true
      }

      else if(optPkmn.HP > 0) {
        def rnd = (math.random * 4).toInt
        Battle.opponentAttack(rnd)
        //battleScene
      }

      if (crntPkmn.HP < 1 ) {
        crntPkmn.HP = 0
        battleScene
        playerIndex += 1
        if (playerIndex < 6) {
          crntPkmn = player.party(playerIndex)
          slowPrint("\nOh no! Your " + player.party(playerIndex - 1).nickname + " fainted!\n" + player + " sent out " + crntPkmn.nickname + "!")
        }
        else {lost = true }
      }

      if(optPkmn.HP > 0 && lost == false && won == false) battleScene

      lost = usrChoice.toLowerCase.startsWith("n")
    }
  }

  def endGameMsg = {
    if (lost == true) slowPrint("\nOh no, you lost!")
    else if (won == true) slowPrint(s"\n$opponent was defeated. Well done!")
  }


  def play(): Unit = {
    initBattle
    round
    endGameMsg
  }

}
