package twopointers;


import java.util.*;
public class 연속된자연수의합풀이 {
    public int solution(int n){
        int answer = 0,sum=0,lt=0;
        int num1 = n/2;
        int num2 = num1+1;
        int arr[] = new int[num2];
        for(int rt=0; rt<num2; rt++){
            sum+=arr[rt];
            System.out.println(sum);
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
        연속된자연수의합풀이 T = new 연속된자연수의합풀이();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
        
    }
}
