public class Car extends Vehicle{

    public int numberOfDoors;
    public double carPrice;

    public Car( String type, int numberOfWheels, int numberOfDoors, double carPrice ){
        this.type=type;
        this.numberOfWheels=numberOfWheels;
        this.numberOfDoors=numberOfDoors;
        this.carPrice=carPrice;
    }



    @Override
    public void showVehicleDetails(){
        super.showVehicleDetails();
        System.out.println("Vehicle with " + numberOfDoors + " doors.");

    }
    @Override
    public void doVehicleSound(){
        System.out.println("brummmm");

    }
}
