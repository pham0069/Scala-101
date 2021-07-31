class Point(xc: Int, yc: Int) {
  var x : Int = xc
  var y : Int = yc

  def move(dx: Int, dy: Int): Unit = {
    x += dx
    y += dy
    println("Point at (" + x + ", " + y + ")");
  }
}
object PointDemo {
  def main(args: Array[String]) {
    val point = new Point(10, 20);
    point.move(10, 10);
  }
}