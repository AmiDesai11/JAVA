class Member {
  var name: String = ""
  var age: Int = 0
  var phoneNumber: String = ""
  var address: String = ""
  var salary: Double = 0.0

  def printSalary(): Unit = {
    println(s"Salary: $salary")
  }
}

class exp9_member extends Member {
  var specialization: String = ""
}

class Manager extends Member {
  var department: String = ""
}

object Main {
  def main(args: Array[String]): Unit = {
    val employee = new exp9_member()
    employee.name = "John Doe"
    employee.age = 30
    employee.phoneNumber = "1234567890"
    employee.address = "123 Main St"
    employee.salary = 50000.0
    employee.specialization = "Software Development"

    val manager = new Manager()
    manager.name = "Alice Smith"
    manager.age = 35
    manager.phoneNumber = "9876543210"
    manager.address = "456 Elm St"
    manager.salary = 70000.0
    manager.department = "Human Resources"

    // Printing details of Employee and Manager
    println("Employee details:")
    println(s"Name: ${employee.name}")
    println(s"Age: ${employee.age}")
    println(s"Phone Number: ${employee.phoneNumber}")
    println(s"Address: ${employee.address}")
    employee.printSalary()
    println(s"Specialization: ${employee.specialization}")

    println("\nManager details:")
    println(s"Name: ${manager.name}")
    println(s"Age: ${manager.age}")
    println(s"Phone Number: ${manager.phoneNumber}")
    println(s"Address: ${manager.address}")
    manager.printSalary()
    println(s"Department: ${manager.department}")
  }
}
