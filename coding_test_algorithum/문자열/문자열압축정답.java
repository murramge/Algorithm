package 문자열;

import java.util.*;
public class 문자열압축정답 {

    public String solution(String s) {
        String answer = "";
        s=s+" ";
        int cnt = 1;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)==s.charAt(i+1)){    
                cnt++;
            }
            else {
                answer+=s.charAt(i);
                if(cnt>1){
                    answer+=String.valueOf(cnt); //integer.toString
                    cnt=1;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        문자열압축정답 T = new 문자열압축정답();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }

}
