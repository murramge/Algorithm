package hashmap_treeset;
import java.util.*;

public class 아나그램풀이 {
    public String solution(String a, String b){
        String answer="NO";
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(char x : a.toCharArray()){
            map.put(x,map.getOrDefault(x, 0)+1);
        }
        for(char x : b.toCharArray()){
            map2.put(x,map2.getOrDefault(x, 0)+1);
        }
        if(map.equals(map2)){
            answer="YES";
        }
        return answer;
    }
    public static void main(String[] args) {
        아나그램풀이 T = new 아나그램풀이();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(T.solution(a, b));
    }
}
