package lesson03;

import lesson02.Person;

public class PassengerCar extends Car implements Climatable{

    private Person[] persones;

    public PassengerCar(String manufacturer, int year, String color) {
        super(manufacturer, year, color);
    }

    public PassengerCar(String manufacturer, int year, String color, Engine engine) {
        super(manufacturer, year, color, engine);
    }

    @Override
    public void climateControle(int tempr) {
        System.out.println("Air condition is trying to make temperature " + tempr);
    }

    @Override
    public void climateStop() {
        System.out.println("Passenger car's climate control system is turned off");
    }

    @Override
    protected String getName() {
        return "Passenger car";
    }
}
