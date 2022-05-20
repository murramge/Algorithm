package hashmaptreeset;

import java.util.*;

public class k번째큰수 {
    public int solution(int[] arr, int n, int k){
        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int l=j+1; l<n; l++){
                    Tset.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        NavigableSet<Integer> decendingSet = Tset.descendingSet();
        int cnt = 0;
        for(int x : decendingSet){
            cnt++;
            if(cnt==k){
                return x;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        k번째큰수 T = new k번째큰수();
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(T.solution(arr, n, k));
    }
}
