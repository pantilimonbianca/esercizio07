public class Boat extends Vehicle{

    public double maxKnotSpeed;
    public int boatKiloWeight;

    public Boat(String type, double maxKnotSpeed, int boatKiloWeight){
        this.type=type;
        this.maxKnotSpeed=maxKnotSpeed;
        this.boatKiloWeight=boatKiloWeight;

    }


    @Override
    public void doVehicleSound() {
        System.out.println("vrummmm");
    }

    public void getBoatWeightAndSpeed(){
        System.out.println("Total kilos weight: " + boatKiloWeight + "\nMaximum knots speed: " + maxKnotSpeed);
    }

}
