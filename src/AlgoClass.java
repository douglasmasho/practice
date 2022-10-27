import java.util.ArrayList;
import java.util.List;

public class AlgoClass {

    //assume this is the list you are given, you can change the list. What is important are the methods in this class
    private  List<Integer> listOfintegers = new ArrayList<Integer>(List.of(1,2,3,4,4,5));

    public AlgoClass(){

    }

    public  List Copy(){
        List oddNums = new ArrayList();
        for(int i:listOfintegers){
            if(i%2 != 0){
                oddNums.add(i);
            }
        }
        return oddNums;
    }

    public int Count(int x) throws Exception{
        int count = 0;
        for(int i: listOfintegers){
            if(i == x){
                count++;
            }
        }
        if(count == 0){
            throw new Exception("your number is not found");
        }else{
            return count;
        }
    }


    public double Average(int value) throws Exception{
        int sum = 0;
        int count = 0;
        for(int i: listOfintegers){
            if(i <= value){
                //add i to the sum
                sum+=i;
                //increase the count by one
                count++;
            }
        }

        if(count == 0){ //throw an exception if the count==0. Remmeber you cannot divide by 0;
            throw new Exception("There are no values less than or equal to your parameter");
        }else{
            return Math.round(((double)sum/count*100)/100);
        }
    }


}
