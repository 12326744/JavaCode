package com.work.io;

import java.io.*;
import java.util.Scanner;

public class ReadContentOfATextFile {
    public static void main(String... args) {
        File path = new File(FilePaths.SAMPLE_FILE_ABSOLUTE_PATH);
//        if(path.exists() && path.isFile()){
//            try {
//                Scanner scanner=new Scanner(path);
//
//                while (scanner.hasNext()){
//                    System.out.println(scanner.nextLine());
//                }
//            } catch (FileNotFoundException e) {
//                throw new RuntimeException(e);
//            }
//        }

//        if(path.exists() && path.isFile()){
//            try(FileInputStream fis=new FileInputStream(path);){
//                int num;
//                while ((num = fis.read())!=-1){
//                    System.out.println((char)num);
//                }
//            }catch (IOException e){
//                throw new RuntimeException(e)
//            }
//        }else{
//            System.out.println("File does not exist");
//        }
        String msg="Be Ready for the test this friday";
        if(path.exists() && path.isFile()){
            try(FileOutputStream fos=new FileOutputStream(path,true)){
                //append = true means it will start appending instead of replacing

//            try(FileOutputStream fos=new FileOutputStream(path);){
                fos.write(msg.getBytes());
            }catch (IOException e){
                throw new RuntimeException(e);
            }
        }else{
            System.out.println("File does not exist");
        }
    }
}
