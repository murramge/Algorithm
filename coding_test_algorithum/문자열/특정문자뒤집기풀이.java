package 문자열;
import java.util.*;
public class 특정문자뒤집기풀이 {
    public ArrayList<String> solution(String a){
        ArrayList<String> answer = new ArrayList<>();
        char[] ch = a.toCharArray();
        for(char t : ch){
            int lt = 0;
            int rt = a.length()-1;
            while(lt<rt){
                if((Character.isLowerCase(ch[lt]) && Character.isLowerCase(ch[rt])) || (Character.isUpperCase(ch[lt]) && Character.isUpperCase(ch[rt]))){
                    char tmp = ch[lt];
                    ch[lt] = ch[rt];
                    ch[rt] = tmp;
                    lt++;
                    rt--;
                }
                else{
                    lt++;
                    rt--;
                }
            }
            String tmp = String.valueOf(ch);
            answer.add(tmp);
            System.out.println(answer);
        }
        return answer;
    }
    public static void main(String[] args) {
        특정문자뒤집기풀이 T = new 특정문자뒤집기풀이();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
