package ru.netology.javaqa;

public class Radio {
    public static void main(String[] args) {
        Radio radio = new Radio();
    }

    public int currentStation;
    public int volume;


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

