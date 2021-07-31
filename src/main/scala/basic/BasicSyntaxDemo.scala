import java.util.{TreeMap, TreeSet} // import multiple classes from same package
import java.util.concurrent._ //import everything in the package using _ instead of * since * could be a method name
object BasicSyntaxDemo {
  def main(args: Array[String]): Unit = {
    //age, _salary, _n_cars_1; //legal identifiers
    //123age, $salary,  -n_cars; //illegal identifiers
    //val is immutable
    val myVal : String = "foo";
    //myVal = "bar" -> illegal

    //var is mutable
    var myVar : String = "foo";
    println(myVar);
    myVar = "bar"; //OK
    println(myVar);

    //must initialize value to variable
    //var a :Int;//illegal

    //OK to ignore declaring type, i.e. Scala will infer type by itself
    var a = 10;
    var b = "Hello";
    println(a + " " + b);

    //multiple assignment is allowed
    val (age: Int, name: String) = (40, "Foo");
    println(age);
    println(name);
  }
}