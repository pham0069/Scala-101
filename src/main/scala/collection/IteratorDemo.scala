object IteratorDemo {
  def main(args : Array[String]): Unit = {
    iteratorDemo2()
  }

  def iteratorDemo1(): Unit = {
    val it = Iterator("a", "number", "of", "words")

    while (it.hasNext) {
      println(it.next())
    }
  }

  def iteratorDemo2(): Unit = {
    val ita = Iterator(20, 40, 2, 50, 69, 90)
    val itb = Iterator(20, 40, 2, 50, 69, 90)

    println("Min element = " + ita.min)
    println("Max element = " + itb.max)
    println("Size = " + ita.size)// not works as iterator can be traversed only once

    val itc = Iterator(20, 40, 2, 50, 69, 90)
    val itd = Iterator(20, 40, 2, 50, 69, 90)
    println("Size = " + itc.size) // size and length equivalent
    println("Length = " + itd.size)
  }
}
