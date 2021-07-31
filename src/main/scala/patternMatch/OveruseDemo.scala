/**
 * The risk of so powerful pattern matching is its overuse.
 * It's especially visible in the code of programmers using this mechanic for the first time.
 * In such situation almost all if-else conditions are expressed as pattern matching cases.
 * Is it bad ? Yes and not.
 * For many pattern matching is more readable than if-else statement.
 * For the others its use should be only limited to specific cases (e.g. extracting components from objects)
 * and not to make conditionals checks on the same type values (after all guards contain an if too).
 *
 * A good point helping to make a decision concerns code complexity.
 * In the compiled bytecode, a simple if-else statement is much shorter than pattern matching even applied on only 2 branches
 */
object OveruseDemo {
  def getOneOrAnotherIf(value: Int): Boolean = {
    if (value%2 == 0) true else false
  }

  def getOneOrAnotherPatternMatching(value: Int): Boolean = {
    value match {
      case n if n%2 == 0 => true
      case _ => false
    }
  }
}