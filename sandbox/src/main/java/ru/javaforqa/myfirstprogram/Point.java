package ru.javaforqa.myfirstprogram;


public class Point {
    public double AxisX1;
    public double AxisY1;
    public double AxisX2;
    public double AxisY2;
    public Point (double X1, double Y1, double X2, double Y2) {
        this.AxisX1 = X1;
        this.AxisY1 = Y1;
        this.AxisX2 = X2;
        this.AxisY2 = Y2;
    }
    public double getDistance(){
        return Math.sqrt(Math.pow(Double.parseDouble(String.valueOf(this.AxisX1-this.AxisX2)),2)+(Math.pow(Double.parseDouble(String.valueOf(this.AxisY2-this.AxisY1)),2)));
    }


}
