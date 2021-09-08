package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioInsideTest {

    @Test
    public void shouldIncreaseVolume() {
        RadioInside volume = new RadioInside();
        int expected = volume.getCurrentVolume() + 1;
        if (expected > 10) { expected = 10;}
        assertEquals(expected, volume.setIncreaseVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        RadioInside volume = new RadioInside();
        int expected = volume.getCurrentVolume() - 1;
        if (expected < 0) { expected = 0;}
        assertEquals(expected, volume.setDecreaseVolume());
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