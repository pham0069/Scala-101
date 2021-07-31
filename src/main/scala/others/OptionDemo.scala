object OptionDemo {
  def main(args : Array[String]): Unit = {
    optionDemo1()
  }

  def optionDemo1(): Unit = {
    val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")

    println("capitals.get(\"France\") = " + capitals.get("France"))
    println("capitals.get(\"India\") = " + capitals.get("India"))


    println(s"show(capitals.get(France)) = ${show(capitals.get("France"))}")
    println(s"show(capitals.get(India)) = ${show(capitals.get("India"))}")
  }

  def show(x: Option[String]) = x match {
    case Some(s) => s
    case None => "?"
  }

  def optionDemo2(): Unit = {
    val a : Option[Int] = Some(5)
    val b : Option[Int] = None

    println("a.getOrElse(0) = " + a.getOrElse(0))
    println("b.getOrElse(10) = " + b.getOrElse(10))

    println("Is a empty = " + a.isEmpty)
    println("Is b empty = " + b.isEmpty)
  }
}
