/**
 * Scala enumeration lacks compilation warning in the case of non-exhaustive match
 */
object PatternMatchDemo {
  def main(args : Array[String]): Unit = {
    exhaustiveMatch(Languages.C)
    //nonExhaustiveMatch(Languages.C) // no warning when compile, throw error when run
  }

  def exhaustiveMatch(language : Languages.Value): Unit = language match {
    case Languages.Scala => println("Scala??")
    case Languages.Java => println("Java!!")
    case Languages.C => println("CCCC")
  }

  // Enumeration wont get a “match may not be exhaustive” warning
  def nonExhaustiveMatch(language : Languages.Value): Unit = language match {
    case Languages.Scala => println("Scala??")
    case Languages.Java => println("Java!!")
  }
}