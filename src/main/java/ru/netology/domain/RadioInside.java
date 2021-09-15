package ru.netology.domain;

public class RadioInside {

    private int volumeMax = 10;
    private int volumeMin = 0;
    public int currentVolume;
    private int stationMax = 9;
    private int stationMin = 0;
    public int currentStation;

    public void setCurrentVolume(int currentVolume) {

        this.currentVolume = currentVolume;

        if (currentVolume >= volumeMax) {
            this.currentVolume = volumeMax;
        }
        if (currentVolume <= volumeMin) {
            this.currentVolume = volumeMin;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setIncreaseVolume(int currentVolume) {

        setCurrentVolume(currentVolume);

        if (currentVolume < volumeMax) {
            this.currentVolume++;
        }
        if (currentVolume == volumeMax) {
            this.currentVolume = volumeMax;
        }
    }

    public void setDecreaseVolume(int currentVolume) {

        setCurrentVolume(currentVolume);

        if (currentVolume > volumeMin) {
            this.currentVolume--;
        }
        if (currentVolume == volumeMin) {
            this.currentVolume = volumeMin;
        }
    }

    public void setCurrentStation(int currentStation) {

        this.currentStation = currentStation;

        if (currentStation >= stationMax) {
            this.currentStation = stationMax;
        }
        if (currentStation <= stationMin) {
            this.currentStation = stationMin;
        }

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setNextStation(int currentStation) {

        setCurrentStation(currentStation);

        if (currentStation < stationMax) {
            this.currentStation++;
        } else {
            this.currentStation = stationMin;
        }
    }

    public void setPrevStation(int currentStation) {

        setCurrentStation(currentStation);

        if (currentStation > stationMin) {
            this.currentStation--;
        } else {
            this.currentStation = stationMax;
        }
    }

    public void setStation(int currentStation) {

        setCurrentStation(currentStation);

        this.currentStation = getCurrentStation();
    }
}
