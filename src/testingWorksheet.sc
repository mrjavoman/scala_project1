object testingWorksheet {

  def balance(chars: List[Char]): Boolean = {

    def leftParen(charList: List[Char]) : Boolean = {
      //val isBalanced = false
      parse(charList, false)
    }

    def parse(charList: List[Char], isBalanced: Boolean) : Boolean = {
      //val isBalanced = isBalanced
      var isBalancedVar = isBalanced

      if( charList.isEmpty){
        return isBalancedVar
      }
      val aChar = charList.head
      if (aChar == '(') {
        isBalancedVar = (isBalancedVar && leftParen(charList.tail))
        //leftParen(charList.tail, isBalanced)
      } else if (aChar == ')') {
        return true
      }
      println(charList.head)
      parse(charList.tail, isBalancedVar)
    }
    //var isBalanced = true
    parse(chars, true)
  }
  balance("(if (zero? x) max (/ 1 x)".toList)
  //balance("(Hello".toList)

}

