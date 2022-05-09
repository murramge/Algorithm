package 문자열;
import java.util.*;
public class 문장속단어정답 {

    public String solution(String a){
        String answer= "";
        int m=Integer.MIN_VALUE, pos;
        while((pos=a.indexOf(' '))!=-1) {
            String tmp = a.substring(0, pos);
            int len = tmp.length();
            if(len>m){
                m=len;
                answer=tmp;
            }
            a=a.substring(pos+1);
        }
            if(a.length()>m){
                answer=a;
            }
        
        String[] s = a.split(" ");
        for (String x : s){
            int len = x.length();
            if(len>m){
                m=len;
                answer=x;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        문장속단어정답 T = new 문장속단어정답();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); //한 줄을 입력받아야 하니까 nextLine 으로 받음.
        System.out.println(T.solution(str));
        
    }
}
