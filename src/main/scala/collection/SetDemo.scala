object SetDemo {
  def main(args : Array[String]): Unit = {
    setDemo3()
  }

  /**
    * concat sets
    */
  def setDemo(): Unit = {
    val fruit1 = Set("apples", "oranges", "pears")
    val fruit2 = Set("mangoes", "bananas")
    val fruit3 = Set("apples", "bananas")

    //concat 2 set using ++ operator
    println(s"fruit1 ++ fruit2 = ${fruit1 ++ fruit2}")
    println(s"fruit1.++(fruit2) = ${fruit1.++(fruit2)}")
  }

  /**
    * get min, max element of set
    */
  def setDemo2(): Unit = {
    val nums = Set(5, 6, 9, 20, 30, 45)

    println("Min element = " + nums.min)
    println("Min element = " + nums.max)
  }

  /**
    * find common value
    */
  def setDemo3(): Unit = {
    val num1 = Set(5, 6, 9, 20, 30, 45)
    val num2 = Set(50, 60, 9, 20, 35, 55)

    println(s"num1.&(num2) = ${num1.&(num2)}")
    println(s"num1.intersect(num2) = ${num1.intersect(num2)}")
  }

}
