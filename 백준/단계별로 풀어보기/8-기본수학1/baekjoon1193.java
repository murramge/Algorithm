import java.util.Scanner;

public class baekjoon1193{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt(); //x를 부여 받는다. //3

    int cross_count = 1; //해당 범위의 대각선의 칸 개수
    int prev_count_sum = 0; //해당 대각선 직선 대각선 까지의 칸의 누적 합

    while(true) {
    //직전 대각선 누적 합 + 해당 대각선 개수 이용한 범위 판별
        if (x <= prev_count_sum + cross_count) {
            
            if (cross_count % 2 == 1) { //대각선의 개수가 홀수라면
                //분모가 큰 수부터 시작
                //분모는 대각선 개수 - (X 번째 - 직전 대각선까지의 누적 합 -1)
                //분자는 X번째 - 직전 대각선까지의 누적 합
                System.out.print((cross_count - (x - prev_count_sum - 1)) + "/" + (x - prev_count_sum));
                break;
            }
            else {
                System.out.print((x - prev_count_sum) + "/" + (cross_count - (x - prev_count_sum -1 )));
                break;
            }

        }
        else {
            prev_count_sum += cross_count;
            cross_count++;
        }


    }
}

        }
    
/**
 * 일단 X변수는 우리가 입력받을 변수이고, cross_count변수는 현재 T(대각선)의 원소 개수, prev_count_sum변수는 1부터 T-1 대각선 까지의 원소 개수인 것은 이해가시죠?

여기서 가장 중요한 것은 X-prev_count_sum 인데요.
X는 우리가 '몇 번째'원소를 출력할 것인지를 의미하는 것이고 prev_count_sum은 직전 대각선까지의 원소 개수입니다. 

위 문제의 예제 그대로 적용하면 이럴겁니다.
X=14 일것이고,
T=2 일 때는 prev_count_sum = 0, 
T=3 일 때는 prev_count_sum = 1,
T=4 일 때는 prev_count_sum = 3,
T=5 일 때는 prev_count_sum = 6,
T=6 일 때는 prev_count_sum = 10
이렇게 될 겁니다.
여기서 T=6일 때, X-prev_count_sum하면 14-10=4 로 '현재 대각선에서 4번째 원소구나!라고 볼 수 있을 겁니다. 
4번째 원소라는 것은 즉, 분모 혹은 분자가 4라는 소리와 같은 의미죠?

그럼 4가 분모로 가야할지, 분자로 가야할지 찾아야 합니다.
이 때 T=6으로 짝수이기 때문에 왼쪽 아래에서 오른쪽 위로 진행될 겁니다.
그리고 대각선으로 진행되는 분자는 서로 반비례 관계죠?
그렇다면 이렇게 볼 수 있습니다. 현재 대각선의 원소의 개수(cross_count : T=6일 때 5개)에서 '몇 번째'원소인지를 빼준다면 된다는 겁니다.

쉽게 생각해서 X-prev_count_sum이 분모라면 현재 대각선의 개수에서 분모값을 빼주면 자연스레 분자 값이 되는 것이고, 반대로 X-prev_count_sum이 분자라면 역으로 cross_count_count -(X-prev_count_sum)은 분모자 되겠죠.
다만 대각선의 개수와 분자+분모의 합은 1의 차이가 나기 때문에 전체 수식에 +1을 해주어야 할 겁니다.

cors_count-(X-prev_count_sum)+1 이나 corss_count-(X-prev_count_sum-1)이나 같은 수식이니 이 부분은 설명 안드려도 되겠죠.

*/