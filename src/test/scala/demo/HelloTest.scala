package demo

import org.scalatest.FunSuite

/**
  * Created by tridinhnguyen on 7/13/17.
  */
class HelloTest extends FunSuite {
  test("sayHello method works properly") {
    val hello = new Hello
    assert(hello.sayHello("My name's Tri Nguyen") == "Hello, My name's Tri Nguyen!")
  }
}
