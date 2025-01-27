@main
def main(): Unit =
  println("----------------------------------------------------------")
  println("Hello world! This is a simple scala program of enumeration")

  val mainEnum = new MainEnum()
  println(s"- Main Movie Genres = ${mainEnum.values}")

  println("Printing particular element of the enumeration")
  println(s"- The third value = ${mainEnum.third}")

  println("Printing default ID of any element in the enumeration")
  println(s"- ID of third = ${mainEnum.third.id}")

  println("Matching values in enumeration")
  mainEnum.values.foreach {
    // Matching values in Enumeration
    case d if (d == mainEnum.third) =>
      println(s"- Favourite type of Movie = $d")
    case _ => None
  }


