public class Main {
    public static void main(String[] args) {
        FleetOfCars fleet = new FleetOfCars();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                
                Car c1 = new DieselCar("Audi", "model" + j + "." + i, 2, "" , i == 0, i * 5);
                fleet.addCar(c1);
                Car c2 = new GasolinCar("Masda", "model", 4, "",  i*5);
                fleet.addCar(c2);
            }
        }

        fleet.addCar(new ElectricCar("Tesla", "model1", 2, "", 2000, 1));
        fleet.addCar(new ElectricCar("Tesla", "model2", 2, "", 1000, 1));
        fleet.addCar(new ElectricCar("Tesla", "model3", 2, "", 850, 1));
        fleet.addCar(new ElectricCar("Tesla", "model4", 2, "", 1000, 2));
        fleet.addCar(new ElectricCar("Tesla", "model5", 2, "", 850, 2));

        System.out.println(fleet);
        System.out.println("Fleet cost: " + fleet.getTotalRegistrationFeeForFleet());
    }
}
