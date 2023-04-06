public class Radio {
    private int minWave = 0;
    private int maxWave = 9;
    private int currentWave = minWave;

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

    public void setCurrentWave(int newCurrentWave) {
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

