package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RadioTest {
    Radio radio = new Radio();

    @Test
    void currentRadioStation() {

        radio.setCurrentRadioStation(3);
        assertEquals(3, radio.getCurrentRadioStation());
    }
    @Test
    void currentRadioStations() {
        Radio radio1=new Radio(20);

        radio1.setCurrentRadioStation(15);


        assertEquals(15, radio1.getCurrentRadioStation());
    }

    @Test
    void currentRadioStation1() {

        radio.setCurrentRadioStation(-1);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void currentRadioStation2() {

        radio.setCurrentRadioStation(11);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void nextStation() {

        radio.setCurrentRadioStation(3);
        radio.next();


        assertEquals(4, radio.getCurrentRadioStation());

    }

    @Test
    void nextAfter9Station() {

        radio.setCurrentRadioStation(9);
        radio.next();

        assertEquals(0, radio.getCurrentRadioStation());

    }

    @Test
    void prevStation() {

        radio.setCurrentRadioStation(4);
        radio.prev();

        assertEquals(3, radio.getCurrentRadioStation());

    }

    @Test
    void prevBefore0Station() {

        radio.setCurrentRadioStation(0);
        radio.prev();

        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void customRadioStation() {

        radio.setCurrentRadioStation(8);
        radio.customRadioStation();

        assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    void currentSoundVolume() {

        radio.setSoundVolume(6);

        assertEquals(6, radio.getCurrentSoundVolume());
    }

    @Test
    void currentSoundVolume1() {

        radio.setSoundVolume(-1);

        assertEquals(0, radio.getCurrentSoundVolume());
    }

    @Test
    void turnUpTheVolume() {

        radio.setSoundVolume(7);
        radio.increaseVolume();


        assertEquals(8, radio.getCurrentSoundVolume());

    }

    @Test
    void turnUpTheVolume2() {

        radio.setSoundVolume(100);
        radio.increaseVolume();


        assertEquals(100, radio.getCurrentSoundVolume());
    }

    @Test
    void turnUpTheVolume3() {

        radio.setSoundVolume(101);

        assertEquals(0, radio.getCurrentSoundVolume());
    }
    @Test
    void turnUpTheVolume4() {

        radio.setSoundVolume(99);
        radio.increaseVolume();


        assertEquals(100, radio.getCurrentSoundVolume());

    }

    @Test
    void turnDownTheVolume() {

        radio.setSoundVolume(7);
        radio.decreaseVolume();

        assertEquals(6, radio.getCurrentSoundVolume());
    }

    @Test
    void turnDownTheVolume2() {

        radio.setSoundVolume(0);
        radio.decreaseVolume();


        assertEquals(0, radio.getCurrentSoundVolume());

    }

    @Test
    void turnDownTheVolume3() {

        radio.setSoundVolume(-1);
        radio.decreaseVolume();


        assertEquals(0, radio.getCurrentSoundVolume());

    }

}
