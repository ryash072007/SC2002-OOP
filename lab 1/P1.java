import java.util.Scanner;

public class P1
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        String choice = scanner.next();

        switch (choice){
            case "A", "a":
                System.out.println("Action Movie Fan");
                break;
            case "C", "c":
                System.out.println("Comedy Movie Fan");
                break;
            case "D", "d":
                System.out.println("Drama Movie Fan");
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}