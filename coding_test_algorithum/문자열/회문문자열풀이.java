package 문자열;
import java.util.*;

public class 회문문자열풀이 {
    public String solution(String str) {
        String answer = " ";

        char[] a = str.toCharArray();
        int lt = 0;
        int rt = str.length()-1;
        while(lt<rt){
            if(a[lt]==a[rt]){
                lt++;
                rt--;
            }
        }

        return answer;
    }
    public static void main(String[] args) { 
        회문문자열풀이 T = new 회문문자열풀이();
        Scanner sc = new Scanner(System.in);    
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
    
}
