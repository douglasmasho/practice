import java.util.Queue;
import java.util.Stack;

public class AlgoClass {
    public AlgoClass(){

    }


    public MyQueue<Integer> BiggerThan(MyQueue<Integer> q, int x){
        //create a temporary queue
        MyQueue<Integer> tempQueue = new MyQueue<Integer>();
        //create the result queue
        MyQueue<Integer> resQueue = new MyQueue<Integer>();
        //loop through the queue q, dequeuing, enqueueing into all into the tempqueue, but only into the result queue if front > x
        while(!q.isEmpty()){
            var front = q.dequeue();
            tempQueue.enqueue(front);
            if(front > x){
                resQueue.enqueue(front);
            }
        }

        //populate the original list
        while(!tempQueue.isEmpty()){
            q.enqueue(tempQueue.dequeue());
        }
        System.out.println(q.printQueue());
        //return the result queue
        return resQueue;
    }

    public MyQueue Invert(MyQueue q){
        //create a stack to put all the element, uninverted, from q
        Stack tempStack = new Stack();
        //create a temp queue to store the elements of q
        MyQueue tempQueue = new MyQueue();
        //populate tempStack (uninverted stack)
        while(!q.isEmpty()){
            var front = q.dequeue();
            tempStack.push(front);
            tempQueue.enqueue(front);
        }

        //create the queue that will be returned
        MyQueue inverted = new MyQueue();

        //populate this queue
        while(!tempStack.isEmpty()){
            inverted.enqueue(tempStack.pop());
        }

        //populate original q
        while(!tempQueue.isEmpty()){
            q.enqueue(tempQueue.dequeue());
        }

        //do not print in class methods....just want to see if q is in original state
        //System.out.println(q.printQueue());

        //return the inverted queue
        return inverted;
    }

    public int Find(MyQueue<Integer> q, int x){
        //intialize a count
        int count = 0;

        //create a temporary queue
        MyQueue tempQueue = new MyQueue<Integer>();

        //start dequeueing
        while(!q.isEmpty()){
            var front = q.dequeue();

            if(front == x){
                count++;
            }
            //enqueue to temp queue
            tempQueue.enqueue(front);
        }

        while(!tempQueue.isEmpty()){
            q.enqueue((int)tempQueue.dequeue());
        }

//        do not print in class methods....just want to see if q is in original state
        //System.out.println(q.printQueue());
        return count;
    }


    public int Maximum(MyQueue<Integer> q){
        MyQueue<Integer> tempQueue = new MyQueue<Integer>();
        int max = (int)Double.NEGATIVE_INFINITY;

        while(!q.isEmpty()){
            var front = q.dequeue();
            if(front > max){
                max = front;
            }
        }

        while(!tempQueue.isEmpty()){
            q.enqueue(tempQueue.dequeue());
        }

        return max;
    }



}
