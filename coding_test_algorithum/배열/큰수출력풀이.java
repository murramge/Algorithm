package 배열;
import java.util.*;
public class 큰수출력풀이 {
    public String solution(int n, String str){
        String answer="";
        String[] s = str.split(" ");
        for(int i=0; i<str.length(); i++){
            int lownum = Integer.parseInt(s[i]);
            if( lownum > n){
                answer+=s[i];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        큰수출력풀이 T = new 큰수출력풀이();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(T.solution(n, str));
    }
}
