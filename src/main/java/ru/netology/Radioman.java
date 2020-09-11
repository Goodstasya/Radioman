package ru.netology;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Radioman {
    private int minChannelNum;
    private int maxChannelNum;
    private int curChannelNum;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int curVolume;

    public Radioman(){
    }

    public Radioman(int minChannelNum, int numOfChannels, int curChannelNum, int curVolume) {
        this.minChannelNum = minChannelNum;
        this.maxChannelNum = minChannelNum + numOfChannels - 1;
        this.setCurChannelNum(curChannelNum);

        this.setCurVolume(curVolume);
    }

    public void setCurChannelNum(int curChannelNum) {
        if ((curChannelNum >= this.getMinChannelNum()) && (curChannelNum <= this.getMaxChannelNum()))
            this.curChannelNum = curChannelNum;
    }

    public void setCurVolume(int curVolume) {
        if ((curVolume >= this.getMinVolume()) && curVolume <= this.getMaxVolume())
            this.curVolume = curVolume;
    }

    public void increaseVolume() {
        if (this.getCurVolume() < this.getMaxVolume())
            this.setCurVolume(this.curVolume + 1);
    }

    public void decreaseVolume() {
        if (this.getCurVolume() > this.getMinVolume())
            this.setCurVolume(this.curVolume - 1);
    }

    public void increaseChannelNum() {
        if (this.getCurChannelNum() == this.getMaxChannelNum())
            this.setCurChannelNum(this.getMinChannelNum());
        else
            this.setCurChannelNum(this.curChannelNum + 1);
    }

    public void decreaseChannelNum() {
        if (this.getCurChannelNum() == this.getMinChannelNum())
            this.setCurChannelNum(this.getMaxChannelNum());
        else
            this.setCurChannelNum(this.curChannelNum - 1);
    }
}
