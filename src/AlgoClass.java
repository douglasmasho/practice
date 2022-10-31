import java.util.ArrayList;
import java.util.List;

public class AlgoClass {
    private List<Integer> givenListt = new ArrayList<Integer>(List.of(1,2,3,4,5));

    public boolean Insert(List<Integer> givenList,int x, int pos){
        //insert element by using set. However this will replace the element in that position. So copy the given list
        List<Integer> copy = new ArrayList<Integer>(givenList);
        //replace old x with new x in pos by using set
        givenList.set(pos, x);
        //now we need to put back the old x. But basically shifting all the elements to the right of the new x, one space to the right.

        //loop through the copy list from old x(pos) and then stop at the second last element. the last element in Copy will be added later.

        for(int i = pos; i < copy.size()-1; i++){
            givenList.set(i+1, copy.get(i));
        }

        //add the last element from copy to the given list
        givenList.add(copy.get(copy.size()-1));
        return true;
    }



}
