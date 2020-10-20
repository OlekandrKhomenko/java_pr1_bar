package com.sandboxProject;

    public class Point {
    public double x;
    double y;

    public Point (double x, double y)
    {
     this.x=x;
     this.y=y;
    }
        public double checkDistance(Point p1,Point p2){
            double dist = 0;
            dist =Math.sqrt((Math.pow(p1.x-p2.x,2)+ Math.pow(p1.y-p2.y,2)));
            return dist;
        }
}
