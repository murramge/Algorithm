package 문자열;
import java.util.*;
public class 숫자만추출풀이 {
    public int solution(String s) {
        String answer= "";
        s=s.replaceAll("[^0-9]", "");
        answer=s;

       
        return Integer.parseInt(answer);
    }
    public static void main(String[] args) {
        숫자만추출풀이 T = new 숫자만추출풀이();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));

    }    
}
