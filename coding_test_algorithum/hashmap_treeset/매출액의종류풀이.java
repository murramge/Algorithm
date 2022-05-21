package hashmap_treeset;
import java.util.*;

import java.util.Scanner;

public class 매출액의종류풀이 {

    public ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<k; i++){
            map.put(arr[i] , map.get(i));
            // System.out.println(map.size());
        }
        for(int j=k; j<n; j++){
            map.put(arr[j] , map.get(j));
            map.remove(arr[j-k]);
            System.out.println(map.keySet());
        }
        
        return answer;
    }    
    public static void main(String[] args) {
        매출액의종류풀이 T = new 매출액의종류풀이();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n,k,arr));
    }   
}
