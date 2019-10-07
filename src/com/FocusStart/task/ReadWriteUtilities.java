package com.FocusStart.task;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteUtilities {
    public static List<String> readFile(String pathName){
        List<String> list= new ArrayList<String>();
        try {
            File file = new File(pathName);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while((line = bufferedReader.readLine()) != null) {
                list.add(line);
//                System.out.println(line);
            }

            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void writeFile(String fileName, List<String> list){
        try {
            File file = new File(fileName);
            FileWriter fileReader = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileReader);

            for(String s : list) {
                bufferedWriter.write(s + "\n");
            }

            bufferedWriter.close();
            System.out.println("File '" + fileName + "' is written.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
