package 배열;
import java.util.*;
public class 피보나치수열풀이 {
    public ArrayList<Integer> solution(int a, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        int number = 1;
        int sum = 0;
        arr[0] = number;
        arr[1] = number;
        for(int i=2; i<a; i++){
            
        }

        return answer;
    }
    public static void main(String[] args) {
        피보나치수열풀이 T = new 피보나치수열풀이();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println(T.solution(num, arr));
    }
}
