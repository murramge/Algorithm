package twopointers;

import java.util.Scanner;

public class 최대길이연속부분수열풀이 {
    public int solution(int n, int k, int[] arr){
        int answer = 0;
        int tmp = k;
        int sum = 0;
        for(int i=0; i<n; i++){
            if(arr[i]==1){
                sum++;
            }
            else if(arr[i]==0){
                if(tmp>0){
                    tmp--;
                    sum++;
                }
                else if(tmp==0){
                    answer=sum;
                    sum=1;
                    tmp=k;
                }
            }
            answer=Math.max(answer, sum);   
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        최대길이연속부분수열풀이 T = new 최대길이연속부분수열풀이();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(T.solution(n, k, arr));
    }
}
