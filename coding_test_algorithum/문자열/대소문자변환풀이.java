package 문자열;
import java.util.*;
public class 대소문자변환풀이 {
    public String solution(String a){
        for (int i = 0; i<a.length(); i++){
            if(65<=a.charAt(i)){
                a.toLowerCase().charAt(i);
            }
            else {
                a.toUpperCase().charAt(i);
            }
        }
        return a;
    }
    public static void main(String[] args) {
        대소문자변환풀이 T = new 대소문자변환풀이();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));

    }
}
