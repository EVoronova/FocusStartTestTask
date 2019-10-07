package com.FocusStart.task;

import java.util.List;

public class TriangleUtilities {
    public static String searchForTheLargestTriangle(List<String> list){
        double triangleArea = 0;
        StringBuffer triangleCoordinates = new StringBuffer("");

        for(String s : list){
            String[] tokens = s.split(" ");
            if(tokens.length==6){
                try {
                    int x1 = Integer.valueOf(tokens[0]);
                    int y1 = Integer.valueOf(tokens[1]);
                    int x2 = Integer.valueOf(tokens[2]);
                    int y2 = Integer.valueOf(tokens[3]);
                    int x3 = Integer.valueOf(tokens[4]);
                    int y3 = Integer.valueOf(tokens[5]);

                    double a = calculateTriangleSideLength(x1,y1,x2,y2);
                    double b = calculateTriangleSideLength(x2,y2,x3,y3);
                    double c = calculateTriangleSideLength(x1,y1,x3,y3);

                    double currentTriangleArea = calculateTriangleArea(a, b, c);

                    if(currentTriangleArea > triangleArea){
                        triangleArea = currentTriangleArea;
                        if(triangleCoordinates.length()>0){
                            triangleCoordinates.delete(0,triangleCoordinates.length());
                        }
                        triangleCoordinates.append(s);
                    }

                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }

        return triangleCoordinates.toString();
    }

    public static double calculateTriangleSideLength(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
    }

    public static double calculateTriangleArea(double a, double b, double c){
        double p = (a + b + c) * 0.5;
        double triangleArea = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return triangleArea;
    }
}
