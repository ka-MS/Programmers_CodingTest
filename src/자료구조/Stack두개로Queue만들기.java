package 자료구조;

import java.util.Stack;

public class Stack두개로Queue만들기 {
    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println(q.Dequeue());
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);
        q.Enqueue(4);
        q.show();
        q.Dequeue();
        q.Dequeue();
        q.show();
        q.Enqueue(5);
        q.Enqueue(56);
        q.Dequeue();
        q.show();

    }

}

class Queue {
    private Stack que;
    private Stack deque;

    public Queue() { //변수를 초기화 할 수 있도록 생정자를 만들어준다.
        que = new Stack();
        deque = new Stack();
    }


    public void Enqueue(int num) { // 입력시에는 첫번째 큐에 저장
        que.push(num);
    }

    public int Dequeue() { // 값을 빼낼때는 첫번째 큐의 값을 거꾸로 두번째 큐에 저장한 후 첫번째 값을 빼낸다.
        int result = 0;

        while (!que.isEmpty()) {
            deque.push(que.pop());
        }
        result = (int) deque.pop();

//        while (!deque.isEmpty()) {
//            que.push(deque.pop());
//        }
        Stack temp = deque;
        deque = que;
        que = deque;


        return result;
    }

    public void show() {

        for (int i = 0; i < que.size(); i++) {
            System.out.print(que.get(i) + ",");
        }
        System.out.println();

    }


}
