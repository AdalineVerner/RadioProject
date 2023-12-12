package ru.netology.javaqa;

public class Radio {
    private int currentStation;
    private int volume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setCurrentStation(int newCurrentStation) {
        currentStation = newCurrentStation;
    }

    public void setVolume(int newVolume) {
        volume = newVolume;
    }

    public void setToMaxStation() {
        currentStation = 9;
    }

    public void setToMaxVolume() {
        volume = 100;
    }

    public void setToMinStation() {
        currentStation = 0;
    }

    public void setToMinVolume() {
        volume = 0;
    }

    public void nextStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }

    }

    public void plusMaxVolume() {
        if (volume > 100) {
            volume = 100;
        } else {
            volume = volume + 1;
        }
    }

    public void minusMinVolume() {
        if (volume > 0) {
            volume = volume - 1;
        } else {
            volume = 0;
        }
    }


}

