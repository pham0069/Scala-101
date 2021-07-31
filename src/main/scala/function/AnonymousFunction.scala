object AnonymousFunction {
  def main(args : Array[String]): Unit = {
    //Function literals: function can be defined as variable
    var inc = (x:Int) => x+1
    //function can be called
    var x = inc(7) - 1
    var mul = (x: Int, y: Int) => x*y
    println(mul(3, 4))
    var useDir = () => {System.getProperty("use.dir")}
    println(useDir())
  }
}