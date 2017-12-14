package PokemonGame

class Move(val name: String, damage: Int, typing: Types, acc: Double, atkStat: Boolean) {
  val dmg = damage
  override def toString = name
  val types = typing
  val accuracy = acc
  val isPhysical = atkStat //if true, uses attack and defence stats, if false uses Sp.Atk and Sp.Def stats
}

object Moves {

  val flamethrower  = new Move("Flamethrower", 95, Fire, 1.0, false)

  val slash         = new Move("Slash", 70, Normal, 1.0, true)

  val rage          = new Move("Rage", 20, Normal, 1.0, true)

  val wingattack    = new Move("Wing Attack", 60, Flying, 1.0, true)

  val thunderbolt   = new Move("Thungerbolt", 90, Electric, 1.0, false)

  val rockThrow     = new Move("Rock Throw", 50, Rock, 0.9, true)

  val leechLife     = new Move("Leech Life", 80, Bug, 1.0, true)

  val steelWing     = new Move("Steel Wing", 70, Steel, 0.9, true)

  val aerialAce     = new Move("Aerial Ace", 60, Flying, 1.0, true)

  val nightSlash    = new Move("Night Slash", 70, Dark, 1.0, true)

  val earthquake    = new Move("Earthquake", 100, Ground, 1.0, true)

  val ancientPower  = new Move("Ancient Power", 60, Rock, 1.0, false)

  val extrasensory  = new Move("Extrasensory", 80, Psychic, 1.0, false)

  val dragonClaw    = new Move("Dragon Claw", 80, Dragon, 1.0, true)

  val solarBeam     = new Move("Solar Beam", 120, Grass, 1.0, false)

  val sludgeBomb    = new Move("Sludge Bomb", 90, Poison, 1.0, false)

  val gigaDrain     = new Move("Giga Drain", 75, Grass, 1.0, false)

  val brine         = new Move("Brine", 65, Water, 1.0, false)

  val waterPulse    = new Move("Water Pulse", 60, Water, 1.0, false)

  val meteorMash    = new Move("Meteor Mash", 90, Steel, 0.9, true)

  val psychic       = new Move("Psychic", 90, Psychic, 1.0, false)

  val hyperBeam     = new Move("Hyper Beam", 150, Normal, 0.9, false )

  val psybeam       = new Move("Psybeam", 90, Psychic, 1.0, false)

  val thunder       = new Move("Thunder", 110, Electric, 0.7, false)

  val surf          = new Move("Surf", 90, Water, 1.0, false)

  val blazeKick     = new Move("Blaze Kick", 85, Fire, 0.9, true)

  val braveBird     = new Move("Brave Bird", 120, Flying, 1.0, true)

  val zenHeadbutt   = new Move("Zen Headbutt", 80, Psychic, 1.0, true)

  val blizzard      = new Move("Blizzard", 110, Ice, 0.7, false)

  val iceBeam       = new Move("Ice Beam", 90, Ice, 1.0, false)

  val bodySlam      = new Move("Body Slam", 85, Normal, 1.0, true)

  val doubleEdge    = new Move("Double-Edge", 120, Normal, 1.0, true)
}
