package com.github.kaczors.gof.structural.adapter;

public class AdapterTest {

    public void example(){
        System230V system230V = new System110VAdapter(new System110VImpl());
    }

}