import java.util.Scanner;

public class baekjoon9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sihum = sc.nextInt();
        if (sihum >= 90) {
            System.out.println("A");
        } else if (sihum >= 80) {
            System.out.println("B");
        } else if (sihum >= 70) {
            System.out.println("C");
        } else if (sihum >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

    }

}
