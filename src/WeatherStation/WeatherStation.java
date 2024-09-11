package WeatherStation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherStation implements Runnable {
    private List<WeatherObserver> observers;
    private int temperature;
    private boolean running;
    private final int minTemp = -10;
    private final int maxTemp = 40;

    public WeatherStation() {
        this.observers = new ArrayList<>();
        this.temperature = new Random().nextInt(maxTemp - minTemp + 1) + minTemp;
        this.running = true;
    }

    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(temperature);
        }
    }

    @Override
    public void run() {
        Random random = new Random();
        while (running) {
            try {
                int tempChange = random.nextInt(3) - 1; // -1, 0, or 1
                temperature += tempChange;

                if (temperature < minTemp) temperature = minTemp;
                if (temperature > maxTemp) temperature = maxTemp;
                notifyObservers();

                Thread.sleep((random.nextInt(5) + 1) * 1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stop() {
        this.running = false;
    }
}
