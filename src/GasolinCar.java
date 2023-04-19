public class GasolinCar extends AFuelCar{

    public GasolinCar(String make, String model, int numberOfDoors, String registrationNumber, int kmPrLitre) {
        super(make, model, numberOfDoors, kmPrLitre, registrationNumber);
    }

    @Override
    public String getFuelType() {
        return "Gasolin";
    }

    @Override
    public String toString() {

        return "********\nGasolin car\n" + super.toString();
    }
}