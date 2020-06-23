package com.tsyhankova;

public class Telewizor implements ObrazDzwiek {

    public Telewizor()
    {
        System.out.println("Telewizor: Telewizor implements WyswietlaObrazIWydajeDzwiek.");
    }

    @Override
    public void graj()
    {
        //instrukcje metody graj
        System.out.println("Telewizor: Graj.");
    }

    @Override
    public void wyswietl()
    {
        //instrukcje metody wyswietl
        System.out.println("Telewizor: Wyswietl.");
    }
}