package com.th.collection.demo;

import com.th.collection.pojo.Student;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Administrator on 2018/9/11.
 */
public class TestHashSet {

    public static void main(String[] args) {

        //testStringSet();

        Student tom1 = new Student("Tom1", 21);
        Student tom2 = new Student("Tom2", 22);
        Student tom3 = new Student("Tom1", 21);


        HashSet<Student> students = new HashSet<>();

        students.add(tom1);
        students.add(tom2);
        students.add(tom3);


        Iterator<Student> iterator = students.iterator();

        while ( iterator.hasNext() ){
            Student stu = iterator.next();
            System.out.println(stu);

        }

    }


    private static void testStringSet() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一段英文:");

        String str = scanner.nextLine();

        String[] arrStr = str.split(" ");

        List<String> strList = Arrays.asList(arrStr);

        System.out.println("List is : ");

        Iterator<String> iterator = strList.iterator();

        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.print(s + "\t");
        }

        System.out.println();


        System.out.println("Set is : ");
        Set set = new HashSet<String>(strList);

        Iterator iterator1 = set.iterator();
        while ( iterator1.hasNext() ){
            String  next = (String) iterator1.next();
            System.out.print( next + "\t");
        }

        System.out.println();
    }


}









