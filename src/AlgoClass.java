import java.util.Stack;

public class AlgoClass {
    public AlgoClass(){
    }
    public boolean DoesStackContain(Stack<Integer> s,int x){
        //create a temp stack
        Stack<Integer> tempStack = new Stack<Integer>();
        //since s must be in the original state, you cannot return true immediately if you find x,
        //so create a variable to show that x is found/not. you then return that variable once you are sure
        //s is back in its original state
        boolean found = false;

        //start popping every element from s and pushing into tempstack,
        // while you pop, check if last is equal to x.
        while(!s.isEmpty()){
            int last = s.pop();
            if(last == x){
                found = true;
            }
            //push into tempStack
            tempStack.push(last);
        }

        //put s into its original state by popping from temp and pushing into s
        while(!tempStack.isEmpty()){
            s.push(tempStack.pop());
        }

        return found;
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
