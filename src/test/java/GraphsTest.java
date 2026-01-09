import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Hashtable;

import static org.junit.jupiter.api.Assertions.*;

class GraphsTest {

    @Test
    void breadthFirstSearch() {
        String [] friend1 = {"alice", "bob", "claire"};
        String [] friend2 = {"peggy"};
        String [] friend3 = {"anuj", "peggy"};
        String [] friend4 = {"thom", "jonny"};
        String [] friend5 = {};
        String [] friend6 = {};
        String [] friend7 = {};
        String [] friend8 = {};

        Hashtable<String, String []> friendships = new Hashtable<>();
        friendships.put("josh", friend1);
        friendships.put("alice", friend2);
        friendships.put("bob", friend3);
        friendships.put("claire", friend4);
        friendships.put("anuj", friend5);
        friendships.put("peggy", friend6);
        friendships.put("thom", friend7);
        friendships.put("jonny", friend8);

        //System.out.println(Graphs.breadthFirstSearch("josh", friendships));

        //assertEquals("alice", "thom"); -> i suddenly realise why my test was passing when it wasn't supposed to.
        //i didn't put in the right arguments in the assertEquals

        assertEquals(true, Graphs.breadthFirstSearch("josh", friendships));


    }

    //TODO remove comments below from the test.
    //@Test
    void findTheLowestNode() {
        float inf = Float.POSITIVE_INFINITY;
        System.out.println(inf);
        int infinity = (int) inf;

        Hashtable<String, Integer> costs = new Hashtable<>();
        costs.put("A", 6);
        costs.put("B", 2);
        costs.put("F", infinity);

        Hashtable<String, Integer> expected = new Hashtable<>();
        expected.put("B", 2);

        ArrayList<String> processed = new ArrayList<>();

        assertEquals("B", Graphs.findTheLowestNode(costs, processed));

    }

    ///TODO remove comments from the test beneath this line of code.
    //@Test
    void findTheLowestNode1() {
        float inf = Float.POSITIVE_INFINITY;
        System.out.println(inf);
        int infinity = (int) inf;

        Hashtable<String, Integer> costs = new Hashtable<>();
        costs.put("A", 5);
        costs.put("B", 3);
        costs.put("F", infinity);

        Hashtable<String, Integer> expected = new Hashtable<>();
        expected.put("B", 3);

        ArrayList<String> processed = new ArrayList<>();

        assertEquals(expected, Graphs.findTheLowestNode(costs, processed));

    }

    @Test
    void dijkstrasAlgorithm() {

        //the fucking infinity value
        double inf1 = Double.POSITIVE_INFINITY;
        int infinity = (int) inf1;

        //this is the graph.
        Hashtable<String, Hashtable<String, Integer>> graph = new Hashtable<>();

        Hashtable<String, Integer> S = new Hashtable<>();
        S.put("A", 6);
        S.put("B", 2);

        Hashtable<String, Integer> A = new Hashtable<>();
        A.put("F", 1);

        Hashtable<String, Integer> B = new Hashtable<>();
        B.put("A", 3);
        B.put("F", 5);

        Hashtable<String, Integer> F = new Hashtable<>(0);

        graph.put("S", S);
        graph.put("A", A);
        graph.put("B", B);
        graph.put("F", F);

        //this is the costs
        Hashtable<String, Integer> costs = new Hashtable<>();
        costs.put("A", 6);
        costs.put("B", 2);
        costs.put("F", infinity);

        //this is the parent
        Hashtable<String, String> parents = new Hashtable<>();
        parents.put("A",  "S");
        parents.put("B", "S");
        //since you can't add a null to a hashmap, it makes sense to just us an empty quotes like this ""
        parents.put("F", "");

        assertEquals(6, Graphs.dijkstrasAlgorithm(graph, costs, parents));
    }

    @Test
    void dijkstrasAlgorithm0() {

        //the fucking infinity value
        double inf1 = Double.POSITIVE_INFINITY;
        int infinity = (int) inf1;

        //this is the graph.
        Hashtable<String, Hashtable<String, Integer>> graph = new Hashtable<>();

        //TODO->RECONSTRUCT THE GRAPH DIAGRAM FROM THE HASHTABLES BELOW
        Hashtable<String, Integer> S = new Hashtable<>();
        S.put("A", 5);
        S.put("B", 2);

        Hashtable<String, Integer> A = new Hashtable<>();
        A.put("C", 4);
        A.put("D", 2);

        Hashtable<String, Integer> B = new Hashtable<>();
        B.put("A", 8);
        B.put("D", 7);

        Hashtable<String, Integer> C = new Hashtable<>();
        C.put("D", 6);
        C.put("F", 3);

        Hashtable<String, Integer> D = new Hashtable<>();
        D.put("F", 1);

        Hashtable<String, Integer> F = new Hashtable<>(0);

        graph.put("S", S);
        graph.put("A", A);
        graph.put("B", B);
        graph.put("C", C);
        graph.put("D", D);
        graph.put("F", F);

        //this is the costs
        Hashtable<String, Integer> costs = new Hashtable<>();
        costs.put("A", 5);
        costs.put("B", 2);
        costs.put("C", infinity);
        costs.put("D", infinity);
        costs.put("F", infinity);

        //this is the parent
        Hashtable<String, String> parents = new Hashtable<>();
        parents.put("A",  "S");
        parents.put("B", "S");
        parents.put("C", "");
        parents.put("D", "");
        //since you can't add a null to a hashmap, it makes sense to just us an empty quotes like this ""
        parents.put("F", "");

        assertEquals(8, Graphs.dijkstrasAlgorithm(graph, costs, parents));
    }

    @Test
    void dijkstrasAlgorithm1() {

        //the fucking infinity value
        double inf1 = Double.POSITIVE_INFINITY;
        int infinity = (int) inf1;

        //this is the graph.
        Hashtable<String, Hashtable<String, Integer>> graph = new Hashtable<>();

        //TODO->RECONSTRUCT THE GRAPH DIAGRAM FROM THE HASHTABLES BELOW
        Hashtable<String, Integer> S = new Hashtable<>();
        S.put("A", 10);

        Hashtable<String, Integer> A = new Hashtable<>();
        A.put("B", 20);

        Hashtable<String, Integer> B = new Hashtable<>();
        B.put("C", 1);
        B.put("F", 30);

        Hashtable<String, Integer> C = new Hashtable<>();
        C.put("A", 1);

        Hashtable<String, Integer> F = new Hashtable<>(0);

        graph.put("S", S);
        graph.put("A", A);
        graph.put("B", B);
        graph.put("C", C);
        graph.put("F", F);

        //this is the costs
        Hashtable<String, Integer> costs = new Hashtable<>();
        costs.put("A", 10);
        costs.put("B", infinity);
        costs.put("C", infinity);
        costs.put("F", infinity);

        //this is the parent
        Hashtable<String, String> parents = new Hashtable<>();
        parents.put("A",  "S");
        parents.put("B", "");
        parents.put("C", "");
        //since you can't add a null to a hashmap, it makes sense to just us an empty quotes like this ""
        parents.put("F", "");

        assertEquals(60, Graphs.dijkstrasAlgorithm(graph, costs, parents));
    }

    //TODO run another test to make sure the algorithm
}