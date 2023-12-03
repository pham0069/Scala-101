/**
 * In addition to type tests we can also extract values of matched type
 * @param street
 * @param city
 * @param country
 */
case class Address(street: String, city: String, country: String)

object VariableBindingsDemo {
  def main(args: Array[String]): Unit = {
    val testedAddress = Address("street#1", "city#1", "country#1")

    val city = testedAddress match {
      case Address(_, cityFromAddress, _) => cityFromAddress
      case _ => ""
    }

    println(city)
  }
}