import java.util.Scanner;

public class baekjoon14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        if (number1 <= -1) {
            if (number2 <= -1) {
                System.out.println("3");
            }
            if (number2 >= 1) {
                System.out.println("2");
            }
        } else if (number1 >= 1) {
            if (number2 <= -1) {
                System.out.println("4");
            }
            if (number2 >= 1) {
                System.out.println("1");
            }
        }

    }

}
