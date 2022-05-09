package 배열;
import java.util.*;

public class 보이는학생정답 {

    public Integer solution(int n, int[] arr){
        int answer;
        int max = arr[0];
        int cnt = 1;
        
        for (int i=0; i<n; i++){
            if(max<arr[i]){
                cnt++;
                max=arr[i];
               
            }
        }
        answer=cnt;
        return answer;
    }
    public static void main(String[] args) {
        보이는학생정답 T = new 보이는학생정답();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println( T.solution(n, arr));
    }    
}
