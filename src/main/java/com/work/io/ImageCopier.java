package com.work.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ImageCopier {

    public static void main(String[] args) {

        String sourcePath = "C:\\Users\\Krishna Sah\\OneDrive\\Desktop\\JavaPep\\src\\main\\resources\\sk.jpeg";
        String destinationPath = "C:\\Users\\Krishna Sah\\OneDrive\\Desktop\\JavaPep\\src\\main\\resources\\kk.jpeg";

        try (InputStream in = new FileInputStream(sourcePath);
             OutputStream out = new FileOutputStream(destinationPath)) {

            byte[] buffer = new byte[1024];
            int read;

            while ((read = in.read(buffer)) != -1) {
                out.write(buffer, 0, read);
            }

            System.out.println("Image Copied Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//Always put all the files and image in the resources...
