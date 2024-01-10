package ru.netology.javaqa;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void test() {
        Radio radio = new Radio();
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getMinVolume());
        Assertions.assertEquals(100, radio.getMaxVolume());
        Assertions.assertEquals(0, radio.getCurrentStation());

    }

    @Test

    public void shouldSetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToChangeMaxStation() {
        Radio radio = new Radio(50);

        Assertions.assertEquals(50, radio.getMaxStation());
    }

    @Test

    public void shouldSetToMaxStationWithoutParameters() {
        Radio radio = new Radio();

        Assertions.assertEquals(9, radio.getMaxStation());
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setVolume(53);

        int expected = 53;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.nextStation();

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationMoreThenZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prevStation();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPlusMaxVolume() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.plusMaxVolume();

        int expected = 1;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPlusMaxVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setVolume(115);
        radio.plusMaxVolume();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinusMinVolume() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        radio.minusMinVolume();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinusMinVolumeMoreThenZero() {
        Radio radio = new Radio();
        radio.setVolume(67);
        radio.minusMinVolume();

        int expected = 66;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }


}
