package ru.javaforqa.myfirstprogram;

public class Distance {

    static double AxisX1;
    static double AxisY1;
    static double AxisX2;
    static double AxisY2;

    public static double getDistance(double AxisX, double AxisY){
        return Math.sqrt(Math.pow(Double.parseDouble(String.valueOf(AxisX1-AxisX2)),2)+(Math.pow(Double.parseDouble(String.valueOf(AxisY2-AxisY1)),2)));
    }
}
