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

    var localChars = chars

    def leftParen(isBalanced: Boolean) : Boolean = {
      parse( false)
    }

    def parse( isBalanced: Boolean ) : Boolean = {

      var isBalancedVar = isBalanced

      if( localChars.isEmpty){
        return isBalancedVar
      }

      val aChar = localChars.head
      localChars = localChars.tail

      if (aChar == '(') {
        isBalancedVar = leftParen(isBalancedVar) && isBalancedVar
      } else if (aChar == ')') {
        return !isBalancedVar
      }
      println(aChar)

      parse(isBalancedVar)
    }

    parse(true)

  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    //if( !coins.isEmpty )
      //println(coins.reverse.head)

    if( money < 0 || coins.isEmpty) 0
    else if (money == 0 && coins.size == 1) 1
    else return countChange(money,coins.reverse.tail) + countChange(money - coins.reverse.head ,coins)

  }
}
