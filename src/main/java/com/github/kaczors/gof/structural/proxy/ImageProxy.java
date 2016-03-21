package com.github.kaczors.gof.structural.proxy;

public class ImageProxy implements Image {

    private RealImage realImage;

    @Override
    public String getImage() {
        if(realImage == null){
            realImage = new RealImage();
        }
        return realImage.getImage();
    }
}
