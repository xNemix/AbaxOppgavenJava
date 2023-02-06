import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {


    @org.junit.jupiter.api.Test
    void getRegNo() {
        Vehicle vehicle = new Car("lj1234", 100,200,"green", true);
        assertEquals("lj1234", vehicle.getRegNo());
    }

    @org.junit.jupiter.api.Test
    void setRegNo() {
        Vehicle vehicle = new Car("lj1234", 100,200,"green", true);
        vehicle.setRegNo("1234lj");
        assertEquals("1234lj", vehicle.getRegNo());
    }

    @org.junit.jupiter.api.Test
    void getEffect() {
        Vehicle vehicle = new Car("lj1234", 100,200,"green", true);
        assertEquals(100, vehicle.getEffect());
    }

    @org.junit.jupiter.api.Test
    void setEffect() {
        Vehicle vehicle = new Car("lj1234", 100,200,"green", true);
        vehicle.setEffect(150);
        assertEquals(150, vehicle.getEffect());
    }
}