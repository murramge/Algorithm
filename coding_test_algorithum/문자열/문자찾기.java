package 문자열;
import java.util.Scanner;
  
public class 문자찾기 {

    public int solution(String a, char b) {
        int sum = 0;
        String str = a.toUpperCase();
        char t = Character.toUpperCase(b);
        // for (int i = 0; i<str.length(); i++){
        //     if(str.charAt(i)==t){
        //         sum++;
        //     }
        // }
        for (char x : str.toCharArray()){
            if(x==t){
                sum ++;
                
            }
        }

        return sum;
    }
  public static void main(String[] args){
    문자찾기 T = new 문자찾기();
    Scanner in=new Scanner(System.in);
    String str = in.next();
    char c = in.next().charAt(0);
    System.out.println(T.solution(str, c));
  }
}