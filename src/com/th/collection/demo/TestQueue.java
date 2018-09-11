package com.th.collection.demo;

import com.th.collection.pojo.Student;

import java.util.LinkedList;


/**
 * Created by Administrator on 2018/9/11.
 */
public class TestQueue {

    public static void main(String[] args) {

        LinkedList<Student> students = new LinkedList<Student>();


        offerStudentTo(students);

        process(students);
        System.out.println("取出来之后就没有了：");
        process(students);

    }

    private static void process(LinkedList<Student> students) {
        while ( students.peek() != null ){
            Student stu = students.poll();
            System.out.println(stu);

        }
    }

    private static void offerStudentTo(LinkedList<Student> students) {
        for(int i = 0 ; i < 5 ; i++){
            Student student = new Student("Tom" + i , 20 + i);
            students.offer(student);
        }
    }


}
