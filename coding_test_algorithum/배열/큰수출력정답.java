package 배열;
import java.util.*;
public class 큰수출력정답 {
    
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i =1; i<n; i++){
            if(arr[i]>arr[i-1]){
                answer.add(arr[i]);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        큰수출력정답 T = new 큰수출력정답();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int x: T.solution(n, arr)){
            System.out.print(x + " ");
        }
    }
}
