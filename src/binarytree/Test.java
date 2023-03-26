package binarytree;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BinaryTree t = new BinaryTreeImpl();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            t.addNode(a,b,c);
        }
        System.out.println("전위 순회");
        t.preOrder(((BinaryTreeImpl) t).root);

        System.out.println("\n중위 순회");
        t.inOrder(((BinaryTreeImpl) t).root);

        System.out.println("\n후위 순회");
        t.postOrder(((BinaryTreeImpl) t).root);

    }
}
