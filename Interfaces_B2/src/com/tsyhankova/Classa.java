package com.tsyhankova;

public class Classa implements PierwszyInterfejs, Drugiinterface{
    public Classa()
    {
        System.out.println("Klasa: implements PierwszyInterfejs, DrugiInterfejs.");
    }

    @Override
    public void f(int val)
    {
        System.out.println("Klasa: Print int val " + val + "'.");
    }

    @Override
    public void f(double val)
    {
        System.out.println("Klasa: Print double val " + val + "'.");
    }
}
