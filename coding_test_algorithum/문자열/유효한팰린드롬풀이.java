package 문자열;

import java.util.*;
public class 유효한팰린드롬풀이 {
    public String solution(String str) {
        String answer = "NO";
        String[] s = str.split(" ");
        String all ="";
        for(String x : s){
            char[] a = x.toCharArray();
            for(int i=0; i<a.length; i++){    
               if(Character.isAlphabetic(a[i])){
                char tmp = a[i];
                all = String.valueOf(tmp);
                System.out.print(all);
                String tp = new StringBuilder(all).reverse().toString();
                System.out.print(tp);
            }
            }
           
        }
        
        return answer;
    }
    public static void main(String[] args) {
        유효한팰린드롬풀이 T = new 유효한팰린드롬풀이();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }    
}
