import java.util.LinkedList;

public class MyQueue<Integer> {
    //create your own implementation of queue. It is very easy when using a linked list
    private LinkedList<Integer> info = new LinkedList<Integer>();

    public MyQueue(){

    }

    public LinkedList<Integer> printQueue(){
        return info;
    }

    //enqueue
    public void enqueue(Integer data){
        info.add(data);
    }

    //dequeue
    public Integer dequeue(){
      return  info.removeFirst();
    }

    //front
    public Integer front(){
       return info.getFirst();
    }


    //is empty
    public boolean isEmpty(){
        return info.isEmpty();
    }
}
