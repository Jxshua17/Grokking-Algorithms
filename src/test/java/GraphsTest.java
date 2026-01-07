import org.junit.jupiter.api.Test;

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

    @Test
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


        assertEquals(expected, Graphs.findTheLowestNode(costs));

    }

    @Test
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


        assertEquals(expected, Graphs.findTheLowestNode(costs));

    }
}