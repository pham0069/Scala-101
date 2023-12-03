/**
 * An enumeration serves the purpose of representing a group of named constants
 * Scala enum is defined by extending Enumeration class
 * Every Enumeration constant represents an object of type Enumeration
 * They should be declared val member
 * Each enum value is assigned with an id
 * If this id is not specificied explicitly, id is assigned in same sequence as declaration, starting from 0
 * Accessing this id by 'id' field of enum value
 * Accessing all enum values by 'values' fielf of enum object
 * The set of enum values are in same order of enum val's declaration
 */

object Languages extends Enumeration {
  type Languages = Value
  val Scala, Java, C = Value
}
object EnumDemo {
  def main(args : Array[String]): Unit = {
    println(Languages.values)
    println(Languages.values.toSeq) // convert to list

    println(Languages.Scala.id)
    println(Languages.Scala.toString)
    println(Languages.Java.id)
    println(Languages.C.id)
  }
}