package binarytree;

public class Node {// 트리의 노드 정보를 저장할 클래스 구조체

    int data; // 노드값
    Node left; // 왼쪽 자식 노드 참조값
    Node right; // 오른쪽 자식 노드 참조값
    // 추가할때 참조되는 왼쪽, 오른쪽 자식의 값은 모르니까
    // data 값을 기반으로 노드 객체 생성
    public Node(int data) {
        this.data = data;
    }
}
