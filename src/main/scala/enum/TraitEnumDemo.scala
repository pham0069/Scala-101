/**
 * Use sealed trait to emulate enumeration with advantages
 * 1. can specify more fields than just id and name
 * 2. can give unexhaustive match warning
 *
 * Disadvantages compared to Enumeration subclass
 * 1. not ordered
 * 2. not grouped together that complicates their retrieval
 * @param r
 * @param g
 * @param b
 */
sealed abstract class Color (val r: Int, val g: Int, val b: Int)
object Colors {
  case object Red extends Color(255, 0, 0)
  case object Green extends Color(0, 255, 0)
  case object Blue extends Color(0, 0, 255)
}
object TraitEnumDemo {
  def main(args: Array[String]): Unit = {
    println(Colors.Red.r)
    println(Colors.Red.g)
    println(Colors.Red.b)
    unExhaustiveMatch(Colors.Red)
  }

  /**
   * Due to unexhaustive match on sealed trait, the following method would produce the warning when compiled
   * warning: match may not be exhaustive.
   * It would fail on the following input: Blue
   * color match {
   *
   * ^
   * one warning found
   * @param color
   */
  def unExhaustiveMatch(color : Color): Unit = {
    color match {
      case Colors.Red => println("Red apple")
      case Colors.Green => println("Green tree")
    }
  }
}