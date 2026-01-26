package GreedyAlgorithms;

import java.util.*;

public class GreedyAlgorithms {

    //i want to try and write the union, intersection and difference methods for sets.
    //you can do this in python but not java, unfortunately.

    public static Set<String> intersection(Set<String> setA, Set<String> setB){
        Set<String> unionSet = new HashSet<>();

        List<String> listA = new ArrayList<>(setA);
        List<String> listB = new ArrayList<>(setB);

        for (int i=0;i< listA.size();i++){
            for (int j=0;j< listB.size();j++){
                if (listA.get(i).equals(listB.get(j))){
                    unionSet.add(listA.get(i));
                }
            }
        }

        return unionSet;
    }


    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(2);
        set.add(3);
        set.add(4);

        //if there are copies of an element in a set, only one is printed.

        System.out.println(set);

        Set<String> states = new HashSet<>();
        Set<String> states1 = new HashSet<>();
        Set<String> states2 = new HashSet<>();
        Set<String> states3 = new HashSet<>();
        states.add("lagos");
        states.add("Ogun");
        states.add("Osun");
        states.add("Delta");
        states.add("Ekiti");
        states.add("Abuja");
        states.add("Kano");
        states.add("Edo");

        String [] arr = {"lagos", "ogun", "osun", "delta", "ekiti", "abuja", "kano", "edo", "ekiti", "delta", "abuja"};

       for(int i=0;i<3;i++){
           states1.add(arr[i]);
       }
       for(int i=3;i<6;i++){
           states2.add(arr[i]);
       }
       for(int i=6;i<9;i++){
           states3.add(arr[i]);
       }

        Set<String> shittyStates = new HashSet<>(Arrays.asList(arr));

       System.out.println(shittyStates);
       System.out.println(states);
       System.out.println(states1);
       System.out.println(states2);
       System.out.println(states3);

        HashMap<String, Set<String>> stations = new HashMap<>();


        stations.put("Beat FM", states1);
        stations.put("Nigeria Info", states2);
        stations.put("Cool FM", states3);

        System.out.println(stations.get("Cool FM"));

        Set<String> finalStations = new HashSet<>();
        String bestStation;
        Set<String>  statesCovered = new HashSet<>();

        Set<String> a = new HashSet<>();
        Set<String> b = new HashSet<>();
        Set<String> c = new HashSet<>();

        a.add("avocado");
        a.add("tomato");
        a.add("banana");

        List<String> list = new ArrayList<>(a);
        System.out.println(list.get(0));

        b.add("beets");
        b.add("carrots");
        b.add("tomato");

        System.out.println(GreedyAlgorithms.intersection(a, b));





    }
}
