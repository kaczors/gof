package com.github.kaczors.gof.behavioral.iterator;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

    @Test
    public void example(){
        List<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");

        Iterator<String> iterator = new ListIterator<>(strings);

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}