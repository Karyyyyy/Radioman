package ru.netology.domain;

public class Radio {

    private int currentRadioStation;
    private int currentSoundVolume;
    private int minRadioStation;
    private int minVolume;
    private int maxVolume = 100;
    private int numberOfStation = 10;

    public Radio() {
    }

    public Radio(int numberOfStation) {

        this.numberOfStation = numberOfStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadioStation) {
            return;
        }
        if (currentRadioStation > numberOfStation - 1) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public void next() {
        if (currentRadioStation >= numberOfStation - 1) {
            setCurrentRadioStation(minRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation + 1);
        }
    }

    public void prev() {
        if (currentRadioStation <= minRadioStation) {
            setCurrentRadioStation(numberOfStation - 1);
        } else {
            setCurrentRadioStation(currentRadioStation - 1);
        }
    }

    public void customRadioStation() {
        int newCurrentRadioStation = getCurrentRadioStation();
        setCurrentRadioStation(newCurrentRadioStation);
    }


    public void setSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume < minVolume) {
            return;
        }
        if (currentSoundVolume > maxVolume) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }

    public int getCurrentSoundVolume() {

        return currentSoundVolume;
    }

    public void increaseVolume() {
        if (currentSoundVolume >= maxVolume) {
            setSoundVolume(maxVolume);
        } else {
            setSoundVolume(currentSoundVolume + 1);
        }
    }

    public void decreaseVolume() {
        if (currentSoundVolume <= minVolume) {
            setSoundVolume(minVolume);
        } else {
            setSoundVolume(currentSoundVolume - 1);
        }
    }
}
