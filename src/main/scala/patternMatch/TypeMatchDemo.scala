/**
 * Type match can be used to replace isInstanceOf type checks
 */
case class A()
case class B()
case class C()
object TypeMatchDemo {
  def main(args : Array[String]): Unit = {
    println(testType(B()))
  }

  def testType(x: Any): String = {
    x match {
      case _: A => "class#A"
      case _: B => "class#B"
      case _: C => "calss#C"
      case _ => "unknown class"
    }
  }
}