package DFS_BFS_기초;
class Node{
    int data; //번호 1,2,3,4,5,6,7 저장
    Node lt, rt; //왼쪽 노드 주소 저장, 오른쪽 노드 주소 저장
    public Node(int val) {
        data=val; //생성자 value
        lt=rt=null; //왼쪽,오른쪽 일단 null로 저장
    }
}
public class 이진트리순회 {
    Node root;
    public void DFS(Node root){
        if(root==null) return;
        else{
            System.out.print(root.data+" ");
            DFS(root.lt);
            DFS(root.rt);
            
        }

    }
    public static void main(String[] args) {
        이진트리순회 tree = new 이진트리순회();
        tree.root=new Node(1);
        tree.root.lt=new Node(2);
        tree.root.rt=new Node(3);
        tree.root.lt.lt=new Node(4);
        tree.root.lt.rt=new Node(5);
        tree.root.rt.lt=new Node(6);
        tree.root.rt.rt=new Node(7);
        tree.DFS(tree.root);
    }   
}
