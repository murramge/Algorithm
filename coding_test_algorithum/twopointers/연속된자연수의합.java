package twopointers;


import java.util.*;
public class 연속된자연수의합 {
    public int solution(int n){
        int answer = 0,sum=0,lt=0;
        int m  = n/2+1;
        int arr[] = new int[m];
        for(int i=0; i<m; i++){
            arr[i]= i+1;
        }
        //일단 배열에 1,2,3,4,--- 이렇게 만들어준다.
        for (int rt=0; rt<m; rt++){
            sum+=arr[rt];
            if(sum==n){
                answer++;
            }
            while(sum>=n){
                sum-=arr[lt++];
                if(sum==n){
                    answer++;
                }
            }
        }
        
        return answer;
    }
    public static void main(String[] args) {
        연속된자연수의합 T = new 연속된자연수의합();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
        
    }
}