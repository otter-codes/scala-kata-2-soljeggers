package example

object CollatzConjecture extends App {

  /** one example below **/

  def Collatz(num: Int, cycle: Int = 0): Int = {
    if (num == 1) {
      cycle + 1
    } else {
      if (num % 2 == 0) Collatz(num / 2, cycle + 1)
      else
        Collatz(3 * num + 1, cycle + 1)
    }
  }

  println(Collatz(19))

}
