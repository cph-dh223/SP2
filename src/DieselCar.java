public class DieselCar extends AFuelCar{

    private boolean particleFilter;

    public DieselCar(String make, String model, int numberOfDoors, String registrationNumber, boolean particleFilter, int kmPrLiter) {
        super(make, model, numberOfDoors, kmPrLiter, registrationNumber);
        this.particleFilter = particleFilter;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    @Override
    public int getRegistrationFee() {
        int gasFee = super.getRegistrationFee();
        int filterFee = particleFilter ? 0 : 1000;
        int equalizationTax =
                kmPrLitre >= 20
                    ? 130
                    : kmPrLitre >= 15
                        ? 1390
                        : kmPrLitre >= 10
                            ? 1850
                            : kmPrLitre >= 5
                                ? 2770
                                : 15260;
        return gasFee + filterFee + equalizationTax;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("********\n");
        sb.append("Diesel car\n");
        sb.append(super.toString());
        sb.append(particleFilter ? "Has exhaust filter\n" : "Does not have exhaust filter\n");
        return  sb.toString();
    }
}
