object Sum extends App {

  def sumUp(input: List[Int]): Int = {

    val allNumbers = input.distinct
    val duplicateNumbers = input.diff(allNumbers)
    val uniqueNumbers = allNumbers.diff(duplicateNumbers)

    println(uniqueNumbers)
    uniqueNumbers.sum

  }

  println(sumUp(List(4,5,7,5,4,8)))

}
