package stack_queue_자료구조;

import java.util.*;
public class 공주구하기풀이 {
    public int solution(int n, int k){
        int answer=0;
        Queue<Integer> Q = new LinkedList<>();
        //queue의 선언방법

        for(int i = 1; i<=n; i++){
            Q.offer(i);
        }
        while(!Q.isEmpty()){
            for (int i =1; i<k; i++){
                Q.offer(Q.poll());
            }
            Q.poll();
            if(Q.size()==1){
                answer=Q.poll();
            }
        }

        
        return answer;
    }
    public static void main(String[] args) {
        공주구하기풀이 T = new 공주구하기풀이();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(T.solution(n, k));
    }
}
