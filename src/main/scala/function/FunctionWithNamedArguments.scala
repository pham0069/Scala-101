object FunctionWithNamedArguments {
  def main(args : Array[String]): Unit = {
    printInt(b = 5, a = 7);
  }
  def printInt(a : Int, b : Int): Unit = {
    println("a = " + a)
    println("b = " + b)
  }
}
