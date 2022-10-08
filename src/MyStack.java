import java.util.ArrayList;

public class MyStack<T> {
    private ArrayList<T> stack;
    private int top;

    public MyStack(int size){
        stack = new ArrayList<T>();
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void push(T data) throws Exception{
            top++;
            stack.add(data);
    }

    public T pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Underflow");
        }else{
            T lastElement = stack.get(top);;
            stack.remove(top);
            top--;
            return lastElement;
        }
    }

    public T get(int index){
        return stack.get(index);
    }

    public int getTop(){
        return top;
    }

    public T peek(){
        return stack.get(top);
    }
}
