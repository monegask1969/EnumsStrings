package com.company;

/**
 * Created by uitschool JV on 2/6/2016.
 */
public class EqualsInteger {
    public static void main(String[] args) {
        Integer iOb = 100;
        Integer kOb = 100;

        if(iOb.equals(kOb))
            System.out.println("equals");
        else
            System.out.println("no equals");
        if(iOb == kOb)
            System.out.println("==equal");
        else
            System.out.println("==no equal");
    }
}
