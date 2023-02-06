public class Car extends VehicleWithMaxSpeed{

    private String VehicleColor;
    private boolean VehicleType;


    public Car(String regNo, int effect, int maxSpeed, String vehicleColor, boolean vehicleType) {
        super(regNo, effect, maxSpeed, "km/t");
        VehicleColor = vehicleColor;
        VehicleType = vehicleType;
    }

    public void PrintVehicleInformation(){
        System.out.println("*** CAR ***");
        super.PrintVehicleInformation();
        System.out.printf(" - Color = %s\n", getVehicleColor());
        var vehicleTypeTxt = getVehicleType() ? " Light Vehicle": " Heavy Vehicle";
        System.out.printf(" - Vehicle Type. = %s\n", vehicleTypeTxt);
    }

    @Override
    public void Run() {
        System.out.println("The car is driving\n");
    }


    public String getVehicleColor() {
        return VehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        VehicleColor = vehicleColor;
    }

    public boolean getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(boolean vehicleType) {
        VehicleType = vehicleType;
    }
}
