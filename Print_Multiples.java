import java.util.Scanner;

public class Multiples{
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for(int i=1; i<=10; i++){
            System.out.format("%d x %d = %d \n", num, i, num * i);
        }
    }
}