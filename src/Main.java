import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        /*
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            numbers.add(i);
        }
        numbers.add(2);
        System.out.println(HowManyTimes(numbers, 2) );
        */
        //testing mystack
        /*

        MyStack<Integer> newMyStack = new MyStack<Integer>(5);
        try{
            newMyStack.push(2);
            newMyStack.push(5);
            newMyStack.push(9);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }


        try{
            System.out.println("first "+newMyStack.getTop());
            System.out.println(newMyStack.pop());
            System.out.println("now "+newMyStack.getTop());
            System.out.println(newMyStack.get(newMyStack.getTop()));
            System.out.println("Pushing.........");
            newMyStack.push(10);
            System.out.println(newMyStack.get(newMyStack.getTop()));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }


        for(int i = 0; i <= newMyStack.getTop(); i++){
            System.out.println(newMyStack.get(i));
        }

*/

         //built in implementation
        Stack<String> games = new Stack<String>();
        //adding to the stack
        games.add("Call of Duty");
        games.add("Guitar Hero");
        games.add("Super Monkey Ball");

        System.out.println(games.pop());
        System.out.println(games.pop());
        System.out.println(games.pop());
        System.out.println(games);




    }

    public static int HowManyTimes(List<Integer> l, int x){
        int counter = 0;
        for (int y: l) {
            if(y == x){
                counter++;
            }
        }
        return counter;
    }

};

