package ru.netology.domain;

public class Radio {

    public String name;
    public int currentVolume;
    public int currentStation;
    public boolean on;

    public int CurrentVolume() {
        RadioInside Volume = new RadioInside();
        return Volume.getCurrentVolume();
    }

}
