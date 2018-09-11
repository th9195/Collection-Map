package com.th.collection.demo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Administrator on 2018/9/11.
 */
public class TestArrayList {


    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();


        arr.add("Tom1");
        arr.add("Tom2");
        arr.add("Tom3");
        arr.add("Tom4");


        Iterator<String> iterator = arr.iterator();
        while ( iterator.hasNext() ){

            String str = iterator.next();

            System.out.println(str);
        }

        arr.add(0,"Tom5");

        Iterator<String> iterator1 = arr.iterator();
        while ( iterator1.hasNext() ){
            String next = iterator1.next();
            System.out.println(next);

        }


    }




}
