package com.github.kaczors.gof.behavioral.iterator;

import java.util.Iterator;
import java.util.List;

public class ListIterator<E> implements Iterator<E> {

    private final List<E> list;

    private int currentIndex = 0;

    ListIterator(List<E> list){
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < list.size();
    }

    @Override
    public E next() {
        return list.get(currentIndex++);
    }
}
