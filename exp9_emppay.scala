// Abstract superclass Employee
abstract class Employee(private var name: String, private var jobTitle: String) {
  def getName: String = name
  def setName(newName: String): Unit = {
    name = newName
  }

  def getJobTitle: String = jobTitle
  def setJobTitle(newJobTitle: String): Unit = {
    jobTitle = newJobTitle
  }

  // Abstract method to calculate weekly pay
  def calculateWeeklyPay(): Double
}

// Subclass HourlyEmployee
class HourlyEmployee(name: String, jobTitle: String, private var payRate: Double, private var hoursWorked: Double)
  extends Employee(name, jobTitle) {

  def getPayRate: Double = payRate
  def setPayRate(newPayRate: Double): Unit = {
    payRate = newPayRate
  }

  def getHoursWorked: Double = hoursWorked
  def setHoursWorked(newHoursWorked: Double): Unit = {
    hoursWorked = newHoursWorked
  }

  // Implementing the abstract method to calculate weekly pay for HourlyEmployee
  override def calculateWeeklyPay(): Double = payRate * hoursWorked
}

// Subclass SalaryEmployee
class SalaryEmployee(name: String, jobTitle: String, private var weeklySalary: Double)
  extends Employee(name, jobTitle) {

  def getWeeklySalary: Double = weeklySalary
  def setWeeklySalary(newWeeklySalary: Double): Unit = {
    weeklySalary = newWeeklySalary
  }

  // Implementing the abstract method to calculate weekly pay for SalaryEmployee
  override def calculateWeeklyPay(): Double = weeklySalary
}

// Example Usage:
val hourlyEmp = new HourlyEmployee("John Doe", "Hourly Worker", 15.0, 40.0)
val salaryEmp = new SalaryEmployee("Alice Smith", "Manager", 1500.0)

println("Hourly Employee Weekly Pay: " + hourlyEmp.calculateWeeklyPay())
println("Salary Employee Weekly Pay: " + salaryEmp.calculateWeeklyPay())
