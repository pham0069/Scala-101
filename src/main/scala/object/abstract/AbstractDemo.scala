/**
 * Abstract class is constructed using abstract keyword
 * It contains both abstract and non-abstract methods and cannot support multiple inheritances
 *
 * Trait vs abstract class
 * 1. trait supports multiple inheritance, abstract class does not support this
 * 2. trait does not contain constructor parameters, abstract class contains constructor parameters
 * 3.
 */

abstract class Teacher {
  def getTeacherId: Int
  def teach(): Unit = {
    println("Teaching");
  }
}

class ScalaTeacher(aId: Int) extends Teacher {
  var id: Int = aId

  override def getTeacherId: Int = id

  override def teach(): Unit = {
    println("Teaching Scala");
  }
}

object AbstractDemo {
  def main(args: Array[String]): Unit = {
    val scalaTeacher: ScalaTeacher = new ScalaTeacher(100);
    println(scalaTeacher.getTeacherId);
    scalaTeacher.teach();
  }
}