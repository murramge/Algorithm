package stack_queue_자료구조;
import java.util.*;
import java.io.*;

class Person{
	int id;
	int priority;
	public Person(int id, int priority){
		this.id=id;
		this.priority=priority;
	}
}

class 응급실 {	
	public int solution(int n, int m, int[] arr){
		int answer=0;
		Queue<Person> Q=new LinkedList<>();
		for(int i=0; i<n; i++){
			Q.offer(new Person(i, arr[i]));
		}
		while(!Q.isEmpty()){
			Person tmp=Q.poll();
			for(Person x : Q){
				if(x.priority>tmp.priority){
					Q.offer(tmp);
					tmp=null;
					break;
				}
			}
			if(tmp!=null){
				answer++;
				if(tmp.id==m) return answer;
			}
		}
		return answer;
	}
	public static void main(String[] args) throws IOException{
		응급실 T = new 응급실();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int m=kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		System.out.println(T.solution(n, m, arr));	
	}
}