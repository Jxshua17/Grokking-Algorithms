package GreedyAlgorithms;

import java.util.*;

public class GreedyAlgorithms {

    //i want to try and write the union, intersection and difference methods for sets.
    //you can do this in python but not java, unfortunately.

    //the intersection method.
    public static Set<String> intersection(Set<String> setA, Set<String> setB){
        Set<String> intersectionSet = new HashSet<>();

        List<String> listA = new ArrayList<>(setA);
        List<String> listB = new ArrayList<>(setB);

        for (int i=0;i< listA.size();i++){
            for (int j=0;j< listB.size();j++){
                if (listA.get(i).equals(listB.get(j))){
                    intersectionSet.add(listA.get(i));
                }
            }
        }

        return intersectionSet;
    }

    //overloaded the intersection method.
    public static Set<Integer> intersection2(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> intersectionSet = new HashSet<>();

        List<Integer> listA = new ArrayList<>(set1);
        List<Integer> listB = new ArrayList<>(set2);

        for (int i=0;i< listA.size();i++){
            for (int j=0;j< listB.size();j++){
                if (listA.get(i).equals(listB.get(j))){
                    intersectionSet.add(listA.get(i));
                }
            }
        }

        return intersectionSet;
    }

    //the union method
    public static Set<String> union(Set<String> setA, Set<String> setB){
        Set<String> unionSet = new HashSet<>();

        unionSet.addAll(setA);
        unionSet.addAll(setB);

        return unionSet;
    }

    //the difference method: so basically, this should be the opposite of the intersection method
    public static Set<String> difference(Set<String> setA, Set<String> setB){
        //so the difference set would be a union of both sets and then in loops, just remove elements that match.
        Set<String> differenceSet = new HashSet<>(union(setA, setB));


        List<String> listA = new ArrayList<>(setA);
        List<String> listB = new ArrayList<>(setB);

        for (int i=0;i< listA.size();i++){
            for (int j=0;j< listB.size();j++){
                if (listA.get(i).equals(listB.get(j))){
                    differenceSet.remove(listA.get(i));
                }
            }
        }

        return differenceSet;
    }


    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(2);
        set.add(3);
        set.add(4);

        //if there are copies of an element in a set, only one is printed.

        System.out.println(set);

        System.out.println("states covered i believe");
        String [] arr = {"lagos", "ogun", "osun", "delta", "ekiti", "abuja", "kano", "edo", "ekiti", "delta", "abuja"};

       Set<String> shittyStates = new HashSet<>(Arrays.asList(arr));

       System.out.println(shittyStates);





       Hashtable<String, Integer> studs = new Hashtable<>();
       studs.put("josh", 23);
       studs.put("ruth", 34);
       studs.put("roland", 45);
       studs.put("rocky", 56);

       for (Map.Entry<String, Integer> students: studs.entrySet()){
           System.out.println("the student with the name " + students.getKey() + " is " + students.getValue() + " years old.");
       }
       System.out.println("....................");

        Set<String> statesNeeded = new HashSet<>();

        statesNeeded.add("Lagos");
        statesNeeded.add("Ogun");
        statesNeeded.add("Osun");
        statesNeeded.add("Delta");
        statesNeeded.add("Ekiti");
        statesNeeded.add("Abuja");
        statesNeeded.add("Kano");
        statesNeeded.add("Edo");

        Set<String> states1 = new HashSet<>();
        Set<String> states2 = new HashSet<>();
        Set<String> states3 = new HashSet<>();
        Set<String> states4 = new HashSet<>();
        Set<String> states5 = new HashSet<>();

        states1.add("Lagos");
        states1.add("Ogun");
        states1.add("Osun");

        states2.add("Lagos");
        states2.add("Delta");
        states2.add("Ekiti");

        states3.add("Delta");
        states3.add("Abuja");
        states3.add("Kano");

        states4.add("Ogun");
        states4.add("Osun");

        states5.add("Abuja");
        states5.add("Edo");

        //beatfm-lagos, ogun, osun
        //nigeria info-lagos, delta, ekiti
        //cool fm-delta, abuja, kano
        //raypower-ogun, osun
        //inspiration fm-abuja, edo

        HashMap<String, Set<String>> stations = new HashMap<>();
        stations.put("Beat FM", states1);
        stations.put("Nigeria Info", states2);
        stations.put("Cool FM", states3);
        stations.put("Raypower FM", states4);
        stations.put("Inspiration FM", states5);

        Set<String> finalStations = new HashSet<>();
        /*String bestStation = null;
        Set<String>  statesCovered = new HashSet<>();*/
        Set<String>  covered;

        //TODO->debug this bastard.

        while(!(statesNeeded.isEmpty())){
            String bestStation = null;
            Set<String>  statesCovered = new HashSet<>();
            for (Map.Entry<String, Set<String>> station:stations.entrySet()){
                //System.out.println("the station " + station.getKey() + " is covered in the following states " + station.getValue());

                covered = intersection(statesNeeded, station.getValue());
                System.out.println("the covered states are->" + covered);

                if (covered.size() > statesCovered.size()){
                    bestStation = station.getKey();
                    statesCovered = covered;
                }
            }

            List<String> tempArr = new ArrayList<>(statesCovered);

            //the challenge now is removing shit from the statesNeeded set.

            for (int i=0;i< tempArr.size();){
                System.out.println("have i been penetrated?");
                System.out.println("the states before any removal ->" + statesNeeded);
                statesNeeded.remove(tempArr.get(i));
                System.out.println("the states after any removal ->" + statesNeeded);
                i++;
            }
            finalStations.add(bestStation);
            System.out.println("is the loop exited?");

            System.out.println("the stations that cover the most distance are; " + finalStations);
            //the loop is exited so it is the while loop that is the issue. the set statesNeeded never empties.

            //i think i might have figured out the problem. i never increment the variable for the for loop.
            //the logic was ound, the sets being compared were just different because some of the states in one were camelcase while the other was all lowercase.
        }


        System.out.println("the stations that cover the most distance are; " + finalStations);






    }
}
