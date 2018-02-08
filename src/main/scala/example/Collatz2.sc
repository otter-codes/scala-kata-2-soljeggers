val num : Int = 20

def div2 (int : Int) = num / 2
def mult3(int: Int) = num * 3 + 1

num match {
  case 1 =>{num == 1
    num
  }
  case 2 if num % 2 == 0 =>
    div2(num)
  case 3 if num % 3 == 0 =>
    mult3(num) {
  }
}