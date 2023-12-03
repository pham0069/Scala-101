/**
 * Cannot overload a method with different scala.Enumeration
 * The following program will not compile with error
 * double definition
 *
 */

object MethodOverloadingDemo {
  def main(args: Array[String]): Unit = {
    printEnum(Letters.A)
    printEnum(Languages.Scala)
  }

  def printEnum(letter : Letters.Value) = println(letter)
  def printEnum(language : Languages.Value) = println(language)
}