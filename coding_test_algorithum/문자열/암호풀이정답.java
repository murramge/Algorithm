package 문자열;

import java.util.*;
public class 암호풀이정답 {
    public String solution(int n, String s){
        String answer= "";
        for(int i =0; i<n; i++){
            String tmp = s.substring(0,7).replace('#','1').replace('*', '0');
            int num=Integer.parseInt(tmp, 2);
            answer += (char)num;
            s=s.substring(7);
        }
        return answer;
    }
    public static void main(String[] args) {
        암호풀이정답 T = new 암호풀이정답();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(T.solution(n, str));
    }
}
