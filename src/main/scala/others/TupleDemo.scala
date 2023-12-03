object TupleDemo {
  def main(args : Array[String]): Unit = {

  }

  /**
    * define, initialize, access tuple
    * allow up to Tuple22
    */
  def tupleDemo1(): Unit ={
    val t = (4, 3, 2, 1) //Tuple4
    val t5 = Tuple5("Pham", 29, 1.63, "Singapore", true)
    val sum = t._1 + t._2 + t._3 + t._4
    println("Sum of elements = " + sum)
    t.productIterator.foreach(i => println("Value = " + i))
  }

  def tupleDemo2(): Unit = {
    val t = new Tuple3(1, "hello", Console)
    println("Concatenated string = " + t.toString())
  }

  def tupleDemo3(): Unit = {
    val t = new Tuple2("Scala", "Hello")
    println("Swapped tuple = " + t.swap)

  }
}
