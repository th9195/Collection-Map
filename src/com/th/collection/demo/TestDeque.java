package com.th.collection.demo;

import com.th.collection.pojo.Student;

/**
 * Created by Administrator on 2018/9/11.
 */
public class TestDeque {

    public static void main(String[] args) {

        Stack stack = new Stack(5);
        for (int i = 0; i < 5; i++) {
            stack.push(new Student("Tom1" + i ,20 + i));
        }

        while ( stack.peek() != null ){
            Student stu = (Student) stack.pop();
            System.out.println(stu);
        }

    }


}
