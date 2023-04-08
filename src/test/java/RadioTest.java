import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);


        int expected = 0;
        int actual = radio.getMinVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getMaxVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int expected = 11;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.decreaseVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shloudIncreaseVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeAboveMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetMinDecreaseVolumeAboveMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-10);


        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetMaxDecreaseVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);


        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinWave(){
        Radio radio = new Radio();
        radio.setCurrentWave(0);

        int expected = 0;
        int actual = radio.getMinWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxWave(){
        Radio radio = new Radio();
        radio.setCurrentWave(9);

        int expected = 9;
        int actual = radio.getMaxWave();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void sholudIncreaseWave() {
        Radio radio = new Radio();
        radio.setCurrentWave(5);

        radio.next();

        int expected = 6;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseWave() {
        Radio radio = new Radio();
        radio.setCurrentWave(5);

        radio.prev();

        int expected = 4;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseWaveAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentWave(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseWaveAboveMin() {
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
}
