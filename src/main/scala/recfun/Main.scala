package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if(c == 0 || c == r) 1
    else if( c < 0 || r < 0) 0
    else pascal(c,r-1) + pascal(c-1,r-1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {

    def leftParen(charList: List[Char], isBalanced: Boolean) : Boolean = {
      //val isBalanced = false
      parse(charList, !isBalanced)
    }

    def parse(charList: List[Char], isBalanced: Boolean) : Boolean = {

      var isBalancedVar = isBalanced

      if( charList.isEmpty){
        return isBalancedVar
      }
      val aChar = charList.head
      if (aChar == '(') {
        isBalancedVar = (isBalancedVar && leftParen(charList.tail, isBalancedVar))
        //leftParen(charList.tail, isBalanced)
      } else if (aChar == ')') {
        return !isBalancedVar
      }
      println(charList.head)
      parse(charList.tail, isBalancedVar)
    }
    //var isBalanced = true
    parse(chars, true)

  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
