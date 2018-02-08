package example

import scala.io.StdIn

object CollatzConjecture extends App {


  val num = StdIn.readLine ("Enter a number: \n")toInt

  def Collatz(num: Int, cycle: Int = 0): Int = {
    if (num == 1) {
      cycle + 1
    } else {
      if (num % 2 == 0)
        Collatz(num / 2, cycle + 1)
      else
        Collatz(3 * num + 1, cycle + 1)
    }
  }
  println(Collatz(num))
}

