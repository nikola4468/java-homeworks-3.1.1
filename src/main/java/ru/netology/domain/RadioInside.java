package ru.netology.domain;

public class RadioInside {

    private int volumeMax = 10;
    private int volumeMin = 0;
    public int currentVolume;
    private int stationMax = 9;
    private int stationMin = 0;
    public int currentStation;

    public void setCurrentVolume() {
        if (currentVolume >= volumeMax) {
            this.currentVolume = volumeMax;
        }
        if (currentVolume <= volumeMin) {
            this.currentVolume = volumeMin;
        }
        this.currentVolume = currentVolume;

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setIncreaseVolume() {
        setCurrentVolume();
        if (currentVolume < volumeMax) {
            this.currentVolume = currentVolume + 1;
        }
        if (currentVolume == volumeMax) {
            this.currentVolume = volumeMax;
        }
    }

    public void setDecreaseVolume() {
        setCurrentVolume();
        if (currentVolume > volumeMin) {
            this.currentVolume = currentVolume - 1;
        }
        if (currentVolume == volumeMin) {
            this.currentVolume = volumeMin;
        }
    }

    public void setCurrentStation() {
        if (currentStation >= stationMax) {
            this.currentStation = stationMax;
        }
        if (currentStation <= stationMin) {
            this.currentStation = stationMin;
        }
        this.currentVolume = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setNextStation() {
        setCurrentStation();
        if (currentStation < stationMax) {
            this.currentStation = currentStation + 1;
        } else {
            this.currentStation = stationMin;
        }
    }

    public void setPrevStation() {
        setCurrentStation();
        if (currentStation > stationMin) {
            this.currentStation = currentStation - 1;
        } else {
            this.currentStation = stationMax;
        }
    }

    public void setStation() {
        setCurrentStation();
        this.currentStation = currentStation;
    }
}
