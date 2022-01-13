import java.util.Stack;

public class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    private int front;
    private int rear;
    public MyQueue() {
        stack1 = new Stack<>();//负责进栈
        stack2 = new Stack<>();//负责出栈
    }
    public void push(int x) {
        //将新元素压入栈1中，队首指针指向该进栈元素
        if(stack1.empty()){
            front=x;
        }
        stack1.push(x);
    }

    public int pop() {
       //为了弹出stack1中的栈底元素，把其中的所有元素弹出并压入到stack2栈中，然后直接从stack2中将元素弹出，即可实现先进先出
        if (stack2.empty()){
            //stack1不空时出栈并压入stack2中
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();

    }

    public boolean empty() {
        return stack1.isEmpty()&& stack2.empty();
    }
    //队首元素（peek)
    public int peek() {
        //若栈stack2为空，则front对应的元素为队首元素，若为空则stack2的栈顶元素即为队列的队首元素。
        if (!stack2.isEmpty()) {
            return stack2.peek();
        }
        return front;
    }

}
