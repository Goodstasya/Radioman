package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RadiomanTest {
    Radioman radioman = new Radioman(0, 10, 5, 55);

    @Test
    void shouldIncreaseVolume() {
        radioman.setCurVolume(5);
        radioman.increaseVolume();

        assertEquals(6, radioman.getCurVolume());
    }

    @Test
    void shouldIncreaseVolumeHigherThanMax() {
        radioman.setCurVolume(100);

        radioman.increaseVolume();

        assertEquals(100, radioman.getCurVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        radioman.setCurVolume(5);

        radioman.decreaseVolume();

        assertEquals(4, radioman.getCurVolume() );
    }

    @Test
    void shouldDecreaseVolumeLowerThanMin() {
        radioman.setCurVolume(0);

        radioman.decreaseVolume();

        assertEquals(0, radioman.getCurVolume());
    }

    @Test
    void shouldIncreaseChannelNum() {
        radioman.setCurChannelNum(5);

        radioman.increaseChannelNum();

        assertEquals(6, radioman.getCurChannelNum());
    }

    @Test
    void shouldIncreaseChannelNumHigherThanMax() {
        radioman.setCurChannelNum(radioman.getMaxChannelNum());

        radioman.increaseChannelNum();

        assertEquals(radioman.getMinChannelNum(), radioman.getCurChannelNum() );
    }

    @Test
    void shouldDecreaseChannelNum() {
        radioman.setCurChannelNum(5);

        radioman.decreaseChannelNum();

        assertEquals(4, radioman.getCurChannelNum());
    }

    @Test
    void shouldDecreaseChannelNumLowerThanMin() {
        radioman.setCurChannelNum(radioman.getMinChannelNum());

        radioman.decreaseChannelNum();

        assertEquals(radioman.getMaxChannelNum(), radioman.getCurChannelNum());
    }

    @Test
    void shouldSetChannelNUm() {
        radioman.setCurChannelNum(1);

        radioman.setCurChannelNum(2);

        assertEquals(2, radioman.getCurChannelNum());
    }

    @Test
    void shouldSetInvalidHighChannelNum() {
        radioman.setCurChannelNum((radioman.getMaxChannelNum() - radioman.getMinChannelNum())/2);
        radioman.setCurChannelNum(radioman.getMaxChannelNum() + 10);

        assertEquals((radioman.getMaxChannelNum() - radioman.getMinChannelNum())/2, radioman.getCurChannelNum());
    }

    @Test
    void shouldSetInvalidLowChannelNum() {
        radioman.setCurChannelNum((radioman.getMaxChannelNum() - radioman.getMinChannelNum())/2);
        radioman.setCurChannelNum(radioman.getMinChannelNum() - 10);

        assertEquals((radioman.getMaxChannelNum() - radioman.getMinChannelNum())/2, radioman.getCurChannelNum());
    }

    @Test
    void shouldSetInvalidHighVolume() {
        radioman.setCurVolume((radioman.getMaxVolume() - radioman.getMinVolume())/2);
        radioman.setCurVolume(radioman.getMaxVolume() + 10);

        assertEquals((radioman.getMaxVolume() - radioman.getMinVolume())/2, radioman.getCurVolume());
    }

    @Test
    void shouldSetInvalidLowVolume() {
        radioman.setCurVolume((radioman.getMaxVolume() - radioman.getMinVolume())/2);
        radioman.setCurVolume(radioman.getMinVolume() - 10);

        assertEquals((radioman.getMaxVolume() - radioman.getMinVolume())/2, radioman.getCurVolume());
    }

    @Test
    void shouldSetFields(){


        assertEquals(5, radioman.getCurChannelNum());
        assertEquals(0, radioman.getMinChannelNum());
        assertEquals(9, radioman.getMaxChannelNum());
        assertEquals(0, radioman.getMinVolume());
        assertEquals(100, radioman.getMaxVolume());
        assertEquals(55, radioman.getCurVolume());
    }
}