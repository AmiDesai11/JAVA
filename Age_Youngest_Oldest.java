import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter age of first person: ");
        int a = s.nextInt();
        System.out.println("Enter age of second person: ");
        int b = s.nextInt();
        System.out.println("Enter age of third person: ");
        int c = s.nextInt();

        if (a>b && a>c){
            System.out.println("First is oldest");
        }

        if(b>a&&b>c){
            System.out.println("second is oldest");
        }

        if(c>a && c>b){
            System.out.println("third is oldest");
        }
    }
}