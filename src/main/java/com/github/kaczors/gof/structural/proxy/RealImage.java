package com.github.kaczors.gof.structural.proxy;

class RealImage implements Image{


    RealImage(){
        //some expensive and heavy stuff...
    }

    @Override
    public String getImage() {

        return "Image";
    }
}
