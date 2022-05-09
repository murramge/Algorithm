package 문자열;
import java.util.*;
public class 단어뒤집기풀이 {

    public static int stack[];
    public static int size = 0;
    public static void main(String[] args) {
        단어뒤집기풀이 T = new 단어뒤집기풀이();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }    

    public String solution(String str){
        String answer = "";
        Stack<Character> stack;
        StringBuilder sb = new StringBuilder();
        System.out.println(str.length());
        for (int i=0; i<str.length(); i++){

        }
        System.out.println(answer);
        
        return answer;
    }
}
