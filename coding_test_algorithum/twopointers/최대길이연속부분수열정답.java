package twopointers;

import java.util.Scanner;

public class 최대길이연속부분수열정답 {
    public int solution(int n, int k, int[] arr){
        int answer = 0, cnt=0, lt=0;
        for(int rt=0; rt<n; rt++){
            if(arr[rt]==0) cnt++;
            while(cnt>k){
                if(arr[lt]==0) cnt--;
                lt++;
            }
            answer=Math.max(answer, rt-lt+1);

        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        최대길이연속부분수열정답 T = new 최대길이연속부분수열정답();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(T.solution(n, k, arr));
    }
}
