class MainEnum extends Enumeration {

  type MainEnum = Value

  // Assigning values
  val first: Value = Value("Thriller") // ID = 0
  val second: Value = Value("Horror") // ID = 1
  val third: Value = Value("Comedy") // ID = 2
  val fourth: Value = Value("Romance") // ID = 3

  // Changing default IDs of values
  /*

    val first = Value(0, "Thriller")
    val second = Value(-1, "Horror")
    val third = Value(-3, "Comedy")
    val fourth = Value(4, "Romance")

    println(s" Movie Genres = ${Main.values}")
    Output : Movie Genres = Movies.ValueSet(Comedy, Horror, Thriller, Romance)

   */

}
