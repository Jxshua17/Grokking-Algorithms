import java.util.*;

public class Graphs {

    public static boolean breadthFirstSearch(String name, Hashtable<String, String[]> hashtable){
        ArrayDeque<String> searchQueue = new ArrayDeque<>();

        //this will get all the strings stored in that array and then add it to the above queue.
        for (String x: hashtable.get(name)){
            searchQueue.add(x);
        }

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
                    for (String x: hashtable.get(person)){
                        searchQueue.add(x);
                    }
                    searchedNames.add(person);

                }
            }
        }

        return false;
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

    }
}
