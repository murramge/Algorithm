package stack_queue_자료구조;
import java.util.*;
public class 후위식연산 {
    public int solution(String postfix){
        int answer=0;
        Stack<Integer> stack = new Stack<>();
        for(char x : postfix.toCharArray()){
            if(x=='+'){
                int rt = stack.pop();
                int lt = stack.pop();
                int plus = lt+rt;
                stack.push(plus);
            }
            else if(x=='*'){
                int rt = stack.pop();
                int lt = stack.pop();
                int gob = lt*rt;
                stack.push(gob);
            }
            else if(x=='-'){
                int rt = stack.pop();
                int lt = stack.pop();
                int minus = lt-rt;
                stack.push(minus);
            }
            else if(x=='/'){
                int rt = stack.pop();
                int lt = stack.pop();
                int na = lt/rt;
                stack.push(na);
            }
            else {
                stack.push(x-48);
            }
        }
        answer = stack.get(0);
        return answer;
    }
    public static void main(String[] args) {
        후위식연산 T = new 후위식연산();
        Scanner sc = new Scanner(System.in);
        String postfix = sc.next();
        System.out.println(T.solution(postfix));
    }
}
