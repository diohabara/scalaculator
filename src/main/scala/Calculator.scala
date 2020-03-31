import scala.collection.mutable.Stack

class Calculator(input: String) {
  // mutable fields
  private var result = 0.0
  private var value = 0.0
  private var stack = Stack[Double]()

  def parse(): Double = {
    for (c <- input) {
      c match {
        case '+'              => add()
        case '-'              => sub()
        case '*'              => mul()
        case '/'              => div()
        case '.'              => dec()
        case c if (c.isDigit) => cal(c)
        case _ =>
          throw new IllegalStateException("This character is not illegal")
      }
    }
    result
  }
  private def add(): Unit = {
    println("{result}")
  }
  private def sub(): Unit = {
    println("{result}")
  }
  private def mul(): Unit = {
    println("{result}")
  }
  private def div(): Unit = {
    println("{result}")
  }
  private def cal(c: Char): Unit = {
    value *= 10.0
    value += c.toDouble
  }
  private def dec(): Unit = {
    print("{result}")
  }
  private def Print(): Unit = {
    println("{result}")
  }
}
