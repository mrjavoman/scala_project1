object testingWorksheet {

  def balance(chars: List[Char]): Boolean = {

    def leftParen(charList: List[Char], isBalanced: Boolean) : Boolean = {
      val isBalanced = false
      parse(charList, isBalanced)
    }

    def parse(charList: List[Char], isBalanced: Boolean) : Boolean = {
      if( charList.isEmpty){
        return isBalanced
      }
      val aChar = charList.head
      if (aChar == '(') {
        //isBalanced = isBalanced && leftParen(charList.tail, isBalanced)
        leftParen(charList.tail, isBalanced)
      } else if (aChar == ')') {
        return true
      }
      //println(charList.head)
      parse(charList.tail, isBalanced)
    }
    var isBalanced = true
    parse(chars,  isBalanced)
  }
  balance("Hello".toList)







}

