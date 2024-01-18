package com.example.back_end.model;

public class sound {
    private Integer id;

    private double volume;

    private boolean warning;

    private boolean callThePolice;

    // Constructor, getters, and setters
    public sound() {}

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}