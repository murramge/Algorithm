package stack_queue_자료구조;
import java.util.*;

public class 교육과정설계정답 {
    public String solution(String n, String m){
        String answer="YES";
        Queue<Character> P = new LinkedList<>();
        for(char g : n.toCharArray()){
            P.offer(g);
        }
        for(char x : m.toCharArray()){
            if(P.contains(x)){
                if(x!=P.poll()){
                    answer = "NO";
                }
            }
        }
        if(!P.isEmpty()){
            answer= "NO";
        }

        return answer;
    }
    public static void main(String[] args) {
        교육과정설계정답 T = new 교육과정설계정답();
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String m = sc.next();
        System.out.println(T.solution(n,m));
    }
}
