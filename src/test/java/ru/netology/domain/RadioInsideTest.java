package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioInsideTest {

    @Test
    public void shouldIncreaseVolume() {
        RadioInside volume = new RadioInside();
        volume.currentVolume = -1;
        volume.setCurrentVolume();
        volume.setIncreaseVolume();
        assertEquals(1, volume.getCurrentVolume());
        volume.currentVolume = 0;
        volume.setCurrentVolume();
        volume.setIncreaseVolume();
        assertEquals(1, volume.getCurrentVolume());
        volume.currentVolume = 10;
        volume.setCurrentVolume();
        volume.setIncreaseVolume();
        assertEquals(10, volume.getCurrentVolume());
        volume.currentVolume = 11;
        volume.setCurrentVolume();
        volume.setIncreaseVolume();
        assertEquals(10, volume.getCurrentVolume());
        volume.currentVolume = 9;
        volume.setCurrentVolume();
        volume.setIncreaseVolume();
        assertEquals(10, volume.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        RadioInside volume = new RadioInside();
        volume.currentVolume = -1;
        volume.setCurrentVolume();
        volume.setDecreaseVolume();
        assertEquals(0, volume.getCurrentVolume());
        volume.currentVolume = 0;
        volume.setCurrentVolume();
        volume.setDecreaseVolume();
        assertEquals(0, volume.getCurrentVolume());
        volume.currentVolume = 10;
        volume.setCurrentVolume();
        volume.setDecreaseVolume();
        assertEquals(9, volume.getCurrentVolume());
        volume.currentVolume = 11;
        volume.setCurrentVolume();
        volume.setDecreaseVolume();
        assertEquals(9, volume.getCurrentVolume());
    }

    @Test
    public void shouldNextStation() {
        RadioInside station = new RadioInside();
        station.currentStation = -1;
        station.setCurrentStation();
        station.setNextStation();
        assertEquals(1, station.getCurrentStation());
        station.currentStation = 0;
        station.setCurrentStation();
        station.setNextStation();
        assertEquals(1, station.getCurrentStation());
        station.currentStation = 1;
        station.setCurrentStation();
        station.setNextStation();
        assertEquals(2, station.getCurrentStation());
        station.currentStation = 8;
        station.setCurrentStation();
        station.setNextStation();
        assertEquals(9, station.getCurrentStation());
        station.currentStation = 9;
        station.setCurrentStation();
        station.setNextStation();
        assertEquals(0, station.getCurrentStation());
        station.currentStation = 10;
        station.setCurrentStation();
        station.setNextStation();
        assertEquals(0, station.getCurrentStation());
    }

    @Test
    public void shouldPrevStation() {
        RadioInside station = new RadioInside();
        station.currentStation = -1;
        station.setCurrentStation();
        station.setPrevStation();
        assertEquals(9, station.getCurrentStation());
        station.currentStation = 0;
        station.setCurrentStation();
        station.setPrevStation();
        assertEquals(9, station.getCurrentStation());
        station.currentStation = 1;
        station.setCurrentStation();
        station.setPrevStation();
        assertEquals(0, station.getCurrentStation());
        station.currentStation = 8;
        station.setCurrentStation();
        station.setPrevStation();
        assertEquals(7, station.getCurrentStation());
        station.currentStation = 9;
        station.setCurrentStation();
        station.setPrevStation();
        assertEquals(8, station.getCurrentStation());
        station.currentStation = 10;
        station.setCurrentStation();
        station.setPrevStation();
        assertEquals(8, station.getCurrentStation());
    }

    @Test
    public void shouldStation() {
        RadioInside station = new RadioInside();
        station.currentStation = -1;
        station.setCurrentStation();
        station.setStation();
        assertEquals(0, station.getCurrentStation());
        station.currentStation = 0;
        station.setCurrentStation();
        station.setStation();
        assertEquals(0, station.getCurrentStation());
        station.currentStation = 1;
        station.setCurrentStation();
        station.setStation();
        assertEquals(1, station.getCurrentStation());
        station.currentStation = 8;
        station.setCurrentStation();
        station.setStation();
        assertEquals(8, station.getCurrentStation());
        station.currentStation = 9;
        station.setCurrentStation();
        station.setStation();
        assertEquals(9, station.getCurrentStation());
        station.currentStation = 10;
        station.setCurrentStation();
        station.setStation();
        assertEquals(9, station.getCurrentStation());
    }
}