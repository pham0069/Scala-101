/**
 * To apply custom order, Scala uses def compare(that: Value): Int of an object called Value
 *
 */

object Priorities extends Enumeration {
  type Priorities = Value
  val High = Value(3)
  val Low = Value(1)
  val Medium = Value(2)
}

object CustomOrderDemo {
  def main(args : Array[String]): Unit = {
    println(Priorities.values)
    println(Priorities.values.toSeq)
  }
}