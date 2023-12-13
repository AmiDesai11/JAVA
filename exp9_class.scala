class ParentClass {
  def parentMethod(): Unit = {
    println("This is parent class")
  }
}

class ChildClass extends ParentClass {
  def childMethod(): Unit = {
    println("This is child class")
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    // Creating objects of ParentClass and ChildClass
    val parentObj = new ParentClass()
    val childObj = new ChildClass()

    // Calling method of parent class by object of parent class
    parentObj.parentMethod()

    // Calling method of child class by object of child class
    childObj.childMethod()

    // Calling method of parent class by object of child class
    childObj.parentMethod()
  }
}
