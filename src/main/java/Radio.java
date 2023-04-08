public class Radio {
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;
   private int minWave = 0;
   private int maxWave = 9;
    private int currentWave = minWave;

    public int getCurrentVolume() {
        return currentVolume;
    }
    public int getMinVolume() {
        return minVolume;
    }
    public int getMaxVolume() {
        return maxVolume;
    }


    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }
    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentWave() {
        return currentWave;
    }
    public int getMinWave(){
        return minWave;
    }
    public int getMaxWave() {
        return maxWave;
    }

    public void setCurrentWave (int newCurrentWave) {
        if (newCurrentWave < minWave) {
            return;
        }
        if (newCurrentWave > maxWave) {
            return;
        }
        currentWave = newCurrentWave;
    }

    public void next() {
        if (currentWave < maxWave) {
            currentWave = currentWave + 1;
        } else {
            currentWave = minWave;
        }
    }

    public void prev() {
        if (currentWave > minWave) {
            currentWave = currentWave - 1;
        } else {
            currentWave = maxWave;
        }
    }
}