package 문자열;
import java.util.*;

public class 숫자만추출정답 {
    public int solution(String s){
        // int answer=0;
        // for(char x : s.toCharArray()){
        //     if(x>=48 && x<=57) {
        //         answer=answer*10+(x-48);
        //     }
        // }
        String answer = "";
        for(char x : s.toCharArray()){
            if(Character.isDigit(x)){
                answer+=x;
            }
        }
        return Integer.parseInt(answer);
    }
    public static void main(String[] args) {
        숫자만추출정답 T = new 숫자만추출정답();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
