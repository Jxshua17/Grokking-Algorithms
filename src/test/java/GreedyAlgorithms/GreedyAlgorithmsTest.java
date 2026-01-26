package GreedyAlgorithms;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GreedyAlgorithmsTest {

    @Test
    void union() {
        Set<String> a = new HashSet<>();
        Set<String> b = new HashSet<>();
        Set<String> c = new HashSet<>();

        a.add("a");
        a.add("b");
        a.add("c");

        b.add("d");
        b.add("e");
        b.add("f");
        b.add("c");

        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");
        c.add("e");
        c.add("f");

        assertEquals(c, GreedyAlgorithms.union(a, b));


    }
}