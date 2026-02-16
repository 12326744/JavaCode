package com.work.io;

import java.io.*;

public class Serialization {
    public static void main(String... args){
        Student st1=new Student(23,"Krishna");
        System.out.println(st1);

        File path=new File(FilePaths.SAMPLE_FILE_ABSOLUTE_PATH);
        if(path.isFile()){
            try(FileOutputStream fos=new FileOutputStream(path);
                ObjectOutputStream oos=new ObjectOutputStream(fos);){
                oos.writeObject(st1);

            }catch (IOException e){
                throw new RuntimeException(e);
            }
        }else{
            System.out.println("Invalid Path");
        }
    }
}

class Student implements Serializable {
    transient int age;
    String name;

    private static final long serialVersionUid = 2L; // it should remain same while serialization and deserialization

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

//serial version uid
//App cid in a file
//photo copy
