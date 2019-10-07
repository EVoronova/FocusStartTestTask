package com.FocusStart.task;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the file path name:");
        String pathName = scanner.nextLine();
        System.out.println("enter the file out name:");
        String fileName = scanner.nextLine();

        List<String> list = ReadWriteUtilities.readFile(pathName);

        ReadWriteUtilities.writeFile(fileName, Collections.singletonList(TriangleUtilities.searchForTheLargestTriangle(list)));
    }
}
