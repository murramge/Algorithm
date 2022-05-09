package 문자열;

import java.util.*;


public class 중복문자제거정답 {

    public String solution(String str) {
        String answer ="";
        for(int i=0; i<str.length(); i++) {
            System.out.println( str.charAt(i) +" " +  i+" " + str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i))==i){
                answer+=str.charAt(i);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        중복문자제거정답 T = new 중복문자제거정답();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println( T.solution(str));        
    }
}
