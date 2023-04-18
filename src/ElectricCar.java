public class ElectricCar extends ACar{
    private final int batteryCapacity;
    private final int maxRange;

    protected ElectricCar(String make, String model, int numberOfDoors, String registrationNumber, int batteryCapacity, int maxRange) {
        super(make, model, numberOfDoors, registrationNumber);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    @Override
    public int getRegistrationFee() {
        double kmPrLitre = 100/(getWhPrKm()/91.25);
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
    public int getBatteryCapacityKWh(){
        return batteryCapacity;
    }
    public int getMaxRangeKm(){
        return maxRange;
    }
    public int getWhPrKm(){
        return batteryCapacity/maxRange;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("********\n");
        sb.append("Electric car\n");
        sb.append(super.toString());
        sb.append("Battery capacity:" + batteryCapacity + "Wh\n");
        sb.append("Max range:" + maxRange + "\n");
        return sb.toString();
    }
}
