import java.util.Scanner;

public class GraphExample {
    //make the main method throw an exception
    public static void main(String[] args) throws Exception{
//        //when in exam, initialize a graph using the interface
//        //IGraph<type> graph = new UndirectedSimpleGraph<>();
//        UndirectedSimpleGraph<String> graph = new UndirectedSimpleGraph<String>(100);
//
//        graph.addNode("ongwediva");
//        graph.addNode("oshakati");
//        graph.addNode("ondangwa");
//        graph.addNode("omuthiya");
//        graph.addNode("eenhana");
//
//        //the method graph.addEge throws an exception so, use in try catch. But
//
//            graph.addEdge("ongwediva", "ondangwa");
//            graph.addEdge("ongwediva", "oshakati");
//            graph.addEdge("omuthiya", "ondangwa");
//            graph.addEdge("omuthiya", "eenhana");
//
//        Scanner s = new Scanner(System.in);
//
//        System.out.println("Enter two towns to see if they are connected by a direct link");
//
//        System.out.println("Please enter town 1");
//        String town1 = s.nextLine().toLowerCase();
//        System.out.println("Please enter town 2");
//        String town2 = s.nextLine().toLowerCase();
//        int num = parse
//        if(graph.areAdjacents(town1, town2)){
//            System.out.println(town1 + " and " + town2 + " are directly linked");
//        }else{
//            System.out.println(town1 + " and " + town2 + " are notb directly linked");
//        }


        UndirectedSimpleGraph<String> network = new UndirectedSimpleGraph<String>(100);

        network.addNode("douglas");
        network.addNode("tangi");
        network.addNode("abigail");
        network.addNode("nigel");

        network.addEdge("douglas", "tangi");
        network.addEdge("tangi", "abigail");
        network.addEdge("abigail", "nigel");
        network.addEdge("nigel", "douglas");
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter 2 people to see if they are friends");
        System.out.println("Please enter person 1");
        String person1 = s.nextLine().toLowerCase();
        System.out.println("Please enter person 2");
        String person2 = s.nextLine().toLowerCase();

        if(network.areAdjacents(person1, person2)){
            System.out.println(person1 + " and " + person2 + " are friends");
        }else{
            System.out.println(person1 + " and " + person2 + " are not friends");
        }



    }
}
