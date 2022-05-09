package 문자열;
import java.util.*;

public class 회문문자열정답 {
    public String solution(String str) {
        String answer = "NO";
        str=str.toUpperCase();
        int len = str.length();
        for(int i=0; i<len/2; i++) {
            if(str.charAt(i)!=str.charAt(len-i-1)){
                return "NO";
            }
        }

        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)){
            return "YES";
        }


        return answer;
    }
    public static void main(String[] args) { 
        회문문자열정답 T = new 회문문자열정답();
        Scanner sc = new Scanner(System.in);    
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
    
}
