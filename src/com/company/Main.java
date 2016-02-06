package com.company;

public class Main {

    public static void main(String[] args) {
	Apple ap, ap2, ap3;

        System.out.println("Here:");
        ap = Apple.RedDel;
        ap2 = Apple.GoldenDel;
        ap3 = Apple.RedDel;
        System.out.println();

        if(ap.compareTo(ap2)<0)
            System.out.println(ap + " comes before " + ap2);
        if(ap.compareTo(ap2)>0)
            System.out.println(ap2 + " comes before " + ap);
        if(ap.compareTo(ap3) == 0)
            System.out.println(ap + " equals " + ap3);
        System.out.println();

        if(ap.equals(ap2))
            System.out.println("Error!");
        if(ap.equals(ap3))
            System.out.println(ap + " equals " + ap3);
        if(ap == ap3)
            System.out.println(ap + "==" + ap3);

        String apple = "GoldenDel";
        Enum apples = Apple.valueOf(apple);
        System.out.println(apples);
    }
}
