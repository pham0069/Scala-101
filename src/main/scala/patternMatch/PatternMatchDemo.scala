/**
 * Pattern matching is a mechanism to check some value against one or more defined pattern
 * 'match' keyword is used instead of 'switch'
 * match will be followed by a sequence of alternatives, each start with 'case'
 * Each case includes a pattern and expressions evaluated if the pattern matches
 * Arrow symbol (=>) is used to separate the pattern from expressions
 * The last case _ is a 'catch-all' case, will be executed if all previous cases do not match
 * No break statement is required since pattern matching always return some value
 * Match blocks are expressions, not statements
 */
object PatternMatchDemo {
  def main(args: Array[String]): Unit = {
    println(matchTest(1))
    println(matchTest(0))
    println(matchTest(2))
  }

  def matchTest(x: Int): String = x match {
    case 0 => "Hello"
    case 1 => "Hi"
    case _ => "Good luck"
  }
}
