import java.util.Scanner;
public class beakjoon10828 {

    public static int[] stack;
    public static int size = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        //스트링 빌드로 안에 넣어서 출력하게 만들어준다.

        int n = sc.nextInt();

        stack = new int[n];
        //스택 배열에 우리가 테스트할 숫자를 넣어준다. n개의 배열이 생성될 것이다.

        for (int i = 0; i < n; i ++) {
            String str = sc.next();
            //string으로 push, pop, size, empty, top 중 하나를 입력받는다.

            //switch-case 문으로 입력받은 str의 case에 맞게 저장한다.
            switch (str) {
                case "push" :
                push(sc.nextInt());
                //어떤것을 push할 지 입력받고 push한다.
                //이건 void여서 리턴해주지 않으니까 그냥 냅둔다. (보여주기위주)
                break;
                
                case "pop" :
                    sb.append(pop()).append('\n');
                    //이것은 pop()함수에 리턴해있는것을 스트링빌드로 넣어준다.
                    break;
                case "size" :
                    sb.append(size()).append('\n');
                    //이것은 size()함수에 리턴해있는 것을 스트링빌드로 넣어준다.
                    break;
                case "empty" :
                    sb.append(empty()).append('\n');
                      //이것은 empty()함수에 리턴해있는 것을 스트링빌드로 넣어준다.
                      break;
                case  "top" :
                    sb.append(top()).append('\n');
                      //이것은 top()함수에 리턴해있는 것을 스트링빌드로 넣어준다.
                        break;
                    }

        }
        System.out.println(sb);

    }


    public static void push(int item) {
    stack[size] = item;
    size++; 
    }

    public static int pop() {
        if (size == 0) {
            return -1;
        }
        else {
            int res = stack[size - 1];
            stack[size - 1] = 0;
            size--;
            return res;
        }

    }

    public static int size() {
        return size;
    }
    public static int empty() {
        if(size == 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
    public static int top() {
        if(size == 0) {
            return -1;
        }
        else {
            return stack[size -1];
        }
    }
}