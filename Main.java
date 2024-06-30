public class Main {
    public static void main(String[] args) {
        Car car = new Car("Porshe", "911 Carrera", 2004, 2000, 500);
        Truck truck = new Truck("Ferrari", "Portofino", 2017, 2000, 465, 1664);
        System.out.println("Fuel consumption of car: " + String.format("%.2f", car.calculateFuelEfficiency()));
        System.out.println("Fuel consumption of truck: " + String.format("%.2f", truck.calculateFuelEfficiency()));
    }
}