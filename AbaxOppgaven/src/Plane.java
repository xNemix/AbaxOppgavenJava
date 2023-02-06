public class Plane extends Vehicle{

    private int WingSpan;
    private int LoadCapacity;
    private int Weight;

    public Plane(String regNo, int effect, int wingSpan, int loadCapacity, int weight) {
        super(regNo, effect);
        WingSpan = wingSpan;
        LoadCapacity = loadCapacity;
        Weight = weight;
    }

    public void PrintVehicleInformation(){
        System.out.println("*** Plane ***");
        super.PrintVehicleInformation();
        System.out.printf(" - Wingspan. = %sm\n", getWingSpan());
        System.out.printf(" - Load Capacity. = %s tonn\n", getLoadCapacity());
        System.out.printf(" - Weight. = %s tonn\n", getWeight());
    }

    @Override
    protected void Run() {
        System.out.println("The plane is flying\n");
    }

    public int getWingSpan() {
        return WingSpan;
    }

    public void setWingSpan(int wingSpan) {
        WingSpan = wingSpan;
    }

    public int getLoadCapacity() {
        return LoadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        LoadCapacity = loadCapacity;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }
}
