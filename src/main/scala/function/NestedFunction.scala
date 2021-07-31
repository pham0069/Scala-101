object NestedFunction {
  def main(args : Array[String]): Unit = {
    println(factorial(0))
  }
  def factorial(i: Int) : Int = {
    //define nested function inside a function
    def fact(i: Int, accumulator : Int): Int = {
      if (i <= 1)
        accumulator
      else
        fact(i=1, accumulator*i)
    }
    fact(i, 1)
  }
}
