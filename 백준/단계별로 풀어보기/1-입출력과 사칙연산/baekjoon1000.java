import java.util.Scanner;

public class baekjoon1000 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(A + B);
    }

}
/** 
스캐너를 사용하는 입력문제.
Bufferreader로도 사용한다고 한다.

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

이런식이 되는 듯 하다.

bufferreader는 scanner 보다 조금 더 빠르게 실행되는 것으로 보아 나중에 시간초과 문제도 있고 하니

알아두면 좋을 것 같다

다른 버전은
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args){
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
 		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(a+b);
}
이런식으로 구성된다. 조금 쓰기 까다로운 이유가 뭐냐면 공백도 아스키코드로 인해 공백도 문자로 속해서
 3을 입력할 시 나타내어지는 공백으로 인해 전혀 다른 값이 들어갈 수 있다. 
 readLine()이기 때문에.. 
 아스키코드로 변환되어서 나타내어지기때문에 이상한 숫자들이 들어갈 수 있는 것이다. 
 그러므로 StringTokenizer로 str의 " " <- 공백 단위로 구분해준 것이다.
*/