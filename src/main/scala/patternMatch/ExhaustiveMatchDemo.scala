/**
 * Scala compiler is able to detect the cases not covered by the pattern matching clause.
 * A great example of that is the situation when we match against an optional value and consider only the case of defined value:
 */

object ExhaustiveMatchDemo {
  def main(args : Array[String]): Unit = {
    val some = Some(2)
    val none = None
    println(exhaustiveTestOptional(some))
    println(exhaustiveTestOptional(none))
  }

  /**
   * Lacking case None would return warning during compilation:
   * warning: match may not be exhaustive.
   * It would fail on the following input: None
   * x match {
   *
   * ^
   * one warning found
   * @param x
   * @return
   */
  /*
  def unexhaustiveTestOptional(x: Option[Int]): Int = {
    x match {
      case Some(y) => y
    }
  } */

  def exhaustiveTestOptional(x: Option[Int]): Int = {
    x match {
      case Some(y) => y
      case None => -1
    }
  }
}
