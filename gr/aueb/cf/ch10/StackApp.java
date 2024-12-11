package gr.aueb.cf.ch10;

public class StackApp {
    static int[] myStack = new int[50];
    static int top = -1;

    public static void main(String[] args) {
        int num;

        try {
            push(1);
            push(2);
            push(3);
            num = pop();
            System.out.println("Popped num: " + num);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void push(int num) throws Exception {
        try {
            if (isFull()) throw new Exception("Error, Stack is Full");
            //top++;
            myStack[top] = num;
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println();
            throw e;
        }
    }

    public static int pop() throws Exception {
        try {
            if (isEmpty()) throw new Exception("Error. Stack is empty");
            return myStack[top--];
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static boolean isEmpty() {
        return top == -1;
    }

    public static boolean isFull() {
        return top == myStack.length - 1;
    }

}
