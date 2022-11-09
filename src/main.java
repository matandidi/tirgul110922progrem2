import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert 2 numbers in verbals x&y: x has to be smaller then y ");
        int x;
        int y;


        do {
            System.out.println("enter x: ");
            x = scanner.nextInt();
            System.out.println("enter y: ");
            y = scanner.nextInt();
            System.out.println("try again");

        } while (x > y); {

            System.out.println(x + ">" + y);
        }
    }
}





       // System.out.println(x);
       // System.out.println(y);


