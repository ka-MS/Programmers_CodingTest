package 자료구조;

import java.util.LinkedList;
import java.util.Queue;

public class Queue두개로Stack만들기 {
    public static void main(String[] args) {
        Stack test = new Stack();
        test.push(3);
        test.push(4);
        test.push(5);
        test.push(6);
        test.push(7);
        System.out.println(test.pop());
        System.out.println(test.pop());
        test.show();
        test.show();
    }



}

class Stack {
    java.util.Queue mainQueue;
    Queue subQueue;

    public Stack() {
        mainQueue = new LinkedList();
        subQueue = new LinkedList();
    }

    public void push(int num) {
        mainQueue.add(num);
    }

    public int pop() {
        int result = 0;
        int size = mainQueue.size() - 1;

        for (int i = 0; i < size; i++) {
            subQueue.add(mainQueue.poll());
        }

        result = (int) mainQueue.poll();

        while (!subQueue.isEmpty()) {
            mainQueue.add(subQueue.poll());
        }
// 이렇게 옮겨줄 수도 있지만 배열 복사를 할 수도 있음
//        Queue temp = mainQueue;
//        mainQueue = subQueue;
//        subQueue = temp;

        return result;
    }

    public void show() {
        Queue show = mainQueue;
        int size = mainQueue.size();

        for (int i = 0; i < size; i++) {
            System.out.print(show.poll() + ",");
        }

    }


}
