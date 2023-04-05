public class Radio {
    public int currentVolume;
    public int currentWave;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentWave() {
        return currentWave;
    }

    public void setCurrentWave (int newCurrentWave) {
        if (newCurrentWave < 0) {
            return;
        }
        if (newCurrentWave > 9) {
            return;
        }
        currentWave = newCurrentWave;
    }

    public void next() {
        if (currentWave < 9) {
            currentWave = currentWave + 1;
        }
    }

    public void prev() {
        if (currentWave > 0) {
            currentWave = currentWave - 1;
        }
    }
}