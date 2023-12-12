package ru.netology.javaqa;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test

    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.currentStation = 9;

        int expected = 9;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.volume = 53;

        int expected = 53;
        int actual = radio.volume;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetToMaxStation() {
        Radio radio = new Radio();
        radio.setToMaxStation();

        int expected = 9;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio radio = new Radio();
        radio.setToMaxVolume();

        int expected = 100;
        int actual = radio.volume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinStation() {
        Radio radio = new Radio();
        radio.setToMinStation();

        int expected = 0;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolume() {
        Radio radio = new Radio();
        radio.setToMinVolume();

        int expected = 0;
        int actual = radio.volume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();
        radio.currentStation = 5;
        radio.nextStation();

        int expected = 6;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationAboveMax() {
        Radio radio = new Radio();
        radio.currentStation = 10;
        radio.nextStation();

        int expected = 0;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio();
        radio.currentStation = 0;
        radio.prevStation();

        int expected = 9;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationMoreThenZero() {
        Radio radio = new Radio();
        radio.currentStation = 9;
        radio.prevStation();

        int expected = 8;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPlusMaxVolume() {
        Radio radio = new Radio();
        radio.volume = 0;
        radio.plusMaxVolume();

        int expected = 1;
        int actual = radio.volume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPlusMaxVolumeAboveMax() {
        Radio radio = new Radio();
        radio.volume = 115;
        radio.plusMaxVolume();

        int expected = 100;
        int actual = radio.volume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinusMinVolume() {
        Radio radio = new Radio();
        radio.volume = -1;
        radio.minusMinVolume();

        int expected = 0;
        int actual = radio.volume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinusMinVolumeMoreThenZero() {
        Radio radio = new Radio();
        radio.volume = 67;
        radio.minusMinVolume();

        int expected = 66;
        int actual = radio.volume;

        Assertions.assertEquals(expected, actual);
    }


}
