package ru.netology;

public class Radioman {
    private int minChannelNum;
    private int maxChannelNum;
    private int curChannelNum;
    private int minVolume;
    private int maxVolume;
    private int curVolume;

    public int getCurChannelNum() {
        return curChannelNum;
    }

    public int getCurVolume() {
        return curVolume;
    }

    public int getMaxChannelNum() {
        return maxChannelNum;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinChannelNum() {
        return minChannelNum;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setCurChannelNum(int curChannelNum) {
        if ((curChannelNum >= this.getMinChannelNum()) && (curChannelNum <= this.getMaxChannelNum()))
            this.curChannelNum = curChannelNum;
    }

    public void setCurVolume(int curVolume) {
        if ((curVolume >= this.getMinVolume()) && curVolume <= this.getMaxVolume())
            this.curVolume = curVolume;
    }

    public void setMaxChannelNum(int maxChannelNum) {
        this.maxChannelNum = maxChannelNum;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void setMinChannelNum(int minChannelNum) {
        this.minChannelNum = minChannelNum;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
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
