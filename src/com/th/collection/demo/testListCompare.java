package com.th.collection.demo;

import com.th.collection.pojo.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Administrator on 2018/9/11.
 */
public class testListCompare {


    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Student student = new Student("Tom" + i, 20 + i );
            studentList.add(student);
        }

        for (Student stu : studentList) {
            System.out.println(stu);
        }

        byComparable(studentList);

        //byComparator(studentList);

    }

    /**
     * 在实体类中实现Comparable接口并实现Comparato方法 再使用集合工具类Collections.sort 方法对集合进行排序
     * @param studentList
     */
    private static void byComparable(ArrayList<Student> studentList) {
        Collections.sort(studentList);

        for (Student stu : studentList) {
            System.out.println(stu);
        }
    }

    /**
     * 通过Comparator接口进行对比；
     * @param studentList
     */
    private static void byComparator(ArrayList<Student> studentList) {
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {

                if ( o1.getAge() == o2.getAge() ) {
                    return o1.getName() == null ? -1 :  - o1.getName().compareTo(o2.getName());
                }
                return  o2.getAge() - o1.getAge();
            }
        });

        for (Student stu : studentList) {
            System.out.println(stu);
        }
    }
}
