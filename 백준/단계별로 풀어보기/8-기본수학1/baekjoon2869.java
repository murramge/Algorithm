import java.util.Scanner;

public class baekjoon2869 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int v = sc.nextInt();
    
    int day = (v - b) / (a - b);

    if ((v - b) % (a - b) != 0) {
        day++;
    }
    System.out.println(day);
}
}

//https://st-lab.tistory.com/75
/**
 * down을 빼주는 이유. 올라가는 것과 내려가는 것의 차이보다 잔여블럭이 차이가 나면
 * 만약에 이제 올라가서 정상에 거의 도달했는데 잔여블럭이 있어서 미끄러질수밖에 없으니
 * 다시 올라갈때는 하루가 경과해야 한다는 뜻임. up(낮)일 때 잔여블럭이 남아있다면, 
 * 하루가 더 소요된다는 것임. 
 * 애초에 반복문으로 풀면 어렵게 설계되어있다.
 */