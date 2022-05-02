import java.util.Scanner;
import java.util.Stack;
public class baekjoon9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = Integer.parseInt(sc.nextLine());

        for (int i =0; i<num; i++) {
            System.out.println(err(sc.next()));
        }
    };

    public static String err (String str) {
        Stack<Character> stack = new Stack<Character>(); //stack을 만들어줌        
        for (int j=0; j<str.length(); j++){
            
            if(str.charAt(j) == '('){
                stack.push(str.charAt(j));
            }
            
            else {
                if(stack.empty()){
                    return "NO";
                }
                else {
                    stack.pop();
                }
            }

        }
    
    if (stack.empty()) {
        return "YES";
    }
    else {
        return "NO";
    }
}
    
}

