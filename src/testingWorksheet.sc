object testingWorksheet {

  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else if (c < 0 || r < 0) 0
    else pascal(c, r - 1) + pascal(c - 1, r - 1)
  }
  println("Pascal's Triangle")

  for (row <- 0 to 10) {
    for (col <- 0 to row)
      print(pascal(col, row) + " ")
    println()
  }







}

