package twopointers;
import java.util.*;

public class 공통원소구하기풀이 {
    public ArrayList<Integer> solution(int n, int m, int[] a,int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(!answer.contains(a[i])){
                answer.add(a[i]);
            }
            else if (answer.contains(a[i])){
                arr.add(a[i]);
            }
        }
        for(int i=0; i<m; i++){
            if(!answer.contains(b[i])){
                answer.add(b[i]);
            }
            else if (answer.contains(b[i])){
                arr.add(b[i]);
            }
        }
        Collections.sort(arr);
        return arr;
    }   
     public static void main(String[] args) {
        공통원소구하기풀이 T = new 공통원소구하기풀이();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m];
        for(int i=0; i<m; i++){
            b[i] = sc.nextInt();
        }
        for(int x : T.solution(n, m , a ,b)) System.out.print(x + " ");
      
    }
}

