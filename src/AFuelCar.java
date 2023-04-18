public abstract class AFuelCar extends ACar {
    protected int kmPrLitre;

    public AFuelCar(String make, String model, int numberOfDoors, int kmPrLitre) {
        super(make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    public abstract String getFuelType();
    public int getKmPrLitre(){
        return kmPrLitre;
    }

    @Override
    public String toString() {
        return super.toString()+"km/l: " + kmPrLitre + "\n";
    }
}
