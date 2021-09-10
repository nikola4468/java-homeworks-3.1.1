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
            currentVolume = volumeMax;
        }
        if (currentVolume <= volumeMin) {
            currentVolume = volumeMin;
        }
        if ((currentVolume >= volumeMin) & (currentVolume <= volumeMax)) {
           this.currentVolume = currentVolume;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setIncreaseVolume() {
        getCurrentVolume();
        if (currentVolume < volumeMax) {
            this.currentVolume = currentVolume + 1;
        }
        if (currentVolume == volumeMax) {
            this.currentVolume = volumeMax;
        }
    }

    public void setDecreaseVolume() {
        getCurrentVolume();
        if (currentVolume > volumeMin) {
            this.currentVolume = currentVolume - 1;
        }
        if (currentVolume == volumeMin) {
            this.currentVolume = volumeMin;
        }
    }

    public void setCurrentStation() {
        if (currentStation >= stationMax) {
            currentStation = stationMax;}
        if (currentStation <= stationMin) {
           currentStation = stationMin;}
        if ((currentStation >= stationMin) & (currentStation <= stationMax)) {
        this.currentVolume = currentStation;}
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setNextStation() {
        getCurrentStation();
        if (currentStation <= stationMax) {
            this.currentStation = currentStation + 1;
        }
        if (currentStation > stationMax) {
            this.currentStation = stationMin;
        }
    }

    public void setPrevStation() {
        getCurrentStation();
        if (currentStation >= stationMin) {
            this.currentStation = currentStation - 1;
        }
        if (currentStation < stationMin) {
            this.currentStation = stationMax;
        }
    }

    public void setStation() {
        if ((currentStation <= stationMax) & (currentStation >= stationMin)) {
            this.currentStation = currentStation;
        }
    }
}
