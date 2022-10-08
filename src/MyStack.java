public class MyStack {
    private int[] stack;
    private int top;
    private int amount;

    public MyStack(int size){
        stack = new int[size];
        top = -1;
        amount = size;
    }

    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == amount - 1;
    }

    public void push(int data) throws Exception{
        if(isFull()){
            throw new Exception("Overflow");
        }else{
            top++;
            stack[top] = data;
        }
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Underflow");
        }else{
            top--;
            return stack[top + 1];
        }
    }

    public int get(int index){
        return stack[index];
    }

    public int getTop(){
        return top;
    }
}
