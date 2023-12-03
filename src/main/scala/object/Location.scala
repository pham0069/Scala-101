class Location (val xc: Int, val yc: Int, val zc: Int) extends Point (xc, yc) {
  var z: Int = zc
  def move(dx: Int, dy: Int, dz: Int): Unit = {
    x += dx
    y += dy
    z += dz
    printf("Location at (%d, %d, %d)", x, y, z)
  }
}

object LocationDemo {
  def main(args: Array[String]) {
    val location = new Location(10, 20, 15);
    location.move(10, 10, 5);
  }
}
