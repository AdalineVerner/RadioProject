package ru.netology.javaqa;

public class Radio {

    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation = minStation;
    private int minVolume = 0;
    private int maxVolume = 100;

    private int volume = minVolume;

    public Radio(int size) {
        maxStation = minStation + size;

    }

    public Radio() {
        int maxStation1 = maxStation;
    }

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

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = minStation;
        }
    }

    public void prevStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }

    }

    public void plusMaxVolume() {
        if (volume > maxVolume) {
            volume = maxVolume;
        } else {
            volume = volume + 1;
        }
    }

    public void minusMinVolume() {
        if (volume > minVolume) {
            volume = volume - 1;
        } else {
            volume = minVolume;
        }
    }


}

