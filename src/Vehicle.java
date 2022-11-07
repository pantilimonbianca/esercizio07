public abstract class Vehicle {

    public String type;
    public int numberOfWheels;


    public void showVehicleDetails(){
        System.out.println("Vehicle type: " + type + "\nNumber of wheels: " + numberOfWheels);

    }

    public abstract void doVehicleSound();

}
