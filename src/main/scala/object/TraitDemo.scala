import java.awt.print.Printable
object TraitDemo {
  def main(args: Array[String]): Unit = {
    var a : FemaleCoder = new FemaleCoder(30, 10);
    println(a.isFemale());
    println(a.getAge());
    println(a.getCodeAge());
    println(a.weight);
    println(a.married);
    println(a.height);
  }
}

/**
 * A trait is encapsulation of method of field definitions
 * Trait can have methods (both abstract and non-abstract) and fields as its members
 * If trait contains method implementation, class extending this trait does not need to implement that method
 * Trait cannot have constructor parameters
 * A class can inherit multiple traits
 * Concrete fields value in trait can be overriden in
 */

trait Female {
  var married: Boolean
  var height = 160
  val weight = 50
  def isFemale() : Boolean = true
  def getAge() : Int
}

trait Coder {
  def getCodeAge(): Int
}

class FemaleCoder(aAge: Int, aCodeAge: Int) extends Female with Coder {
  //Overriding Female's fields
  var married = false // need to declare var for uninitalized variable
  height = 162 // no need to specify override for initialized variable
  override val weight = 52 // need to specify override for val

  var age: Int = aAge
  var codeAge: Int = aCodeAge
  def getAge(): Int = age
  def getCodeAge(): Int = codeAge
}