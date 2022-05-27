package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void currentRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(3);

        int actual = radio.getCurrentRadioStation();
        int expected = 3;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void currentRadioStation1() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int actual = radio.getCurrentRadioStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void currentRadioStation2() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(11);

        int actual = radio.getCurrentRadioStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void nextStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(3);
        radio.next();

        int actual = radio.getCurrentRadioStation();
        int expected = 4;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void nextAfter9Station() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.next();

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void prevStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(4);
        radio.prev();

        int actual = radio.getCurrentRadioStation();
        int expected = 3;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void prevBefore0Station() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        radio.prev();

        int actual = radio.getCurrentRadioStation();
        int expected = 9;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void customRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);
        radio.customRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 8;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void currentSoundVolume() {
        Radio radio = new Radio();

        radio.setSoundVolume(6);

        int actual = radio.getCurrentSoundVolume();
        int expected = 6;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void currentSoundVolume1() {
        Radio radio = new Radio();

        radio.setSoundVolume(-1);

        int actual = radio.getCurrentSoundVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void turnUpTheVolume() {
        Radio radio = new Radio();

        radio.setSoundVolume(7);
        radio.increaseVolume();

        int actual = radio.getCurrentSoundVolume();
        int expected = 8;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void turnUpTheVolume2() {
        Radio radio = new Radio();

        radio.setSoundVolume(10);
        radio.increaseVolume();

        int actual = radio.getCurrentSoundVolume();
        int expected = 10;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void turnUpTheVolume3() {
        Radio radio = new Radio();

        radio.setSoundVolume(11);

        int actual = radio.getCurrentSoundVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void turnDownTheVolume() {
        Radio radio = new Radio();

        radio.setSoundVolume(7);
        radio.decreaseVolume();

        int actual = radio.getCurrentSoundVolume();
        int expected = 6;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void turnDownTheVolume2() {
        Radio radio = new Radio();

        radio.setSoundVolume(0);
        radio.decreaseVolume();

        int actual = radio.getCurrentSoundVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void turnDownTheVolume3() {
        Radio radio = new Radio();

        radio.setSoundVolume(-1);
        radio.decreaseVolume();

        int actual = radio.getCurrentSoundVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);

    }

}
