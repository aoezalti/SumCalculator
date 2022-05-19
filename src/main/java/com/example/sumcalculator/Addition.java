package com.example.sumcalculator;

public class Addition {

    public int addition(int a, int b){
        int Summe = a + b;
        return Summe;
    }

    public double addition(double a, double b){
        double Sum = a + b;
        return Sum;
    }

    public double addition(double[] a){
        int len = a.length;
        double Summe = 0;

        for (int i = 0; i < len; i++) {
            Summe += a[i];
        }

        return Summe;
    }
}
