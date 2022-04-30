import java.util.Scanner;
public class baekjoon2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int [15][15];

        for (int i = 0; i < 15; i++) {
            arr[i][1] = 1;
            arr[0][i] = i;
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 2; j < 15; j++){
                arr[i][j] = arr[i][j-1] + arr[i - 1][j]; 
            }
        }
        
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(arr[k][n]);
        }

        
    }
}



// import java.util.Scanner;
// public class baekjoon2775 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int f = sc.nextInt();
//         int c = sc.nextInt();
//         int fl = f+1;
//         int [][] arr = new int [fl][c];
//         int count = 0;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 count++;
//             }
//         }
//         System.out.println(count);
        
//     }
// }
//a층의 b호에 살려먼 a-1층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야함
