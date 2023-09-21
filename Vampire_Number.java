import java.util.Scanner;

public class Vampire {
    public static void main(String[] args) {
        System.out.print("Enter a 4-digit number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 10; i <= 99; i++) {
            for (int j = i; j <= 99; j++) {
                int product = i * j;
                if (product == num && isVampire(i, j)) {
                    System.out.println("Vampire numbers: " + i + " x " + j);
                }
            }
        }
    }

    public static boolean isVampire(int a, int b) {
        String str1 = String.valueOf(a);
        String str2 = String.valueOf(b);
        String str = str1 + str2;
        char[] numChars = str.toCharArray();

        String productStr = String.valueOf(a * b);
        char[] productChars = productStr.toCharArray();

        Arrays.sort(numChars);
        Arrays.sort(productChars);

        return Arrays.equals(numChars, productChars);
    }
}
