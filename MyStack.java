public class MyStack {

    private StackNode<Integer> top;

    private static class StackNode<T> {
        T value;
        StackNode<T> next;

        StackNode(T data) {
            this.value = data;
        }
    }

    private void push(int item) {
        StackNode<Integer> t = new StackNode<Integer>(item);
        t.next = top;
        top = t;
    }

    private Integer pop() {
        if(top != null) {
            StackNode<Integer> temp = top;
            top = top.next;
            return temp.value;
        } else {
            return -1;
        }
        
    }

    private Integer peek() {
        return top.value;
    }

    private boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(2);
        stack.push(3);
        stack.push(6);
        stack.push(8);
        System.out.println("Peek - "+stack.peek());
        System.out.println("Pop - "+stack.pop());
        System.out.println("Peek - "+stack.peek());
        stack.pop();
        System.out.println("isEmpty - "+stack.isEmpty()); 
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("isEmpty - "+stack.isEmpty()); 
        
    }
}
