import java.util.ArrayList;
import java.util.List;

public class AlgoClass {
    List<Integer> givenList = new ArrayList<Integer>(List.of(1,2,3,4,5));

    public AlgoClass(){

    }

    public List Copy(int start, int end) throws Exception{
        //the returned list must start with the elementAt get(start-1) and end with elementAt get(end-1)
        //but since we need the elements in between, it will be better to use a loop

        if(end > givenList.size() || start < 1){
            throw new Exception("The start or end is beyond the bounds of the list");
        }

        List<Integer> result = new ArrayList<Integer>();
        for(int i = start-1; i < end; i++){
            result.add(givenList.get(i));
        }
        return result;
    }


    public int Find(int x) throws Exception{
        //easiest way
        //return givenList.indexOf(x);

        //recommended way if you want marks 💀
        for(int i = 0; i < givenList.size(); i++){
            if(givenList.get(i) == x){
                return i;
            }
        }

        throw new Exception("element not found");
    }


    public double Average(){
        double sum = 0;
        for(int i: givenList){
            sum += i;
        }

        return sum/givenList.size();
    }
}
