public class Boat extends VehicleWithMaxSpeed {

    private int GrossTonnage;
    public Boat(String regNo, int effect, int maxSpeed, int grossTonnage) {
        super(regNo, effect, maxSpeed, "knop");
        GrossTonnage = grossTonnage;
    }

    public void PrintVehicleInformation(){
        System.out.println("*** Boat ***");
        super.PrintVehicleInformation();
        System.out.printf(" - Gross Tonnage. = %skg\n", getGrossTonnage());
    }

    @Override
    public void Run() {
        System.out.println("The boat is driving\n");
    }


    public int getGrossTonnage() {
        return GrossTonnage;
    }

}
