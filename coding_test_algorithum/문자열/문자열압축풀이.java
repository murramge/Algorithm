package 문자열;

import java.util.*;
public class 문자열압축풀이 {

    public String solution(String str) {
        String answer = "";
        String br = new StringBuilder().toString();
        int number = 1;
        for(int i=0; i<str.length(); i++){
            int a = str.indexOf(str.charAt(i));
            // System.out.println(str.charAt(i)+ " " + i + " " + str.indexOf(str.charAt(i)));
            if(i==i+1){    
                number++;
            }
            else if(i!=i+1){
                answer+=str.charAt(i);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        문자열압축풀이 T = new 문자열압축풀이();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }

}
