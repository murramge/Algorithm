package 문자열;
import java.util.*;
public class 암호풀이 {
    public String solution(String str){
        String answer="";
        String ten="";
        String tmp="";
        for(int i =0; i<str.length(); i++){
            if(str.charAt(i)=='#'){
                ten += '1';
            }
            else if(str.charAt(i)=='*'){
                ten += '0';
            }

        }
        
        for(int i=0; i<ten.length(); i++){
        tmp=ten.substring(0,7);
        int g = Integer.parseInt(tmp, 2);
        char ch = (char)g;
        answer+=ch;
        ten=ten.substring(7);
        }
        

     
        return answer;
    }
    public static void main(String[] args) {
        암호풀이 T = new 암호풀이();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(T.solution(str));
    }    
}
