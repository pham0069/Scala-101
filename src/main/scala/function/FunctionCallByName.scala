object FunctionCallByName {
  def main(args : Array[String]) {
    delayed(time());
  }

  def time() = {
    println("Getting time in nano seconds")
    System.nanoTime
  }

  def delayed(t: => Long) = {
    println("In delayed method")  // not calculate t yet
    println("Param: " + t)        // start calculating expression t
  }
}
