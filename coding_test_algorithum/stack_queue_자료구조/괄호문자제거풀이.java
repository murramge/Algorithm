package stack_queue_자료구조;
import java.util.*;
public class 괄호문자제거풀이 {
    
    public String solution(String str){
        String answer="";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(x==')'){
                
                stack.pop();
            }
            stack.push(x);
        }
        for(int i=0; i<stack.size(); i++){
            answer+=stack.get(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        괄호문자제거풀이 T = new 괄호문자제거풀이();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
