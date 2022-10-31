import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> givenListt = new ArrayList<Integer>(List.of(1,2,3,4,5));
        AlgoClass test = new AlgoClass();
        System.out.println(givenListt);
        test.Insert(givenListt,10, 2);
        System.out.println(givenListt);

    }
}
