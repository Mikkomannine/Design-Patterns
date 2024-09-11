package WeatherStation;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        WeatherObserver observer1 = new Observer("Observer 1");
        WeatherObserver observer2 = new Observer("Observer 2");
        WeatherObserver observer3 = new Observer("Observer 3");

        weatherStation.addObserver(observer1);
        weatherStation.addObserver(observer2);
        weatherStation.addObserver(observer3);

        Thread weatherThread = new Thread(weatherStation);
        weatherThread.start();

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Removing Observer 2");
        weatherStation.removeObserver(observer2);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        weatherStation.stop();
        try {
            weatherThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
