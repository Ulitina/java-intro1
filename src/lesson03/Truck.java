package lesson03;

public class Truck extends Car implements Climatable{

    public Truck(String manufacturer, int year, String color) {
        super(manufacturer, year, color);
    }

    public Truck(String manufacturer, int year, String color, Engine engine) {
        super(manufacturer, year, color, engine);
    }

    @Override
    public void climateControle(int tempr) {
        System.out.println("Climate control tries to make temp " + tempr);
    }

    @Override
    public void climateStop() {
        System.out.println("Truck's climate control system is turned off");
    }

    @Override
    protected String getName() {
        return "Truck";
    }
}
