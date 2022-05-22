import java.util.Scanner;

public class baekjoon1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();

        System.out.println(A / B);
    }

}

//이 문제는 소수점까지 나타내아 하기 때문에 double 형을 사용했다.
