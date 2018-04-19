import org.scalatest._

class SumSpec extends WordSpec with MustMatchers {

  "Sum" must {

    "return 1 when given a list of 1 (sumUp)" in {
      Sum.sumUp(List(1)) mustEqual 1
    }

    "return 3 when given a list of 1, 2 (sumUp)" in {
      Sum.sumUp(List(1,2)) mustEqual 3
    }

    "return 4 when given a list of 1,2,2,3,4,4 (sumUp)" in {
      Sum.sumUp(List(1,2,2,3,4,4)) mustEqual 4
    }

    "return 9 when given a list of 1,1,2,2,3,3,4,5 (sumUp)" in {
      Sum.sumUp(List(1,1,2,2,3,3,4,5)) mustEqual 9
    }

    "return 1 when given a list of 1 (sumOneLine)" in {
      Sum.sumOneLine(List(1)) mustEqual 1
    }

    "return 3 when given a list of 1, 2 (sumOneLine)" in {
      Sum.sumOneLine(List(1,2)) mustEqual 3
    }

    "return 4 when given a list of 1,2,2,3,4,4 (sumOneLine)" in {
      Sum.sumOneLine(List(1,2,2,3,4,4)) mustEqual 4
    }

    "return 9 when given a list of 1,1,2,2,3,3,4,5 (sumOneLine)" in {
      Sum.sumOneLine(List(1,1,2,2,3,3,4,5)) mustEqual 9
    }

  }

}
