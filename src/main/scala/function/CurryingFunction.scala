/**
 * Currying transforms a function that takes multiple params into a chain of functions,
 * each taking a single param
 * function add (a) {
 *  return function (b) {
 *    return a + b;
 *  }
 * }
 */
object CurryingFunction {
  def main(args: Array[String]) {
    val str1:String = "Hello, "
    val str2:String = "Scala!"

    println( "str1 + str2 = " +  strcat(str1)(str2) )
  }

  /**
    * Equivalent to
    * def strcat(s1:String) = (s2:String) => s1 + s2
    */
  def strcat(s1: String)(s2: String) = {
    s1 + s2
  }
}
