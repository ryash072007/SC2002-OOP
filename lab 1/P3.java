import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting value: ");
        int start = sc.nextInt();
        System.out.println("Enter ending value: ");
        int end = sc.nextInt();
        System.out.println("Enter increment: ");
        int inc = sc.nextInt();
        
        if (start > end) {
            System.out.println("Error input!!");
            return;
        }
        
        System.out.println("US$  S$");
        System.out.println("--------------");
        for (int usd = start; usd <= end; usd += inc) {
            double sgd = usd * 1.82;
            System.out.printf("%-4d %.2f\n", usd, sgd);
        }
        System.out.println();
        
        System.out.println("US$  S$");
        System.out.println("--------------");
        int usd = start;
        while (usd <= end) {
            double sgd = usd * 1.82;
            System.out.printf("%-4d %.2f\n", usd, sgd);
            usd += inc;
        }
        System.out.println();
        
        System.out.println("US$  S$");
        System.out.println("--------------");
        usd = start;
        do {
            double sgd = usd * 1.82;
            System.out.printf("%-4d %.2f\n", usd, sgd);
            usd += inc;
        } while (usd <= end);
    }
}
