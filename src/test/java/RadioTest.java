import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldIncreaseWave() {
        Radio radio = new Radio(10);

        Assertions.assertEquals(0, radio.getMinWave());
        Assertions.assertEquals(9, radio.getMaxWave());
        Assertions.assertEquals(0, radio.getCurrentWave());
    }

    @Test
    public void shouldPushNext() {
        Radio radio = new Radio();
        radio.setCurrentWave(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPushNextAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentWave(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPushPrev() {
        Radio radio = new Radio();
        radio.setCurrentWave(9);

        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPushPrevAboveMin() {
        Radio radio = new Radio();
        radio.setCurrentWave(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetMaxIncreaseWaveAboveMax () {
        Radio radio = new Radio();
        radio.setCurrentWave(12);

        int expected = 0;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetMinDecreaseWaveAboveMin () {
        Radio radio = new Radio();
        radio.setCurrentWave(-2);

        int expected = 0;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxWave () {
        Radio radio = new Radio();
        radio.setCurrentWave(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinWave() {
        Radio radio = new Radio();
        radio.setCurrentWave(0);

        int expected = 0;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetIncreaseMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        radio.decreaseVolume();

        int expected = 49;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetDecreaseVolumeAboveMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-10);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
