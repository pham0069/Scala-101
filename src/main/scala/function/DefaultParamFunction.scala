object DefaultParamFunction {
  def main(args: Array[String]): Unit = {
    //if not specified any value, default value are taken
    println("Returned value for default a and b: " + addInt())
    println("Returned value for default b: " + addInt(a = 3))
    println("Returned value for default a: " + addInt(b = 9))
    println("Returned value for default second param: " + addInt(8))
  }
  def addInt(a: Int = 5, b: Int = 7) : Int = {
    var sum:Int = 0
    sum = a + b
    return sum
  }
}
