abstract class Animals {
  def cats(): Unit
  def dogs(): Unit
}

class Cats extends Animals {
  override def cats(): Unit = println("Cats meow")
  override def dogs(): Unit = ()
}

class Dogs extends Animals {
  override def cats(): Unit = ()
  override def dogs(): Unit = println("Dogs bark")
}

object Main {
  def main(args: Array[String]): Unit = {
    val cat = new Cats()
    val dog = new Dogs()

    cat.cats()
    dog.dogs()
  }
}

