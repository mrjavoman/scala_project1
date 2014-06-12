object testingWorksheet {

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
  //balance("(if (zero? x) max (/ 1 x)".toList)
  balance("((Hello))".toList)
}

