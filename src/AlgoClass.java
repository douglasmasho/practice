import java.util.Stack;

public class AlgoClass {
    public AlgoClass(){
    }

    public double GetAverage(Stack<Integer> s){
        //create a temp stack
        Stack<Integer> tempStack = new Stack<Integer>();
        // popping every element and pushing into a temp stack until s is empty
        //but while you do that, store in a variable to add to the total
        int total = 0;

        while(!s.isEmpty()){
            int last = s.pop();
            total += last;
            tempStack.push(last);
        }

        //before returning total, put the elements in the temp stack back into s, the same way as before
        while(!tempStack.isEmpty()){
            s.push(tempStack.pop());
        }

        return total/s.size();
    }
}
