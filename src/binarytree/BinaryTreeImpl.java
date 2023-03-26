package binarytree;

public class BinaryTreeImpl implements BinaryTree {

    public Node root;

    @Override
    public void addNode(int data, int leftData, int rightData) {
        if(root == null){//초기 상태 - 루트노드 생성
            root = new Node(data);
            // 좌우 값이 있는경우 -1이 아닌 경우 노드 생성
            if (leftData != -1) {
                root.left = new Node(leftData);
            }// 왼쪽 자식 노드값을 가지는 Node 인스턴스 생성
            if(rightData!= -1) {
                root.right = new Node(rightData);
            }// 오른쪽 자식 노드값을 가지는 Node 인스턴스 생성
        }else {
            //초기상태가 아니라면 루트 노드 생성 이후 만들어진 노드중 어떤건지 찾아야함
            searchNode(root, data,leftData,rightData);
        }
    }
    /*
    트리가 생성되기전 초기 root값은 null
    트리생성을 통해 처음 루트 노드객체가 생성되고 왼쪽 오른쪽 값이 있냐 없냐에 따라 왼쪽 오른쪽 역시
    노드객체가 생성됨
     */

    @Override
    public void searchNode(Node node, int data, int leftData, int rightData) {
        // 매개변수로 들어온 node를 시작으로 data와 같은 값을 가진 node를 찾는다
        if(node == null){
            //도착한 노드가 null이면 재귀 종료- 찾을노드 없음
            return;
        }else if(node.data == data){//들어갈 위치를 찾았다면
            if(leftData != -1){//값이 있는 경우에만 좌우 노드 생성
                node.left = new Node(leftData);
            }
            if(rightData!= -1){
                node.right = new Node(rightData);
            }
        }else{// 아직 찾지 못했고 탐색할 노드가 남아있다면
            searchNode(node.left, data, leftData, rightData);// 왼쪽 재귀
            searchNode(node.right, data, leftData, rightData);// 오른쪽 재귀
        }
    }

    @Override
    public void deleteNode(Node node, int data, int leftData, int rightData) {

    }

    @Override
    public void preOrder(Node node) {
        //전위순회 root -> left -> right
        if(node == null){
            System.out.print(node.data + "");
            if(node.left!= null){
                preOrder(node.left);
            }
            if(node.right!= null){
                preOrder(node.right);
            }
        }
    }

    @Override
    public void inOrder(Node node) {
        //중위 순회 left -> root -> right
        if(node == null){
            if(node.left!= null){
                inOrder(node.left);
            }
            System.out.print(node.data + "");
            if(node.right!= null){
                inOrder(node.right);
            }
        }
    }

    @Override
    public void postOrder(Node node) {
        // 후위순회 left -> right -> root
        if(node == null){
            if(node.left!= null){
                postOrder(node.left);
            }
            if(node.right!= null){
                postOrder(node.right);
            }
            System.out.print(node.data + "");
        }
    }
}
