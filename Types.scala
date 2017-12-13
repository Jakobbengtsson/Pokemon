package PokemonGame

sealed trait Types
object Types {
  val types = Vector(Fire, Flying, Electric, None, Normal, Bug, Grass, Rock, Dark, Fairy, Poison, Steel, Dragon, Ghost, Fight, Ice, Psychic, Water)
}
case object Fire      extends Types
case object Flying    extends Types
case object Electric  extends Types
case object Normal    extends Types
case object Bug       extends Types
case object Grass     extends Types
case object Rock      extends Types
case object Dark      extends Types
case object Fairy     extends Types
case object Ground    extends Types
case object Poison    extends Types
case object Steel     extends Types
case object Dragon    extends Types
case object Ghost     extends Types
case object Fight     extends Types
case object Ice       extends Types
case object Psychic   extends Types
case object Water     extends Types
case object None      extends Types

object Effectiveness {

  var totResult = 1.0

  def effectiveness(moveType: Types, defenceType: Types): Double = {


    def superEffective  = {
      //Game.slowPrint("It's super effective!")
      totResult *= 2.0
    }

    def notVeryEffective    = {
     // Game.slowPrint("It's not very effective...")
      totResult *= 0.5
    }

    def immune = {
      //Game.slowPrint("It doesn't affect...")
      totResult *= 0
    }

    def normalEffective = totResult *= 1.0

    if (moveType == Electric) {
      val result = defenceType match {
        case Flying   => superEffective
        case Water    => superEffective
        case Electric => notVeryEffective
        case Grass    => notVeryEffective
        case Dragon   => notVeryEffective
        case Ground   => immune
        case _        => normalEffective
      }
    }

    if (moveType == Flying) {
      val result = defenceType match {
        case Grass    => superEffective
        case Fight => superEffective
        case Bug      => superEffective
        case Electric => notVeryEffective
        case Rock     => notVeryEffective
        case Steel    => notVeryEffective
        case _        => normalEffective
      }

    }

    if (moveType == Fire) {
      val result = defenceType match {
        case Grass    => superEffective
        case Ice      => superEffective
        case Bug      => superEffective
        case Steel    => superEffective
        case Fire     => notVeryEffective
        case Rock     => notVeryEffective
        case Water    => notVeryEffective
        case _        => normalEffective
      }

    }

    if (moveType == Normal) {
      val result = defenceType match {
        case Rock     => notVeryEffective
        case Steel    => notVeryEffective
        case Ghost    => immune
        case _        => normalEffective
      }
    }

    if (moveType == Bug) {
      val result = defenceType match {
        case Grass    => superEffective
        case Psychic  => superEffective
        case Dark     => superEffective
        case Fire     => notVeryEffective
        case Fight => notVeryEffective
        case Steel    => notVeryEffective
        case Poison   => notVeryEffective
        case Flying   => notVeryEffective
        case Ghost    => notVeryEffective
        case Fairy    => notVeryEffective
        case _        => normalEffective
      }
    }

    if (moveType == Grass) {
      val result = defenceType match {
        case Ground   => superEffective
        case Rock     => superEffective
        case Water    => superEffective
        case Bug      => notVeryEffective
        case Dragon   => notVeryEffective
        case Fire     => notVeryEffective
        case Flying   => notVeryEffective
        case Grass    => notVeryEffective
        case Poison   => notVeryEffective
        case Steel    => notVeryEffective
        case _        => normalEffective
      }
    }

    if (moveType == Rock) {
      val result = defenceType match {
        case Bug      => superEffective
        case Fire     => superEffective
        case Flying   => superEffective
        case Bug      => superEffective
        case Ice      => superEffective
        case Fight  => notVeryEffective
        case Ground   => notVeryEffective
        case _        => normalEffective
      }
    }

    if (moveType == Dark) {
      val result = defenceType match {
        case Ghost    => superEffective
        case Psychic  => superEffective
        case Dark     => notVeryEffective
        case Fairy    => notVeryEffective
        case Fight => notVeryEffective
        case _        => normalEffective
      }
    }

    if (moveType == Fairy) {
      val result = defenceType match {
        case Dark     => superEffective
        case Dragon   => superEffective
        case Fight    => superEffective
        case Fire     => notVeryEffective
        case Poison   => notVeryEffective
        case Steel    => notVeryEffective
        case _        => normalEffective
      }
    }

    if (moveType == Ground) {
      val result = defenceType match {
        case Electric => superEffective
        case Fire     => superEffective
        case Poison   => superEffective
        case Rock     => superEffective
        case Bug      => notVeryEffective
        case Grass    => notVeryEffective
        case Flying   => immune
        case _        => normalEffective
      }
    }

    if (moveType == Poison) {
      val result = defenceType match {
        case Grass    => superEffective
        case Ground   => notVeryEffective
        case Rock     => notVeryEffective
        case Ghost    => notVeryEffective
        case Steel    => immune
        case _        => normalEffective
      }
    }

    if (moveType == Steel) {
      val result = defenceType match {
        case Ice      => superEffective
        case Rock     => superEffective
        case Fairy    => superEffective
        case Electric => notVeryEffective
        case Fire     => notVeryEffective
        case Water    => notVeryEffective
        case Steel    => notVeryEffective
        case _        => normalEffective
      }
    }

    if (moveType == Dragon) {
      val result = defenceType match {
        case Dragon   => superEffective
        case Steel    => notVeryEffective
        case Fairy    => immune
        case _        => normalEffective
      }
    }

    if (moveType == Ghost) {
      val result = defenceType match {
        case Ghost    => superEffective
        case Psychic  => superEffective
        case Dark     => notVeryEffective
        case Normal   => immune
        case _        => normalEffective
      }
    }

    if (moveType == Fight) {
      val result = defenceType match {
        case Normal   => superEffective
        case Ice      => superEffective
        case Dark     => superEffective
        case Rock     => superEffective
        case Steel    => superEffective
        case Poison   => notVeryEffective
        case Flying   => notVeryEffective
        case Bug      => notVeryEffective
        case Psychic  => notVeryEffective
        case Ghost    => immune
        case _        => normalEffective
      }
    }

    if (moveType == Ice) {
      val result = defenceType match {
        case Dragon   => superEffective
        case Flying   => superEffective
        case Grass    => superEffective
        case Ground   => superEffective
        case Ice      => notVeryEffective
        case Water    => notVeryEffective
        case _        => normalEffective
      }
    }

    if (moveType == Psychic) {
      val result = defenceType match {
        case Poison   => superEffective
        case Fight    => superEffective
        case Psychic  => notVeryEffective
        case _        => normalEffective
      }
    }

    if (moveType == Water) {
      val result = defenceType match {
        case Fire     => superEffective
        case Ground   => superEffective
        case Rock     => superEffective
        case Dragon   => notVeryEffective
        case Grass    => notVeryEffective
        case Water    => notVeryEffective
        case _        => normalEffective
      }
    }

    if (moveType == None) {
      val result = defenceType match {
        case _        => normalEffective
      }
    }
    totResult
    //else 1.0

  }

}

