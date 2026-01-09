import javax.sql.rowset.serial.SerialStruct;
import java.util.*;

public class Graphs {

    public static boolean breadthFirstSearch(String name, Hashtable<String, String[]> hashtable){
        ArrayDeque<String> searchQueue = new ArrayDeque<>();

        //this will get all the strings stored in that array and then add it to the above queue.
        searchQueue.addAll(Arrays.asList(hashtable.get(name)));

        //keeping track of names that have been searched.
        ArrayList<String> searchedNames = new ArrayList<>();

        //this is where the real work of the breadth-first search begins
        while (!(searchQueue.isEmpty())){
            String person = searchQueue.pollFirst();
            if (!(searchedNames.contains(person))){

                //assuming that in this universe, someone's name ending with m means they sell mangoes.
                if (person.endsWith("m")){
                    System.out.println(person + " ends with m so therefore they are a mango seller.");
                    return true;
                } else {
                    searchQueue.addAll(Arrays.asList(hashtable.get(person)));
                    searchedNames.add(person);

                }
            }
        }

        return false;
    }

    //Dijkstra's algorithm implementation
    public static int dijkstrasAlgorithm(Hashtable<String, Hashtable<String, Integer>> graphs, Hashtable<String, Integer> costs, Hashtable<String, String> parents) {
        ArrayList<String> processed = new ArrayList<>();

        String node = Graphs.findTheLowestNode(costs, processed); //A
        int newCost = 0;
        int cost = 0;

        while (node != null) {
            cost = costs.get(node); //COST=5
            System.out.println(cost);
            Hashtable<String, Integer> neighbours = graphs.get(node); //(C->4, D->2)
            System.out.println(neighbours);

            for (String n : neighbours.keySet()) {
                newCost = cost + neighbours.get(n); //(10=2+8)
                System.out.println("the value of the new cost is "+newCost);
                System.out.println("the value of the key, "+n+" is "+costs.get(n));
                if (costs.get(n) > newCost) { //5>10

                    System.out.println("node cost before being replaced is "+costs.get(n));
                    costs.replace(n, newCost);
                    System.out.println("node cost after being replaced is "+costs.get(n));

                    parents.replace(n, node);
                    System.out.println("the parent for the node "+n+" is " +parents.get(n));
                }
            }
            processed.add(node);
            System.out.println(processed);
            node = Graphs.findTheLowestNode(costs, processed);
            System.out.println("the next node in the graph that hasn't been processed is "+node);
        }

        //TODO refine algorithm or create a new one that outputs the nodes in the fastest path rather the weights/time itself.
        return costs.get("F");
    }

    //creating a method for finding the lowest cost and its node in a hashmap
    public static String findTheLowestNode(Hashtable<String, Integer> costs, ArrayList<String> processed){
        //i am using the enum representing infinity from the Float class here before i then cast it to an integer.
        float infinity = Float.POSITIVE_INFINITY;

        int lowestCost = (int) infinity;
        //you can't quiet get int version of infinity after casting from Float. the value you get is 2billion.
        //i don't imagine i will be working with weights that large. i'll leave this like this until i find a way around this.

        String lowestCostNode = null;
        //Hashtable<String, Integer> hashTableToBeReturned = new Hashtable<>();

        for (String n: costs.keySet()){
            int cost = costs.get(n);
            //TODO clean this print statement when i add the processed array.
            if ((cost < lowestCost)  && !(processed.contains(n))){
                lowestCost = cost;
                lowestCostNode = n;
            }
            //processed.add(n); -> i think this is what i don't need
        }
        //hashTableToBeReturned.put(lowestCostNode, lowestCost);

        return lowestCostNode;
    }

    public static void main(String[] args) {

        //Dijkstra's algorithm implementation.
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


        System.out.println("......................");

        for (String n: S.keySet()){
            System.out.println(S.get(n));
        }
        System.out.println(S.keySet());

        double inf1 = Double.POSITIVE_INFINITY;
        int infinity = (int) inf1;

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


        //TODO i don't know why the last element to be added to the hashtable when the whole array gets printed appears not at the end.

        System.out.println("......................");

        ArrayList<String> processed = new ArrayList<>();

        String node = Graphs.findTheLowestNode(costs, processed);
        List<Integer> neighbours = Arrays.asList(S.get(node));
        String [] neighbour = S.keySet().toArray(new String[0]);
        System.out.println(neighbour+"..........");


        //infinity in java
        float inf = Float.POSITIVE_INFINITY;



        int lowestCost = infinity;
        String lowestCostNode = null;


        System.out.println("the lowest cost is " + lowestCost + " its node is " + lowestCostNode);

        System.out.println(lowestCostNode);

        String x = null;
        System.out.println(x);

        Hashtable<String, Integer> exp = new Hashtable<>();
        exp.put("s", 2);
        exp.put("b", 4);
        exp.put("a", 5);

        System.out.println(exp.get("s"));
        exp.replace("s", 3);
        System.out.println(exp.get("s"));







    }
}
