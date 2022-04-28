import java.util.Scanner;

public class baekjoon2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

  
            for (int i = 1; i <= 9; i++) {
                System.out.println(n + " * " + i + " = " + (n * i));
            }
        }

}

/**
 간단한 for문을 써서 만드는 구구단 예제이다

출력할 때 공백*공백, 공백=공백 을 해야 제출할 때 틀렸습니다! 가 안뜬다..
 */