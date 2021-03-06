package com.pedroperez.designpatterns.patterns.structural.proxy;

public class ProxyImage implements Image {
    private final String filename;
    private RealImage image;

    /**
     * Constructor
     *
     * @param filename file name
     */
    public ProxyImage(String filename) {
        this.filename = filename;
    }

    /**
     * Displays the image
     */
    public void displayImage() {
        if (image == null) {
            image = new RealImage(filename);
        }
        image.displayImage();
    }
}
