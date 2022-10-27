import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        AlgoClass test = new AlgoClass();
        System.out.println(test.Copy());
        try{
            System.out.println(test.Average(5));
        System.out.println(test.Count(4));
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }

    }

}
