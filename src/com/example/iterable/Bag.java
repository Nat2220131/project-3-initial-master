package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;

public class Bag<T> implements Container<T>{
    private ArrayList<T> food = new ArrayList<>();
    private int size = 0;

    @Override
    public boolean isEmpty() {
        if (size == 0){
            return true;
        } else{
            return false;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(T item) {
    food.add(item);
    size++;
    }

    @Override
    public Iterator<T> iterator() {
        return food.listIterator();
    }
}
