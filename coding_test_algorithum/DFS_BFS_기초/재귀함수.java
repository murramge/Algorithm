package DFS_BFS_기초;

public class 재귀함수 {
	public void DFS(int n) {
		if(n==0) {
			return;
		}
		else {
		DFS(n-1);
		System.out.print(n+ " ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		재귀함수 T = new 재귀함수();
		T.DFS(3);
	}

}
