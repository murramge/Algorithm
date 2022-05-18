package twopointers;
import java.util.*;
public class 최대매출풀이 {
    public int solution(int n, int k, int[] arr){
        int answer=0,sum=0;
        for(int i=0; i<k; i++){
            sum+=arr[i];
            answer=sum;
        }
        for(int i=k; i<n; i++){
            sum+=(arr[i]-arr[i-k]);
            answer=Math.max(answer, sum);
        }
        return answer;
    }
    public static void main(String[] args) {
        최대매출풀이 T = new 최대매출풀이();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(T.solution(n, k, arr));
    }
}

//슬라이딩 윈도우
//10개의 매출 기록이 있으면 길이가 3짜리인 창문이 있다고 생각하면 됨
//2중 for문으로 돌지 말고 해결해야함 시간복잡도가 o(n2) 이므로
//옆으로 한칸 밀어서 가버려야 한다. 