//

object testingWorksheet {

  def countChange(money: Int, coins: List[Int]): Int = {
    //if( !coins.isEmpty )
      //println(coins.reverse.head)
    //def num_ways(m: Int, c: List[Int]): Int = {
    if( money < 0 || coins.isEmpty) 0
    else if (money == 0 && coins.size == 1) 1
    else countChange(money,coins.reverse.tail) + countChange(money - coins.reverse.head ,coins)
    //}
    //num_ways(money,coins)
  }
  countChange(4,List(1,2))
}

