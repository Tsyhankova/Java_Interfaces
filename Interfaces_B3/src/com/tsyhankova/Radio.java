package com.tsyhankova;

public class Radio implements Dzwiek {

    public Radio()
    {
        System.out.println("Radio: Radio implements WydajeDzwiek.");
    }

    @Override
    public void graj()
    {
        //instrukcje metody graj
        System.out.println("Radio: Graj.");
    }
}


