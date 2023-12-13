class exp9_student(private var name: String = "Unknown") {
  def displayName(): Unit = {
    println(s"Student name: $name")
  }
}

object StudentDemo {
  def main(args: Array[String]): Unit = {
    // Creating objects of Student class with different names
    val student1 = new exp9_student() // No name provided, defaults to "Unknown"
    val student2 = new exp9_student("Alice")
    val student3 = new exp9_student("Bob")

    // Displaying names of students
    student1.displayName() // Will print "Student name: Unknown"
    student2.displayName() // Will print "Student name: Alice"
    student3.displayName() // Will print "Student name: Bob"
  }
}
