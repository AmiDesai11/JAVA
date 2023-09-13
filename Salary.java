import java.util.Scanner;

public class Salary{
    int emp_no;
    String emp_name;
    double basic;

    public void Calculate_Salary(){
        double DRA = 0.7 * basic;
        double HRA = 0.3 * basic;
        double CCA = 240D;
        double PF = 0.1 * basic;
        double PT = 100D;

        double Gross_Salary = DRA + HRA + CCA + PT;
        double Net_Salary = Gross_Salary - PF;

        System.out.println("Gross Salary:" + Gross_Salary);
        System.out.println("Net Salary:" + Net_Salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Salary s = new Salary();
        System.out.println("Enter Your Emp_Name: ");
        s.emp_name = sc.nextLine();
        System.out.println("Enter Your Emp_No: ");
        s.emp_no = sc.nextInt();
        System.out.println("Enter Your Basic Salary: ");
        s.basic = sc.nextDouble();

        s.Calculate_Salary();
    }
}