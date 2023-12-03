/**
 * sealed keyword control the places where given trait or class can be extended
 * i.e. subclasses and implementation can be defined only in the same source file as the sealed trait or class
 * As per requirement of sealed, the disadvantage is readability as all implementations are put in same file
 *
 * Use of sealed in this demo: Type-safety
 * 'Warning: match may not be exhaustive' happen when your match cases don't cover all possibilities.
 * With trait, since all the types must be defined in a single file, the compiler automatically knows all possibilities
 * and can use them in every pattern matching executed against the sealed type.
 */
sealed trait Letter {}

class A extends Letter
class B extends Letter
class C extends Letter

// If we try to extend Letter trait in different file,
// the compiler will end up with "illegal inheritance from sealed trait Letter" message

object SealedExhaustiveMatchDemo {
  def main(args: Array[String]): Unit = {
    val letter : Letter = new B()
    exhaustiveMatchWithNoWarning(letter)
  }

  /**
   * warning: match may not be exhaustive.
   * It would fail on the following inputs: B(), C()
   * letter match {
   * ^
   **/
  /*
  def unexhaustiveMatch(letter: Letter): Unit = {
    letter match {
      case _: A => println("a")
    }
  } */

  def exhaustiveMatch(letter: Letter): Unit = {
    letter match {
      case _: A => println("a")
      case _: B => println("b")
      case _: C => println("c")
    }
  }
}
