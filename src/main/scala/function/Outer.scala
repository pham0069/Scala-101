class Outer {
  class Inner {
    private def f() {
      print("f")
    }
    class InnerMost {
      f() //OK
    }
  }
  //not OK as f is not accessible
  //(new Inner).f()
}

class Super {
  protected def f() {
    println(f)
  }
}

class Sub extends Super {
  f() //OK as subclass
}

class Other {
  //not OK as f is inaccessible, even if Other in same package as Super
  //(new Super).f()
}
