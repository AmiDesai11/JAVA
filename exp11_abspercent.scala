abstract class Marks {
  def getPercentage(marks: Int*): Double
}

class A(subject1: Int, subject2: Int, subject3: Int) extends Marks {
  override def getPercentage(marks: Int*): Double = marks.sum / marks.length
}

class B(subject1: Int, subject2: Int, subject3: Int, subject4: Int) extends Marks {
  override def getPercentage(marks: Int*): Double = marks.sum / marks.length
}

object Main {
  def main(args: Array[String]): Unit = {
    val studentA = new A(85, 90, 75)
    val studentB = new B(78, 92, 85, 88)

    println(s"Percentage of Student A: ${studentA.getPercentage(85, 90, 75)}")
    println(s"Percentage of Student B: ${studentB.getPercentage(78, 92, 85, 88)}")
  }
}
