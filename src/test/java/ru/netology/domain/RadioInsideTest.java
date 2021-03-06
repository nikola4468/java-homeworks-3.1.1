package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioInsideTest {

    @Test
    public void shouldIncreaseVolume() {
        RadioInside volume = new RadioInside();
        volume.setCurrentVolume(-1);
        volume.IncreaseVolume();
        assertEquals(1, volume.getCurrentVolume());
        volume.setCurrentVolume(0);
        volume.IncreaseVolume();
        assertEquals(1, volume.getCurrentVolume());
        volume.setCurrentVolume(1);
        volume.IncreaseVolume();
        assertEquals(2, volume.getCurrentVolume());
        volume.setCurrentVolume(9);
        volume.IncreaseVolume();
        assertEquals(10, volume.getCurrentVolume());
        volume.setCurrentVolume(10);
        volume.IncreaseVolume();
        assertEquals(10, volume.getCurrentVolume());
        volume.setCurrentVolume(11);
        volume.IncreaseVolume();
        assertEquals(10, volume.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        RadioInside volume = new RadioInside();
        volume.setCurrentVolume(-1);
        volume.DecreaseVolume();
        assertEquals(0, volume.getCurrentVolume());
        volume.setCurrentVolume(0);
        volume.DecreaseVolume();
        assertEquals(0, volume.getCurrentVolume());
        volume.setCurrentVolume(1);
        volume.DecreaseVolume();
        assertEquals(0, volume.getCurrentVolume());
        volume.setCurrentVolume(9);
        volume.DecreaseVolume();
        assertEquals(8, volume.getCurrentVolume());
        volume.setCurrentVolume(10);
        volume.DecreaseVolume();
        assertEquals(9, volume.getCurrentVolume());
        volume.setCurrentVolume(11);
        volume.DecreaseVolume();
        assertEquals(9, volume.getCurrentVolume());
    }

    @Test
    public void shouldNextStation() {
        RadioInside station = new RadioInside();
        station.setCurrentStation(-1);
        station.NextStation();
        assertEquals(1, station.getCurrentStation());
        station.setCurrentStation(0);
        station.NextStation();
        assertEquals(1, station.getCurrentStation());
        station.setCurrentStation(1);
        station.NextStation();
        assertEquals(2, station.getCurrentStation());
        station.setCurrentStation(8);
        station.NextStation();
        assertEquals(9, station.getCurrentStation());
        station.setCurrentStation(9);
        station.NextStation();
        assertEquals(0, station.getCurrentStation());
        station.setCurrentStation(10);
        station.NextStation();
        assertEquals(0, station.getCurrentStation());
    }

    @Test
    public void shouldPrevStation() {
        RadioInside station = new RadioInside();
        station.setCurrentStation(-1);
        station.PrevStation();
        assertEquals(9, station.getCurrentStation());
        station.setCurrentStation(0);
        station.PrevStation();
        assertEquals(9, station.getCurrentStation());
        station.setCurrentStation(1);
        station.PrevStation();
        assertEquals(0, station.getCurrentStation());
        station.setCurrentStation(8);
        station.PrevStation();
        assertEquals(7, station.getCurrentStation());
        station.setCurrentStation(9);
        station.PrevStation();
        assertEquals(8, station.getCurrentStation());
        station.setCurrentStation(10);
        station.PrevStation();
        assertEquals(8, station.getCurrentStation());
    }

    @Test
    public void shouldStation() {
        RadioInside station = new RadioInside();
        station.setCurrentStation(-1);
        station.Station();
        assertEquals(0, station.getCurrentStation());
        station.setCurrentStation(0);
        station.Station();
        assertEquals(0, station.getCurrentStation());
        station.setCurrentStation(1);
        station.Station();
        assertEquals(1, station.getCurrentStation());
        station.setCurrentStation(8);
        station.Station();
        assertEquals(8, station.getCurrentStation());
        station.setCurrentStation(9);
        station.Station();
        assertEquals(9, station.getCurrentStation());
        station.setCurrentStation(10);
        station.Station();
        assertEquals(9, station.getCurrentStation());
    }
}