import java.util.Scanner;

public class beckjoon1712 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fixsell = sc.nextInt();
        int changesell = sc.nextInt();
        int notebooksell = sc.nextInt();
        sc.close();
        if (notebooksell <= changesell) {
            System.out.println("-1");
        }
        else {
            System.out.println((fixsell/(notebooksell-changesell))+1);
        }

    }

}
