package com.tsyhankova;

public class Implement_class implements przykladowy_interfejs {
    public Implement_class()
    {
        System.out.println("Implement_class: TestClass implements przykladowy interfejs.");
    }

    @Override
    public void showValueInt()
    {
        System.out.println("Implement_class: Int value '" + intVal + "'.");
    }

    @Override
    public void showValueDouble()
    {
        System.out.println("Implement_class: Double value '" + doubleVal + "'.");
    }
}
