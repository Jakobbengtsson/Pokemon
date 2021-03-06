package PokemonGame

abstract class Trainer(name: String) {
  val party: Array[Pokemon]

  override def toString: String = name
}

object Trainers {
  val steven = new Trainer("Steven") {
    val party: Array[Pokemon] = Array((new Skarmory(57, "Skarmory")), (new Claydol(55, "Claydol")), (new Aggron(56, "Aggron")), (new Cradily(56, "Cradily")), (new Armaldo(56, "Armaldo")), (new Metagross(58, "Metagross")))
  }
  val player = new Trainer("You") {
    val party:Array[Pokemon] = Array((new Blaziken(58, "Blaziken")) ,(new Walrein(60, "Walrein")), (new Swampert(57, "Swampert")), (new Salamence(56, "Salamence")), (new Charizard(55, "Charizard")), (new Pikachu(80, "Pikachu")))
  }
}


