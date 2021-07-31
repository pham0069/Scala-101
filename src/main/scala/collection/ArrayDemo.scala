import Array.range
object ArrayDemo {
  def main(args : Array[String]): Unit = {
    loopArray()
    rangeArray()



  }

  def loopArray(): Unit = {
    var myList = Array(1.9, 2.9, 3.4, 3.5)

    var total = 0.0
    for (x <- myList)
      total += x
    println(s"Total is $total")

    var max = myList(0)
    for (i <- 1 to (myList.length-1))
      if (myList(i) > max)
        max = myList(i)
    println(s"Max is $max")
  }

  def rangeArray(): Unit ={
    var myList = range(10, 20, 2)
    var myList2 = range(10, 20)
    printArray(myList)
    printArray(myList2)
  }

  def printArray(myList : Array[Int]): Unit = {
    for (element <- myList)
      print(element + " ")
    println()
  }
}
