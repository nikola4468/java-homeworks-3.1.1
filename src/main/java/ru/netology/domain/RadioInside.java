package ru.netology.domain;

public class RadioInside {

    private int volumeMax = 10;
    private int volumeMin = 0;
    public int currentVolume;
    private int stationMax = 9;
    private int stationMin = 0;
    public int currentStation;

    public int getCurrentVolume() {
        if (currentVolume >= volumeMax)
            return currentVolume = volumeMax;
        if (currentVolume <= volumeMin)
            return currentVolume = volumeMin;
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

    public int getCurrentStation() {
        if (currentStation >= stationMax)
            return currentStation = stationMax;
        if (currentStation <= stationMin)
            return currentStation = stationMin;
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
