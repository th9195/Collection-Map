package com.th.collection.demo;


import java.util.ArrayDeque;
import java.util.Deque;

import static sun.plugin2.os.windows.OSVERSIONINFOA.size;

/**
 * Created by Administrator on 2018/9/11.
 */
public class Stack {

    private Deque elems = new ArrayDeque<Object>();

    private int capacity ;

    public Stack() {
    }

    public Stack(int capacity) {
        this.capacity = capacity;
    }


    public boolean  push(Object elem){

        if(isFull()){
            System.out.println("The Statck is null!");
            return  false;
        }
        return elems.offerLast(elem);
    }



    public boolean isFull() {

        int size = elems.size() + 1;

        return size > capacity;
    }


    public Object pop(){
        return elems.pollLast();
    }

    public Object peek(){
        return elems.peekLast();
    }

    public int size(){

        return elems.size();
    }

}
