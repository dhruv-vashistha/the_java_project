package com.company;

class MyCylinder{
    private int Radii;
    private int Height;

    //making a constructor to set the radii and the height of the cylinder;
    public MyCylinder(int Radii, int Height){
        this.Radii = Radii;
        this.Height = Height;
    }
    public int getRadii(){
        return Radii;
    }
    public int getHeight(){
        return Height;
    }
}
public class dv_44_project2 {
    public static void main(String[] args) {
        MyCylinder mycd = new MyCylinder(33,55);
        System.out.println(mycd.getHeight());
        System.out.println(mycd.getRadii());

    }
}