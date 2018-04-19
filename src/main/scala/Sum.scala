object Sum extends App {

  def sumUp(input: List[Int]): Int = {

    val allNumbers = input.distinct
    val duplicateNumbers = input.diff(allNumbers)
    val uniqueNumbers = allNumbers.diff(duplicateNumbers)

    println(input)
    println(allNumbers)
    println(duplicateNumbers)
    println(uniqueNumbers)
    println(uniqueNumbers.sum)

    uniqueNumbers.sum

  }

  def sumOneLine(input: List[Int]): Int = {
    input.distinct.diff(input.diff(input.distinct)).sum
  }

  sumUp(List(4,5,7,5,4,8))
  sumOneLine(List(1,1,2,2,3,3,4,5))

}
