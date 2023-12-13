class exp9_empl {
  var empId: Int = 0
  var empName: String = ""
  var designation: String = ""
  var salary: Double = 0.0

  // Method to take user input for employee details
  def getEmployee(): Unit = {
    println("Enter employee details:")
    print("Employee ID: ")
    empId = scala.io.StdIn.readInt()
    print("Employee Name: ")
    empName = scala.io.StdIn.readLine()
    print("Designation: ")
    designation = scala.io.StdIn.readLine()
    print("Salary: ")
    salary = scala.io.StdIn.readDouble()
  }

  // Method to display employee details along with grade based on salary range
  def showEmployee(): Unit = {
    println(s"Employee ID: $empId")
    println(s"Employee Name: $empName")
    println(s"Designation: $designation")
    println(s"Salary: $salary")

    val grade =
      if (salary < 10000) "D"
      else if (salary >= 10000 && salary < 25000) "C"
      else if (salary >= 25000 && salary < 50000) "B"
      else "A"

    println(s"Grade: $grade")
  }
}

object EmployeeDemo {
  def main(args: Array[String]): Unit = {
    val emp = new exp9_empl()

    // Getting employee details
    emp.getEmployee()

    // Displaying employee details and grade based on salary range
    emp.showEmployee()
  }
}
