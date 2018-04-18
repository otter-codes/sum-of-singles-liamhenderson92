object Sum extends App {

  def sumUp(input: List[Int]): Int = {

    val allNumbers = input.distinct
    val duplicateNumbers = input.diff(allNumbers)
    val uniqueNumbers = allNumbers.diff(duplicateNumbers)

    uniqueNumbers.sum

  }
  
}
