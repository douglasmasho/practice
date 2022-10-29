import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        AlgoClass test = new AlgoClass();
        Stack<Integer> newStack = new Stack<Integer>();

        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);
        newStack.push(5);
        System.out.println(newStack);
        System.out.println(test.GetAverage(newStack));
        System.out.println(test.DoesStackContain(newStack,3));
        System.out.println(newStack);
    }
}
