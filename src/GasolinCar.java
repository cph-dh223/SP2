public class GasolinCar extends AFuelCar{


    public GasolinCar(String make, String model, int numberOfDoors, String registrationNumber, int kmPrLitre) {
        super(make, model, numberOfDoors, kmPrLitre, registrationNumber);
    }

    @Override
    public String getFuelType() {
        return "Gasolin";
    }

    @Override
    public int getRegistrationFee() {
        return kmPrLitre >= 20
                ? 330
                : kmPrLitre >= 15
                    ? 1050
                    : kmPrLitre >= 10
                        ? 2340
                        : kmPrLitre >= 5
                            ? 5500
                            : 10479;
    }

    @Override
    public String toString() {

        return "********\nGasolin car\n" + super.toString();
    }
}
