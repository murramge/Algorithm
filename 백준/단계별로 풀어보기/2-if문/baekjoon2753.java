import java.util.Scanner;

public class baekjoon2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                System.out.println("1");
            }
        } else {
            System.out.println("0");
        }

    }

}

/**
 vscode에서는 실행되었는데 틀린 답이라고 떴다.. ㄱ- 그냥 한 문장으로 만들어서 통과함 (밑에 성공한 답) 
 
 import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
               if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("1");
            }
        else {
            System.out.println("0");
        }

    }

}
 */