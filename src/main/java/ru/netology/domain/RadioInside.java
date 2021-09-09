package ru.netology.domain;

public class RadioInside {

    private int currentVolume;
    private int currentStation;
//    private boolean on;

//    public boolean isOn() {
//        return on;
//    }
//
//    public void setOn(boolean on) {
//        this.on = on;
//    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int setIncreaseVolume() {
        if ((currentVolume < 10) & (currentVolume >= 0)) {
            this.currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int setDecreaseVolume() {
        if ((currentVolume <= 10) & (currentVolume > 0)) {
            this.currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int setNextStation() {
        if ((currentStation < 9) & (currentStation >= 0)) {
            this.currentStation = currentStation + 1;
        }
        if (currentStation >= 9) {
            this.currentStation = 0;
        }
        return currentStation;
    }

    public int setPrevStation() {
        if ((currentStation <= 9) & (currentStation > 0)) {
            this.currentStation = currentStation - 1;
        }
        if (currentStation <= 0) {
            this.currentStation = 9;
        }
        return currentStation;
    }
}
