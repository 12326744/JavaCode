package com.work.test3;

import java.io.*;

public class DigitalDiary {

    public void writeNote(String fileName, String note) {

        try {
            File file = new File(fileName);

            if (!file.exists()) {
                file.createNewFile();
            }


            FileWriter fw = new FileWriter(fileName, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(note);
            bw.newLine();
            bw.close();

        } catch (IOException e) {
            System.out.println("Error: Could not save note.");
        }
    }

    public void createBackup(String sourceFile, String backupFile) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(backupFile));

            String line;

            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("Backup created successfully!");

        } catch (IOException e) {
            System.out.println("Error: Could not create backup.");
        }
    }


    public static void main(String[] args) {

        DigitalDiary diary = new DigitalDiary();

        String diaryFile = "my_diary.txt";
        String backupFile = "diary_backup.txt";

        diary.writeNote(diaryFile, "Today I started learning Java File I/O.");
        diary.writeNote(diaryFile, "It was a bit confusing, but I'm getting the hang of it.");
        diary.writeNote(diaryFile, "I successfully created and copied a file!");

        diary.createBackup(diaryFile, backupFile);
    }
}