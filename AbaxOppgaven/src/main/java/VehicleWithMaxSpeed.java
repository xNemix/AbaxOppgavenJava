public abstract class VehicleWithMaxSpeed extends Vehicle{
    protected int MaSpeed;
    protected String SpeedUnit;


    protected VehicleWithMaxSpeed(String regNo, int effect, int maxSpeed, String speedUnit) {
        super(regNo, effect);
        MaSpeed = maxSpeed;
        SpeedUnit = speedUnit;
    }


    public void PrintVehicleInformation(){
        super.PrintVehicleInformation();
        System.out.printf(" - Max-Speed. = %s%s\n", getMaSpeed(), getSpeedUnit());
    }


    protected String getSpeedUnit() {
        return SpeedUnit;
    }

    protected int getMaSpeed() {
        return MaSpeed;
    }


}
