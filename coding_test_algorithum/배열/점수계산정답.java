package 배열;

import java.util.Scanner;

public class 점수계산정답 {
    public Integer solution(int n, int[] arr){
        int answer=0;
        int cnt=0;
        for(int i=0; i<n; i++){
            if(arr[i]!=0){
                cnt++;
                answer+=cnt;
            }
            else{
                cnt=0;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        점수계산정답 T = new 점수계산정답();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(T.solution(n, arr));
    }
}
