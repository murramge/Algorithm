package 배열;
import java.util.*;

public class 가위바위보풀이 {

    public String solution(int n, int[][] arr){
        String answer="";
        
            for(int j=0; j<n; j++){

                if(arr[0][j] == arr[1][j]){
                    answer+="D";
                }
                else if (arr[0][j] == 1 && arr[1][j] == 3){
                    answer+="A";
                }
                else if (arr[0][j] == 2 && arr[1][j] == 1){
                    answer+="A";
                }
                else if (arr[0][j] == 3 && arr[1][j] == 2){
                    answer+="A";
                }
                else {
                    answer+="B";
                }
                
            }
        
            
       
        return answer;
    }
    public static void main(String[] args) {
        가위바위보풀이 T = new 가위바위보풀이();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[2][n];
        for(int i=0; i<2; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(char x : T.solution(n,arr).toCharArray()){
            System.out.println(x);
        }
       
    }    
}
