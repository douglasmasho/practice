public class Main {
    public static void main(String[] args) {
        AlgoClass test = new AlgoClass();
        try{
            System.out.println(test.Copy(2,4));
            System.out.println(test.Find(2));
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
