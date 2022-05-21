package stack_queue_자료구조;
import java.util.*;
public class 후위식연산정답 {
    public int solution(String postfix){
        int answer=0;
        Stack<Integer> stack = new Stack<>();
        for(char x : postfix.toCharArray()){
            if(Character.isDigit(x)){
                stack.push(x-48);
            }
            else {
                int rt = stack.pop();
                int lt = stack.pop();
                if(x=='+'){
                    stack.push(lt+rt);
                }
                else if(x=='-'){
                    stack.push(lt-rt);
                }
                else if(x=='*'){
                    stack.push(lt*rt);
                }
                else if(x=='/'){
                    stack.push(lt/rt);
                }

            }
        }
        answer=stack.get(0);
        return answer;
    }
    public static void main(String[] args) {
        후위식연산정답 T = new 후위식연산정답();
        Scanner sc = new Scanner(System.in);
        String postfix = sc.next();
        System.out.println(T.solution(postfix));
    }
}
