import java.io.BufferedReader;
import java.util.Scanner;
import java.util.Stack;

public class baekjoon1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int N = sc.nextInt();
        int start = 0;

        for(int i=0; i<N; i++){
            int value = sc.nextInt();

            if(value > start) {
                for (int j = start + 1; j <= value; j++) {
                    stack.push(j);
                    sb.append('+').append('\n');
                    System.out.println("start="+start);
                    System.out.println("j"+j);
                }
                start = value;
            }

            else if(stack.peek() != value) {
                System.out.println("NO");
                return;
            }
            
            stack.pop();
            sb.append('-').append('\n');
        }
        // System.out.println(sb);
    }
}
