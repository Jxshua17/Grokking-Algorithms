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
    public static int dijkstrasAlgorithm(){

        return 0;
    }

    //creating a method for finding the lowest cost and its node in a hashmap
    public static Hashtable<String, Integer> findTheLowestNode(Hashtable<String, Integer> costs){
        //i am using the enum representing infinity from the Float class here before i then cast it to an integer.
        float infinity = Float.POSITIVE_INFINITY;

        int lowestCost = (int) infinity;
        //you can't quiet get int version of infinity after casting from Float. the value you get is 2billion.
        //i don't imagine i will be working with weights that large. i'll leave this like this until i find a way around this.

        String lowestCostNode = null;
        Hashtable<String, Integer> hashTableToBeReturned = new Hashtable<>();

        for (String n: costs.keySet()){
            int cost = costs.get(n);
            System.out.println("the value for the key, " + n + " is " + cost);
            if (cost < lowestCost){
                lowestCost = cost;
                lowestCostNode = n;
            }
        }
        hashTableToBeReturned.put(lowestCostNode, lowestCost);

        return hashTableToBeReturned;
    }

    public static void main(String[] args) {

        String [] classmates = {"bryan", "princess", "james"};
        Hashtable<String, String []> friends = new Hashtable<>();

        //friends.put("joshua", new String[]{"Sena", "Ope", "Tolu"});
        friends.put("ann", classmates);

        System.out.println(friends);

        ArrayDeque<String> classmate2 = new ArrayDeque<>();

        classmate2.addFirst("joshua");
        classmate2.add("efih");
        classmate2.add("oghenekome");
        classmate2.add("vhoke");

        System.out.println(classmate2.peekFirst());
        classmate2.removeFirst();
        System.out.println(classmate2.peekFirst());
        System.out.println(classmate2.peekLast());
        classmate2.removeLast();
        System.out.println(classmate2.peekLast());

        //the beginnings of an attempt at implementing breadth-first search in java using the example in the book
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

        ArrayDeque<String> searchQueue = new ArrayDeque<>();
        friendships.get("josh");
        for(String n: friendships.get("josh")){
            searchQueue.add(n);
        }

        System.out.println(searchQueue);

        System.out.println(".................a simple test..................");

        Graphs.breadthFirstSearch("josh", friendships);


        //Dijkstra's algorithm implementation.
        //just trying to see how to represent all the hashmaps for the cost, parents, graphs

        String [] neighbours1 = {"A", "B"};
        String [] neighbours2 = {"F"};
        String [] neighbours3 = {"A", "F"};
        String [] neighbours4 = {};

        Hashtable<String, String[]> graphite = new Hashtable<>();
        graphite.put("S", neighbours1);
        graphite.put("A", neighbours2);
        graphite.put("B", neighbours3);
        graphite.put("F", neighbours4);

        Hashtable<String, Integer> S = new Hashtable<>();
        S.put("A", 6);
        S.put("B", 2);

        Hashtable<String, Integer> A = new Hashtable<>();
        A.put("F", 1);

        Hashtable<String, Integer> B = new Hashtable<>();
        B.put("A", 3);
        B.put("F", 5);

        Hashtable<String, Integer> F = new Hashtable<>(0);

        System.out.println(S.keySet());
        System.out.println(B.get("A"));

        //infinity in java
        float inf = Float.POSITIVE_INFINITY;
        System.out.println(inf);
        int infinity = (int) inf;
        float infi = (float) infinity;
        double inf1 = Double.POSITIVE_INFINITY;
        int in1 = (int) inf1;
        System.out.println("the value after casting from double to int is" + in1);
        System.out.println("the value for infintiy according to the double class is " + inf1);
        System.out.println("after casting infinity, you get "+infinity);
        System.out.println("after casting infi and adding 1, you get "+(inf+1));
        System.out.println(3<inf);
        System.out.println("what do you get when you add 1 to the int version of infinity after casting?"  + (in1 + 1));

        Hashtable<String, Integer> costs = new Hashtable<>();
        costs.put("A", 6);
        costs.put("B", 2);
        costs.put("F", infinity);

        Hashtable<String, String[]> parents = new Hashtable<>();
        parents.put("A",  new String[]{"S"});
        parents.put("B", new String[]{"S"});
        parents.put("F", new String[]{});


        ArrayList<String> processed = new ArrayList<>();

        int lowestCost = infinity;
        String lowestCostNode = null;

        for (String n: costs.keySet()){
            int cost = costs.get(n);
            System.out.println("the value for the key, " + n + " is " + cost);
            if (cost < lowestCost){
                lowestCost = cost;
                lowestCostNode = n;
            }
        }

        System.out.println("the lowest cost is " + lowestCost + " its node is " + lowestCostNode);

        System.out.println(lowestCostNode);
        System.out.println(Arrays.toString(parents.get("F")));








    }
}
