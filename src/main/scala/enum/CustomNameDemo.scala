/**
 * Enumeration can only define 2 fields: a numerical id and a textual name
 * This is an inflexibility of Scala enum
 * Use Value(Int, String) constructor to specify id and name for enum val
 */

object Letters extends Enumeration {
  type Letters = Value
  val A = Value(4, "a")
  val B = Value(3, "b")
  val C = Value(2, "c")
  val D = Value(1, "d")
}

object CustomNameDemo {
  def main(args : Array[String]): Unit = {
    println(Letters.B.id)
    println(Letters.B.toString)
  }
}