import java.util.Scanner;

public class P2
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int salary, merit;
        System.out.print("Salary: ");
        salary = scanner.nextInt();
        System.out.print("Merit: ");
        merit = scanner.nextInt();

        String grade;
        if (salary >= 700 && salary <= 799) {
            grade = (merit < 20) ? "Grade B" : "Grade A";
        } else if (salary >= 800 && salary <= 899) {
            grade = "Grade A";
        } else if (salary >= 600 && salary <= 649) {
            grade = (merit < 10) ? "Grade C" : "Grade B";
        } else if (salary >= 650 && salary <= 699) {
            grade = "Grade B";
        } else if (salary >= 500 && salary <= 599) {
            grade = "Grade C";
        } else {
            grade = "No grade";
        }

        System.out.println(grade);
        scanner.close();
    }
}