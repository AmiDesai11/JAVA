import java.util.Scanner;

public class Menu {
    public static int Factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * Factorial(num - 1);
        }
    }

    public static boolean TestArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digit;

        while (num > 0) {
            digit = num % 10;
            sum += Math.pow(digit, 3);
            num /= 10;
        }

        return sum == originalNum;
    }

    public static boolean TestPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return reversedNum == originalNum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1. Factorial\n2. Armstrong Number\n3. Palindrome\n");
        int choice = s.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter a number: ");
                int num = s.nextInt();
                int fact = Factorial(num);
                System.out.println("Factorial = " + fact);
                break;
            case 2:
                System.out.println("Enter number: ");
                int number = s.nextInt();
                boolean isArmstrong = TestArmstrong(number);
                System.out.println("Is Armstrong: " + isArmstrong);
                break;
            case 3:
                System.out.println("Enter number: ");
                int numbr = s.nextInt();
                boolean isPalindrome = TestPalindrome(numbr);
                System.out.println("Is Palindrome: " + isPalindrome);
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}
