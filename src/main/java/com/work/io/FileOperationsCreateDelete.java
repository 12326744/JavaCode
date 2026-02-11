package com.work.io;

import java.io.File;
import java.io.IOException;

public class FileOperationsCreateDelete {
    public static void main(String... args) {
        File path = new File(FilePaths.SAMPLE_FOLDER_ABSOLUTE_PATH + "\\sample2.txt");

        if(!path.exists()){
            System.out.println("Path doesn't exist so creating it");
            try{
                boolean createStatus = path.createNewFile();
                System.out.println(path.getAbsolutePath());
                System.out.println("New file/folder Created ? "+ createStatus);
            }catch (IOException e){
                throw new RuntimeException(e);
            }
        }else {
            System.out.println("Path exist so deleting it");
            boolean deleteStatus=path.delete();
            System.out.println("New file/folder Created ? "+ deleteStatus);
        }

    }
}
