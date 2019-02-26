package lesson03;

public abstract class Car {
    String manufacturer;
    int year;
    String color;
    private Engine engine;

    public Car(String manufacturer, int year, String color) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
    }

    public Car(String manufacturer, int year, String color, Engine engine) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
        this.engine = engine;
    }

    protected abstract String getName();

    public void gas(){
        engine.startEngine();
        System.out.println(getName() + " started to move");
    }

    public void stop(){
        engine.stopEngine();
        System.out.println(getName() + " stopped");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + getName() + '\'' +
                ",manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
