package stack_queue_자료구조;

import java.util.*;


public class 올바른괄호풀이 {

    public String solution(String g){
        String answer = " ";
        Stack<Character> sta = new Stack<>();
        for(char x : g.toCharArray()){
            if(x=='('){
                sta.push(x);
            }
            else {
                if(sta.empty()){
                    answer = "NO";
                }
                else {
                    sta.pop();
                }
            }
        }
        if (sta.empty()){
            answer = "YES";
        }
        else {
            answer = "NO";
        }
        return answer;
    }
    public static void main(String[] args) {
        올바른괄호풀이 T = new 올바른괄호풀이();
        Scanner sc = new Scanner(System.in);
        String g = sc.next();
        System.out.println(T.solution(g));
    }
}
