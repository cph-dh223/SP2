import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<Car> fleet = new ArrayList<>();

    public void addCar(Car car) {
        fleet.add(car);
    }
    public int getTotalRegistrationFeeForFleet(){
        int fee = 0;
        for (Car c : fleet) {
            fee +=c.getRegistrationFee();
        }
        return fee;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Car c : fleet) {
            sb.append(c.toString());
        }
        return sb.toString();
    }
}