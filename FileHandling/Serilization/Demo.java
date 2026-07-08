package Serilization;

import java.io.Serializable;

public class Demo implements Serializable{
    int x;
     transient  String y;
    public Demo(int x, String y) {
        this.x = x;
        this.y = y;
    }
    
    public void display(){
        System.out.println(" x : " + this.x);
        System.out.println(" y : " + this.y);
    }
}
