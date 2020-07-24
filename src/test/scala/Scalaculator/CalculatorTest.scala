package scala.Scalculator

import org.scalatest.FunSuite

class CalculatorTest extends FunSuite {
  test ("add numbers") {
    val achieved = 1 + 1
    val expected = 2
    assert(achieved == expected)
  }
  test ("subtract numbers") {
    val achieved = 1 - 1
    val expected = 0
    assert(achieved == expected)
  }
  test ("multiply numbers") {
    val achieved = 2 * 2
    val expected = 4
    assert(achieved == expected)
  }
  test ("divide numbers") {
    val achieved = 4 / 2
    val expected = 2
    assert(achieved == expected)
  }
}
