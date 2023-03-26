package binarytree;

public interface BinaryTree {
    void addNode(int data, int leftData, int rightData);
    void searchNode(Node node,int data, int leftData, int rightData);
    void deleteNode(Node node,int data, int leftData, int rightData);
    void preOrder(Node node); // 전위 순회
    void inOrder(Node node); // 중위 순회
    void postOrder(Node node); // 후위 순회
}
