package 배열;
import java.util.*;
public class 피보나치수열정답 {
    public int[] solution(int a){
        int [] answer = new int [a];
        answer[0]=1;
        answer[1]=1;
        for(int i=2; i<a; i++){
            answer[i]=answer[i-2]+answer[i-1];
        }
        
        
        return answer;
        // int d=1, b=1, c;
        //     System.out.println(a+" "+b+" ");
        //     for(int i=2; i<a; i++){
        //         c=d+b;
        //         System.out.println(c+" ");
        //         d=b;
        //         b=c;
        //     }

    }
    public static void main(String[] args) {
        피보나치수열정답 T = new 피보나치수열정답();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int x : T.solution(num)){
            System.out.print(x + " ");
        }
        T.solution(num);
    }
}
