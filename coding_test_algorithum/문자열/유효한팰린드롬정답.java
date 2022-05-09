package 문자열;

import java.util.*;
public class 유효한팰린드롬정답 {
    public String solution(String str) {
        String answer = "NO";
        str=str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) {
            answer="YES";
        }
        return answer;
    }
    public static void main(String[] args) {
        유효한팰린드롬정답 T = new 유효한팰린드롬정답();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }    
}
