public class Radio {
    private int minWave = 0;
    private int maxWave = 9;
    private int currentWave = minWave;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;

    public Radio() {
    }

    public Radio(int size) {
        maxWave = minWave + size - 1;
    }

    public int getCurrentWave() {
        return currentWave;
    }

    public int getMaxWave() {
        return maxWave;
    }

    public int getMinWave() {
        return minWave;
    }

    public void setCurrentWave(int currentWave) {
        if (currentWave < minWave) {
            return;
        }
        if (currentWave > maxWave) {
            return;
        }
        this.currentWave = currentWave;
    }


    public void next() {
        if (currentWave < maxWave) {
            currentWave++;
        } else {
            currentWave = minWave;
        }
    }

    public void prev() {
        if (currentWave > minWave) {
            currentWave--;
        } else {
            currentWave = maxWave;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        } else {
            currentVolume = minVolume;
        }
    }
}

