import java.util.Scanner;
public class baekjoon10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = 0;
        int x = 0;
        int t = sc.nextInt();

        for (int i =0; i<t; i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();
            if (n % h == 0) {
                y = h * 100;
                x = n / h;
                System.out.println(y+x);
            }
            else {
                y = (n % h) * 100;
                x = (n / h) + 1;
                System.out.println(y+x);
            }


        }
    }
}

