public abstract class ACar implements Car{
    protected String registrationNumber; //The number on the number plate
    protected final String make; // The make of the car e.g. Audi
    protected final String model; // The model of the car e.g. A6
    protected final int numberOfDoors; // The number of doors

    protected ACar(String make, String model, int numberOfDoors) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Make: " + make + "\n");
        sb.append("Model: " + model + "\n");
        sb.append("Number of doors: " + numberOfDoors + "\n");
        sb.append("Registration number: " + registrationNumber + "\n");
        return sb.toString();
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}
