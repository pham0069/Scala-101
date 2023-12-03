import java.util.NoSuchElementException

/**
 * Use 'withName(String)' method to get the enumeration with given name
 * This is similar to Java's valueOf(String)
 * It is unsafe because when the entity does not exist, an exception is thrown
 * Thus we need to use try, catch with this method
 */

object GetEnumDemo {
  def main(args: Array[String]): Unit = {
    println(safeGetLetter("c"))
    println(safeGetLetter("e"))
  }

  def safeGetLetter(letter: String): Option[Letters.Value] = {
    try {
      // exception thrown if letter does not exist
      Some(Letters.withName(letter))
    } catch {
      case e: Exception => None
    }
  }
}