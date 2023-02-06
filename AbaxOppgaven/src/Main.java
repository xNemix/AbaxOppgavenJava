public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("LJ1231", 147, 200, "Green", true);
        myCar.PrintVehicleInformation();
        myCar.Run();

        Boat myBoat = new Boat("123LJ",100,30,500);
        myBoat.PrintVehicleInformation();
        myBoat.Run();

        Plane myPlane = new Plane("LN1234",1000,30,2,10);
        myPlane.PrintVehicleInformation();
        myPlane.Run();
    }
}