package 문자열;
import java.util.*;
public class 대소문자변환정답 {
    public String solution(String a){

        String answer = "";
        for(char x : a.toCharArray()) {
            // if(Character.isLowerCase(x)){
            //     answer+= Character.toUpperCase(x);
            // }
            // else{
            //     answer+= Character.toLowerCase(x);
            // }
            if (x>=97 && x<=122){
                answer+= (char)(x-32);   
            }
            else {
                answer+= (char)(x+32);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        대소문자변환정답 T = new 대소문자변환정답();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));

    }
}

//대문자 65-90
//소문자 97-122
//둘의 차이는 32