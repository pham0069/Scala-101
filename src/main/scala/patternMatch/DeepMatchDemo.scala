/**
 * Matching nested structures, aka deep matches
 * Pattern matching can be used to make recursive calls on nested DS
 */

case class Person(name: String, parent: Person = null)

object DeepMatchDemo {
  def main(args: Array[String]): Unit = {
    val personHierarchy: Person = Person("A",
      Person("B",
        Person("C",
          Person("D",
            Person("E", null)
          )
        )
      )
    )
    val rootParentName = getRootParentName(personHierarchy)
    println(rootParentName)
  }

  def getRootParentName(person: Person): String = {
    val rootParentName = person match {
      case Person(_, parent) if (parent != null) => getRootParentName(parent)
      case Person(name, parent) if (parent == null) => s"${name}"
      case _ => throw new IllegalMonitorStateException("Cannot process persion")
    }
    rootParentName
  }
}