abstract class Bank {
  def getBalance: Int
}

class BankA extends Bank {
  override def getBalance: Int = 100
}

class BankB extends Bank {
  override def getBalance: Int = 150
}

class BankC extends Bank {
  override def getBalance: Int = 200
}

object Main {
  def main(args: Array[String]): Unit = {
    val bankA = new BankA()
    val bankB = new BankB()
    val bankC = new BankC()

    println(s"Balance in Bank A: ${bankA.getBalance}")
    println(s"Balance in Bank B: ${bankB.getBalance}")
    println(s"Balance in Bank C: ${bankC.getBalance}")
  }
}
