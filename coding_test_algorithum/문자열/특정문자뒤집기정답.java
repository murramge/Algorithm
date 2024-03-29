package 문자열;
import java.util.*;
public class 특정문자뒤집기정답 {
    public String solution(String str) {
        String answer;
        char[] s = str.toCharArray();
        int lt = 0;
        int rt = str.length()-1;
        while(lt<rt) {
            if(!Character.isAlphabetic(s[lt])){
                lt++;
            }
            else if(!Character.isAlphabetic(s[rt])){
                rt--;
            }
            else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer=String.valueOf(s);
        return answer;
    }
    public static void main(String[] args) {
        특정문자뒤집기정답 T = new 특정문자뒤집기정답();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); 
        System.out.println(T.solution(str));
    }
}
