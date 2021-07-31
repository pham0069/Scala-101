//Implicit classes allow implicit conversations with class’s primary constructor when the class is in scope
/**
 * Implicit classes must be defined inside another class/object/trait
 * Implicit classes may only take one non-implicit arg in constructor
 * Implicit classes may not be any method, member or object in scope with same name as implicit classes
 */
object Run {
  implicit class IntTimes(x: Int) {
    def times [A](function: => A): Unit = {
      def loop(current: Int): Unit = // dont put bracket here {}
        if (current > 0) {
          function
          loop(current - 1)
        }
      loop(x)
    }
  }
}

import Run._
object ImplicitDemo {
  def main(args: Array[String]) {
    println("Hello Scala")
    4 times println("Hello")
  }
}
