object MapDemo {
  def main(args : Array[String]): Unit = {
    mapDemo3()
  }

  /**
    * initialization and modification on map
    */
  def mapDemo: Unit ={
    var romanNumber : Map[Char, Int] = Map()
    romanNumber += ('I' -> 1)
    romanNumber += ('V' -> 5)
    romanNumber += ('X' -> 10)

    val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF")

  }

  /**
    * basic operations on map
    */
  def mapDemo2(): Unit = {
    val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF")

    println("Keys in colors = " + colors.keys)
    println("Values in colors = " + colors.values)
    println("Is colors empty = " + colors.isEmpty)
  }

  /**
    * concat maps
    */
  def mapDemo3(): Unit = {
    val colors1 = Map("red" -> "#FF0000", "aure" -> "#F0FFFF", "peru" -> "#CD853F")
    val colors2 = Map("blue" -> "#0033FF", "yellow" -> "#FFFF00", "red" -> "#FF0002", "peru" -> "#CD853F")

    println(s"colors1 ++ colors2 = ${colors1 ++ colors2}")
    println(s"colors1.++(colors2) = ${colors1.++(colors2)}")
  }

  def mapDemo4(): Unit = {
    val colors = Map("red" -> "#FF0000", "aure" -> "#F0FFFF", "peru" -> "#CD853F")

    colors.keys.foreach(key => {
      print("Key = " + key)
      println(" Value = " + colors(key))
    })
  }

  def mapDemo5(): Unit = {
    val colors = Map("red" -> "#FF0000", "aure" -> "#F0FFFF", "peru" -> "#CD853F")
    if (colors.contains("red"))
      println(s"Red key exists with value ${colors("red")}")
    else
      println("Red key does not exist")

    if (colors.contains("maroon"))
      println(s"Maroon key exists with value ${colors("maroon")}")
    else
      println("Maroon key does not exist")
  }
}
