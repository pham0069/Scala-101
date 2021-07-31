object PartiallyAppliedFunction {
  def main(args : Array[String]): Unit = {
    val date = new Date
    fullCall(date)
    partialCall(date)
  }

  def fullCall(date: Date): Unit = {
    log(date, "Message 1")

    Thread.sleep(1000)
    log(date, "Message 2")

    Thread.sleep(1000)
    log(date, "Message 3")
  }

  /**
    * We want to invoke log() multiple times with same date var
    * Can do that by binding log to a date var into a function object
    *
    * @param date
    */
  def partialCall(date: Date): Unit = {
    val logWithDateBound = log(date, _ : String)
    logWithDateBound("Message 1")

    Thread.sleep(1000)
    logWithDateBound("Message 2")

    Thread.sleep(1000)
    logWithDateBound("Message 3")
  }

  def log(date: Date, message: String) = {
    println(date + "-------" + message)
  }
}
