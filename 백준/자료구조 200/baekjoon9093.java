import java.util.Scanner;
import java.util.Stack;

public class baekjoon9093 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = 0;
            try { num = Integer.parseInt(sc.nextLine()); } 
            catch(NumberFormatException e) { e.printStackTrace(); }
            StringBuilder sb = new StringBuilder(); //stringbuilder로 string 담아주는 역할

            for (int i = 0; i < num; i++){
                String str = sc.nextLine() + "\n";
                Stack<Character> stack = new Stack<Character>(); //stack을 만들어줌

                for (int j =0; j < str.length(); j++) {
                    if (str.charAt(j) == ' ' || str.charAt(j) == '\n') {
                        while (!stack.empty()) {
                            sb.append(stack.pop());
                        }
                        sb.append(str.charAt(j));
                    }
                    else {
                        stack.push(str.charAt(j));
                    }
                }

            }
            System.out.print(sb.toString());
        }
    }

            


