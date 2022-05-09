package 문자열;
import java.util.*;
public class 문장속단어풀이 {

    public String solution(String a){
        String str = a;
        String[] sub = str.split(" ");
        String temp = "";
        for(int i = 0; i< sub.length; i++) {
            if (temp.length()<sub[i].length()){
                
                temp=sub[i];
            }
        } 
        return temp;
    }
    public static void main(String[] args) {
        문장속단어풀이 T = new 문장속단어풀이();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
        
    }
}
