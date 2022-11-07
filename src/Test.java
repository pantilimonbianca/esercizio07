public class Test {
    public static void main(String[] args) {

        Car mustang= new Car("Car", 4,5,6470.0);
        Boat motoscafo=new Boat("Boat",320.0,475);

        mustang.doVehicleSound();
        mustang.showVehicleDetails();

        motoscafo.doVehicleSound();
        motoscafo.getBoatWeightAndSpeed();
        motoscafo.showVehicleDetails();
    }
}
