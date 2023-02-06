public abstract class Vehicle {
    private String RegNo;
    private int Effect;

    public Vehicle(String regNo, int effect) {
        RegNo = regNo;
        Effect = effect;
    }

    public void PrintVehicleInformation(){
        System.out.printf(" - Reg.nr. = %s\n", getRegNo());
        System.out.printf(" - Effekt = %skw\n", getEffect());
    }

    protected abstract void Run();

    protected String getRegNo() {
        return RegNo;
    }

    protected void setRegNo(String regNo) {
        RegNo = regNo;
    }

    protected int getEffect() {
        return Effect;
    }

    protected void setEffect(int effect) {
        Effect = effect;
    }
}
