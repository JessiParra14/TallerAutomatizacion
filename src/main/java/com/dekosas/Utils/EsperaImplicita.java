package com.dekosas.Utils;

public class EsperaImplicita {

    public void esperaImplicita (int milisegundos){
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }
    }
}
