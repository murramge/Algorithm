import java.util.Scanner;

public class baekjoon2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if (m < 45) {
            h--;
            m = 60 - (45 - m);
            if (h < 0) {
                h = 23;
            }
            System.out.println(h + " " + m);
        } else {
            m = m - 45;
            System.out.println(h + " " + m);
        }

    }

}
/**
 푸는 요령 1

시와 분을 참조받고,  사용자가 입력한 분이 45분이 되지 않는다면 45분 알람 일찍 설정을 하면 입력받은 시에서 -1을 해주어야 한다.

ex > 10시 10분을 입력받았다면 , 45분 일찍은 9시 25분이 되어야 하니까 입력받은 시에서 -1을 해주어야함..

​

푸는 요령2

사용자가 입력한 분이 45분이 되지 않는다면, 시에서 -1을 해주고 나서는 입력한 분도 손을 봐줘야한다.

분은 60분으로 이루어져있으니까 60  - (45 - m )을 하면, 45에서 사용자가 입력한 분을 빼고, 또 60에서 그 값을 빼면 정확한 값이 나온다.

ex > 60 - (45 - 10) = 60 - 35 = 25

​

푸는 요령3

만약에 사용자가 24시간 기준으로 0시를 입력했다면,같은 원리로 -1을 해주어야 하는데 24시간제이기 때문에 23시로 되어야 한다

23 00 01 02 03 으로 이루어지기 때문이다

이런 경우, 푸는요령 1에 따라 0을 참조받고, 45분이 되지 않았을 때 -1을 해주면 0보다 작은 값이 시가 되는데

이럴 때에는 0 다음 23시로 가도록 임의로 if (h < 0) 일때 h = 23; 으로 지정해주면 된다.

​

푸는 요령4

만약 사용자가 입력한 분이 45분이 넘는다면 else 문을 처리해서 그냥 입력한 분에 -45를 해서 처리하면 된다
 */