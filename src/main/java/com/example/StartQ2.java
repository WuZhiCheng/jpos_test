package com.example;

import org.jpos.q2.Q2;

public class StartQ2 {

    public static void main(String[] args) {
        System.out.println("================================================================");
        System.out.println("JPos 2.0.4  + Groovy 2.4.4 Start Server from IDE");
        System.out.println("================================================================");
        Q2 q = new Q2();
        q.start();
    }
}
