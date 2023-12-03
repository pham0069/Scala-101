/**
 *  Match against the values of a sequence where its head is separated from the tail by :: sign
 */
object SequenceMatchDemo {
  def main(args: Array[String]): Unit = {
    println(matchSequence(Seq("a", "b", "c", "d")))
    println(matchSequence(Seq(1, 2, 3, 4, 5)))
    println(matchSequence("abcd"))
    println(matchSequence(125))
  }

  def matchSequence(x: Any): Any = {
    val sequenceHead = x match {
      case head :: _ => head
      case _ => "Not a sequence"
    }
    sequenceHead
  }
}