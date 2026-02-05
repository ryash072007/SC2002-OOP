
import java.util.Scanner;

public class P4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Height: ");
        int height = sc.nextInt();

        if (height < 1)
        {
            System.out.println("Error!");
            return;
        }

        for (int cur_hei = 1; cur_hei < height + 1; cur_hei++) {
            boolean flip = cur_hei % 2 == 0;
            for (int col = 0; col < cur_hei; col++) {
                if (flip) {
                    System.out.print("BB");
                    flip = false;
                } else {
                    System.out.print("AA");
                    flip = true;
                }
            }
            System.out.println("");
        }
    }
}
