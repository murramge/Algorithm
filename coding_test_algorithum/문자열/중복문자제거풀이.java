package 문자열;

import java.util.*;


public class 중복문자제거풀이 {

    public String solution(String str) {
        char a[] = str.toCharArray();
        String answer = "";
        for(char x : a){
           
            String se = String.valueOf(x);

            if(!answer.contains(se)){
                answer+=se;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        중복문자제거풀이 T = new 중복문자제거풀이();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println( T.solution(str));        
    }
}
