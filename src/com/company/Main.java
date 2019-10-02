package com.company;

public class Main {

    public static void main(String[] args) {
	    int height = 2;
	    int width = 7;
        int area = height*width;
        System.out.println(area);
        getVolume();
    }

    public static void getVolume(){
        int oh = getMath(790, 346);
        System.out.println(oh);
    }

    public static int getMath(int x, int y){
        int oh = x + y;
        return oh;
    }
}
