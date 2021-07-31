object FunctionWithVariableArguments {
  def main(args : Array[String]): Unit = {
    printString(3, "Hello", "Scala", "Python")
  }

  //only allow variable number of parameters for the last parameter
  //printString(args : String*, x : Int) is not allowed
  def printString(n : Int, args : String*): Unit = {
    var i : Int = 0
    println("Number of args = " + n)
    for (arg <- args) {
      println("Arg value[" + i + "] = " + arg);
      i += 1
    }
  }
}
