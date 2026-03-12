
import java.util.Scanner;

public class Lab2p1 {

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Perform the following methods:");
            System.out.println("1: miltiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    mulTest();
                    break;
                case 2: {
                    Scanner sc2 = new Scanner(System.in);
                    System.out.print("Enter m: ");
                    int m = sc2.nextInt();
                    System.out.print("Enter n: ");
                    int n = sc2.nextInt();
                    System.out.printf("%d / %d = %d\n", m, n, divide(m, n));
                    break;
                }
                case 3: {
                    Scanner sc3 = new Scanner(System.in);
                    System.out.print("Enter m: ");
                    int m = sc3.nextInt();
                    System.out.print("Enter n: ");
                    int n = sc3.nextInt();
                    System.out.printf("%d %% %d = %d\n", m, n, modulus(m, n));
                    break;
                }
                case 4: {
                    Scanner sc4 = new Scanner(System.in);
                    System.out.print("Enter n: ");
                    int n = sc4.nextInt();
                    int result = countDigits(n);
                    if (result != -1) {
                        System.out.printf("count = %d\n", result);
                    }
                    break;
                }
                case 5: {
                    Scanner sc5 = new Scanner(System.in);
                    System.out.print("Enter n: ");
                    int n = sc5.nextInt();
                    System.out.print("Enter digit: ");
                    int digit = sc5.nextInt();
                    int result = position(n, digit);
                    System.out.printf("position = %d\n", result);
                    break;
                }
                case 6: {
                    Scanner sc6 = new Scanner(System.in);
                    System.out.print("Enter n: ");
                    long n = sc6.nextLong();
                    long result = extractOddDigits(n);
                    System.out.printf("oddDigits = %d\n", result);
                    break;
                }
                case 7:
                    System.out.println("Program terminating ….");
            }
        } while (choice < 7);
    }
    
    public static int divide(int m, int n) {
        int quotient = 0;
        while (m >= n) {
            m -= n;
            quotient++;
        }
        return quotient;
    }
    
    public static int modulus(int m, int n) {
        while (m >= n) {
            m -= n;
        }
        return m;
    }
    
    public static int countDigits(int n) {
        if (n < 0) {
            System.out.println("Error input!!");
            return -1;
        }
        int count = 0;
        if (n == 0) return 1;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
    
    public static int position(int n, int digit) {
        int pos = 1;
        while (n > 0) {
            if (n % 10 == digit) {
                return pos;
            }
            n /= 10;
            pos++;
        }
        return -1;
    }
    
    public static long extractOddDigits(long n) {
        if (n < 0) {
            System.out.println("Error input!!");
            return -1;
        }
        long result = 0;
        long multiplier = 1;
        boolean foundOdd = false;
        
        while (n > 0) {
            int digit = (int)(n % 10);
            if (digit % 2 == 1) {
                result = result + digit * multiplier;
                multiplier *= 10;
                foundOdd = true;
            }
            n /= 10;
        }
        
        return foundOdd ? result : -1;
    }

    public static void mulTest(){
        int correct_ans = 0;
        for (int idx = 0; idx < 5; idx++){
            int num1 = (int) (Math.random() * 10);
            int num2 = (int) (Math.random() * 10);
            System.out.printf("How much is %d times %d? ", num1, num2);
            Scanner sc = new Scanner(System.in);
            int ans = sc.nextInt();

            if (num1 * num2 == ans) {
                correct_ans++;
            }
        }
        System.out.println("*******************");
        System.out.printf("%d out of 5 are correct.\n", correct_ans);
    }
}
