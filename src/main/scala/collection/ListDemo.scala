object ListDemo {
  def main(args : Array[String]): Unit = {
    listDemo6()
  }

  def listDemo(): Unit = {
    val fruit : List[String] = List("apples", "oranges", "pears")
    val nums: List[Int] = List(1, 2, 3, 4)
    val empty: List[Nothing] = List()
    val matrix: List[List[Int]] =
      List (
        List(1, 0, 0),
        List(0, 1, 0),
        List(0, 0, 1)
      )
  }
  def listDemo2(): Unit = {
    val fruit = "apples" :: ("oranges" :: ("pears" :: Nil))
    val nums = 1 :: (2 :: (3 :: (4 :: Nil)))
    val empty = Nil
    val matrix = (1 :: (0 :: (0 :: Nil))) ::
      (0 :: (1 :: (0 :: Nil))) ::
      (0 :: (0 :: (1 :: Nil))) :: Nil
  }
  def listDemo3(): Unit = {
    val fruit : List[String] = List("apples", "oranges", "pears")
    println(s"Head of fruit : ${fruit.head}")
    println(s"Tail of fruit : ${fruit.tail}")
    println(s"Is nums empty : ${fruit.isEmpty}")
  }

  def listDemo4(): Unit ={
    val fruit1 = "apples" :: ("oranges" :: ("pears" :: Nil))
    val fruit2 = "mangoes" :: ("bananas" :: Nil)

    var fruit = fruit1 ::: fruit2
    println("fruit1 ::: fruit2 = " + fruit)

    fruit = fruit1.:::(fruit2)
    println("fruit1.:::(fruit2) = " + fruit)

    fruit = List.concat(fruit1, fruit2)
    println("List.concat(fruit1, fruit2) = " + fruit)
  }

  def listDemo5(): Unit = {
    val fruit = List.fill(3)("apples")
    println("fruit = " + fruit)
  }

  /**
    * tabulate applies on all elements of list before tabulating the list
    */
  def listDemo6(): Unit = {
    val squares = List.tabulate(6)(n => n*n)
    println("squares = " + squares)

    val mul = List.tabulate(4, 5) (_ * _)
    println("mul = " + mul)
  }

  def listDemo7(): Unit = {
    val fruit = "apples" :: ("oranges" :: ("pears" :: Nil))
    println("fruit = " + fruit)

    println("reverse fruit = " + fruit.reverse)
  }
}
