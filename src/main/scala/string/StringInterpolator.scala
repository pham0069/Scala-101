import com.sun.tools.javac.processing.JavacMessager

object StringInterpolator {
  def main(args: Array[String]): Unit = {
    sInterpolator()
    fInterpolator()
    rawInterpolator()
  }
  def sInterpolator(): Unit = {
    val name = "James"
    println(s"Hello, $name")
    println(s"1 + 1 = ${1+1}")
  }

  def fInterpolator(): Unit = {
    val height = 1.9d
    val name = "James"
    println(f"$name%s is $height%2.2f meters tall");
  }

  def rawInterpolator(): Unit = {
    println(s"Result = \n a \n b")
    println(raw"Result = \n a \n b")
  }
}
