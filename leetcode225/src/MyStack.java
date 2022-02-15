import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer>queue1;
    Queue<Integer>queue2;
    public MyStack() {
        //LinkedList类实现了Queue接口，因此可以把LinkedList当成Queue来用
        queue1 = new LinkedList<Integer>();
        queue2 = new LinkedList<Integer>();

    }
    //入栈，先将元素入队到队1，然后将队1元素出队到队2，此时队2中前面的元素是新入栈的元素
    public void push(int x) {
        queue2.offer(x);
        while (!queue1.isEmpty()){
            queue2.offer(queue1.poll());
        }
        //队1和队2元素互换，则队1的元素即为栈中的元素
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public int pop() {
        return queue1.poll();

    }

    public int top() {
        //返回队1开头
        return queue1.peek();

    }

    public boolean empty() {
        if (queue1.isEmpty()){
            return true;
        }else {
            return false;
        }

    }
}
