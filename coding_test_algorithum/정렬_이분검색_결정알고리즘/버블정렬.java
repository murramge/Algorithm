package 정렬_이분검색_결정알고리즘;

import java.util.Scanner;

public class 버블정렬 {
    public int[] solution(int n, int[] arr){
        
        return arr;
    }
    public static void main(String[] args) {
        버블정렬 T = new 버블정렬();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        for(int x : T.solution(n, arr)){
            System.out.println(x+" ");
        }
    }
}
