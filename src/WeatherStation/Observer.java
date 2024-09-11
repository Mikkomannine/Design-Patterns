package WeatherStation;

public class Observer implements WeatherObserver {
    private String observerName;

    public Observer(String name) {
        this.observerName = name;
    }

    @Override
    public void update(int temperature) {
        System.out.println(observerName + "temperature update: " + temperature + " celsius");
    }
}
