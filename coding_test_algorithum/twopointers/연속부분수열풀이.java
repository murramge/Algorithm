package twopointers;
import java.util.*;

public class 연속부분수열풀이 {
    public int solution(int n, int m, int[] arr){
        int answer=0,sum=0;
        for(int i=0; i<n; i++){
            sum+=(arr[i]);
            if(sum>m){
                sum=0;
            }
            if(sum==m){
                answer++;
            }
            answer=sum;
        }
        return answer;
    }
    public static void main(String[] args) {
        연속부분수열풀이 T = new 연속부분수열풀이();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(T.solution(n, m, arr));
    }
}
