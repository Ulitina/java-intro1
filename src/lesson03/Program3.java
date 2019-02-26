package lesson03;

public class Program3 {
    public static void main(String[] args) {
        Truck truck = new Truck("Renault", 2001, "White", new Engine(5.6));
        PassengerCar passengerCar = new PassengerCar("Daewoo", 2005, "Silver", new Engine(1.2));

        System.out.println(truck);
        System.out.println(passengerCar);

        truck.gas();
        passengerCar.gas();
        passengerCar.climateStop();
        passengerCar.stop();
        truck.climateStop();
        truck.stop();


    }
}
