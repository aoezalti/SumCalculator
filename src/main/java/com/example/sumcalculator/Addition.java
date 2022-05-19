package com.example.sumcalculator;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity

public class Addition {

    private int a;
    private int b;
    private Long id;

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

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
