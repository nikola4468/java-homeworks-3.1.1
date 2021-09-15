package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioInsideTest {

    @Test
    public void shouldIncreaseVolume() {
        RadioInside volume = new RadioInside();
        volume.setIncreaseVolume(-1);
        assertEquals(1, volume.getCurrentVolume());
        volume.setIncreaseVolume(0);
        assertEquals(1, volume.getCurrentVolume());
        volume.setIncreaseVolume(1);
        assertEquals(2, volume.getCurrentVolume());
        volume.setIncreaseVolume(9);
        assertEquals(10, volume.getCurrentVolume());
        volume.setIncreaseVolume(10);
        assertEquals(10, volume.getCurrentVolume());
        volume.setIncreaseVolume(11);
        assertEquals(10, volume.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        RadioInside volume = new RadioInside();
        volume.setDecreaseVolume(-1);
        assertEquals(0, volume.getCurrentVolume());
        volume.setDecreaseVolume(0);
        assertEquals(0, volume.getCurrentVolume());
        volume.setDecreaseVolume(1);
        assertEquals(0, volume.getCurrentVolume());
        volume.setDecreaseVolume(9);
        assertEquals(8, volume.getCurrentVolume());
        volume.setDecreaseVolume(10);
        assertEquals(9, volume.getCurrentVolume());
        volume.setDecreaseVolume(11);
        assertEquals(9, volume.getCurrentVolume());
    }

    @Test
    public void shouldNextStation() {
        RadioInside station = new RadioInside();
        station.setNextStation(-1);
        assertEquals(1, station.getCurrentStation());
        station.setNextStation(0);
        assertEquals(1, station.getCurrentStation());
        station.setNextStation(1);
        assertEquals(2, station.getCurrentStation());
        station.setNextStation(8);
        assertEquals(9, station.getCurrentStation());
        station.setNextStation(9);
        assertEquals(0, station.getCurrentStation());
        station.setNextStation(10);
        assertEquals(0, station.getCurrentStation());
    }

    @Test
    public void shouldPrevStation() {
        RadioInside station = new RadioInside();
        station.setPrevStation(-1);
        assertEquals(9, station.getCurrentStation());
        station.setPrevStation(0);
        assertEquals(9, station.getCurrentStation());
        station.setPrevStation(1);
        assertEquals(0, station.getCurrentStation());
        station.setPrevStation(8);
        assertEquals(7, station.getCurrentStation());
        station.setPrevStation(9);
        assertEquals(8, station.getCurrentStation());
        station.setPrevStation(10);
        assertEquals(8, station.getCurrentStation());
    }

    @Test
    public void shouldStation() {
        RadioInside station = new RadioInside();
        station.setStation(-1);
        assertEquals(0, station.getCurrentStation());
        station.setStation(0);
        assertEquals(0, station.getCurrentStation());
        station.setStation(1);
        assertEquals(1, station.getCurrentStation());
        station.setStation(8);
        assertEquals(8, station.getCurrentStation());
        station.setStation(9);
        assertEquals(9, station.getCurrentStation());
        station.setStation(10);
        assertEquals(9, station.getCurrentStation());
    }
}