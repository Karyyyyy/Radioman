package ru.netology.domain;

public class Radio {

    private int currentRadioStation;
    private int currentSoundVolume;

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void next() {
        if (currentRadioStation >= 9) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = currentRadioStation + 1;
        }
    }

    public void prev() {
        if (currentRadioStation <= 0) {
            currentRadioStation = 9;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public void customRadioStation() {
        int newCurrentRadioStation = getCurrentRadioStation();
        setCurrentRadioStation(newCurrentRadioStation);
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume < 0) {
            return;
        }
        if (currentSoundVolume > 10) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }

    public void increaseVolume() {
        if (currentSoundVolume >= 10) {
            currentSoundVolume = 10;
        } else {
            currentSoundVolume = currentSoundVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentSoundVolume <= 0) {
            currentSoundVolume = 0;
        } else {
            currentSoundVolume = currentSoundVolume - 1;
        }
    }

    public int getCurrentSoundVolume() {

        return currentSoundVolume;
    }
}
