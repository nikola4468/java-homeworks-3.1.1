package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioInsideTest {

    @Test
    public void shouldIncreaseVolume() {
        RadioInside volume = new RadioInside();
        volume.setIncreaseVolume(6);
        int expected = 7;
        assertEquals(expected, volume.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        RadioInside volume = new RadioInside();
        volume.setDecreaseVolume(6);
        int expected = 5;
        assertEquals(expected, volume.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseStation() {
        RadioInside station = new RadioInside();
        station.setIncreaseStation(8);
        int expected = 9;
        assertEquals(expected, station.getCurrentStation());
    }
    @Test
    public void shouldDecreaseStation() {
        RadioInside station = new RadioInside();
        station.setDecreaseStation(0);
        int expected = 9;
        assertEquals(expected, station.getCurrentStation());
    }
}