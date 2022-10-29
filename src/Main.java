public class Main {
    public static void main(String[] args) {
        AlgoClass test = new AlgoClass();

        MyQueue q = new MyQueue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(1);
        q.enqueue(5);

//        System.out.println(test.Invert(q).printQueue());
//        System.out.println(test.Find(q, 1));
        System.out.println(test.Maximum(q));
    }
}
