import java.util.Scanner;

public class baekjoon2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        String B = sc.next();

        System.out.println(A * (B.charAt(2) - '0'));
        System.out.println(A * (B.charAt(1) - '0'));
        System.out.println(A * (B.charAt(0) - '0'));
        System.out.println(A * Integer.parseInt(B));

    }

}

/** 
나는 문제 보자마자 아 이거 배열사용해서 하면 되겠구나 싶어서 찾아보니 charAt라는 기능이 있어서 그걸 사용했다.

배열로도 사용하고 다른 사람 푼것을 보니 그냥 수학적으로도 가능한 것 같다.

https://st-lab.tistory.com/20

​

여기서 - '0' 을 해줘야하는 이유는, 아까 1000번의 bufferReader에도 설명했듯 아스키코드로 들어가서 그렇다.. -'0'을 해주면

우리가 생각하는 그 숫자가 들어간다.

import java.util.Scanner;
 
public class Main{
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		int A = in.nextInt();
		int B = in.nextInt();
        
		in.close();
 
		System.out.println(A*(B%10));
		System.out.println(A*(B%100/10));
		System.out.println(A*(B/100));
		System.out.println(A*B);
	}
 
}
 수학적 접근은 이렇다고 한다. B에 10을 나눈 몫을 떨궈주고 몫을 떨궈주고 나누어주는 방식으로 계산하면 저렇게 나올 것 같긴 하다.


*/