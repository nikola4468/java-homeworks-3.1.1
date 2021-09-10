package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioInsideTest {

    @Test
    public void shouldIncreaseVolume() {
        RadioInside volume = new RadioInside();
        volume.currentVolume = -1;
        volume.setIncreaseVolume();
        assertEquals(1, volume.getCurrentVolume());
        volume.currentVolume = 0;
        volume.setIncreaseVolume();
        assertEquals(1, volume.getCurrentVolume());
        volume.currentVolume = 10;
        volume.setIncreaseVolume();
        assertEquals(10, volume.getCurrentVolume());
        volume.currentVolume = 11;
        volume.setIncreaseVolume();
        assertEquals(10, volume.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        RadioInside volume = new RadioInside();
        volume.currentVolume = -1;
        volume.setDecreaseVolume();
        assertEquals(0, volume.getCurrentVolume());
        volume.currentVolume = 0;
        volume.setDecreaseVolume();
        assertEquals(0, volume.getCurrentVolume());
        volume.currentVolume = 10;
        volume.setDecreaseVolume();
        assertEquals(9, volume.getCurrentVolume());
        volume.currentVolume = 11;
        volume.setDecreaseVolume();
        assertEquals(9, volume.getCurrentVolume());
    }

    @Test
    public void shouldNextStation() {
        RadioInside station = new RadioInside();
        station.currentStation = -1;
        station.setNextStation();
        assertEquals(1, station.getCurrentStation());
        station.currentStation = 0;
        station.setNextStation();
        assertEquals(1, station.getCurrentStation());
        station.currentStation = 9;
        station.setNextStation();
        assertEquals(0, station.getCurrentStation());
        station.currentStation = 10;
        station.setNextStation();
        assertEquals(0, station.getCurrentStation());
    }

    @Test
    public void shouldPrevStation() {
        RadioInside station = new RadioInside();
        station.currentStation = -1;
        station.setPrevStation();
        assertEquals(9, station.getCurrentStation());
        station.currentStation = 0;
        station.setPrevStation();
        assertEquals(9, station.getCurrentStation());
        station.currentStation = 9;
        station.setPrevStation();
        assertEquals(8, station.getCurrentStation());
        station.currentStation = 10;
        station.setPrevStation();
        assertEquals(8, station.getCurrentStation());
    }

    @Test
    public void shouldStation() {
        RadioInside station = new RadioInside();
        station.currentStation = -1;
        station.setStation();
        assertEquals(0, station.getCurrentStation());
        station.currentStation = 0;
        station.setStation();
        assertEquals(0, station.getCurrentStation());
        station.currentStation = 10;
        station.setStation();
        assertEquals(9, station.getCurrentStation());
    }
}