package 배열;
import java.util.Arrays;
import java.util.Scanner;
public class 임시반장정하기풀이 {
    public int solution(int n, int[][] arr){
        int answer=0;
        int[] num = new int[n];
        int cnt = 0;
        for(int i = 0; i<n; i++){
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                    if(arr[i][j] == arr[i+k][i] ){
                        cnt++;
                        num[i] += cnt;
                    }
                }
            }
        }
        int max = num[0];
        for(int i=0; i<num.length; i++){
            if(num[i]>max){
                max = num[i];
                answer=Arrays.asList(num).indexOf(max);
            }
        }
        
        
        return answer;
    }
    public static void main(String[] args) {
        임시반장정하기풀이 T = new 임시반장정하기풀이();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[n][n];
        for(int i =0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print(T.solution(n, arr));
    }
}
