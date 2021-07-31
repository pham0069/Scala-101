/**
 * Pattern guards limit the conditions under which given case matches
 */

object PatternGuardDemo {
  def main(args : Array[String]): Unit = {
    println(getNumberLabel(2))
    println(getNumberLabel(5))
    println(getNumberLabel("125"))
  }

  def getNumberLabel(x: Any): String = {
    x match {
      case number: Int if number % 2 == 0 => "even"
      case number: Int if number % 2 == 1 => "odd"
      case _ => throw new IllegalArgumentException("Cannot operate on non-integers")
    }
  }
}