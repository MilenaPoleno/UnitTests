package unittests.HW2.Test;
import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.InstanceOfAssertFactories.MATCHER;

public class VehicleTest {
    @Test
    void checkObjectCarIsInstanceOfVehile() {
        Car ford = new Car("Ford", "Focus", 2023);
        assertThat(ford).isInstanceOf(Vehicle.class);

    }

    @Test
    void checkObjectCarHaveFourWheels() {
        Car volvo = new Car("Volvo", "XC90", 2022);
        assertThat(volvo.getNumWheels()).isEqualTo(4);

    }

    @Test
    void checkObjectMotorcycleHaveTwoWheels() {
        Motorcycle harleyDavidson = new Motorcycle("Harley-Davidson", "V-Rod", 2023);
        assertThat(harleyDavidson.getNumWheels()).isEqualTo(2);
    }

    @Test
    void checkObjectCarCanAccelerateTo60kmphInTestDrive() {
        Car toyota = new Car("Toyota", "Camry", 2019);
        toyota.testDrive();
        assertThat(toyota.getSpeed()).isEqualTo(60);

    }

    @Test
    void checkObjectMotorcyclerCanAccelerateTo75kmphInTestDrive() {
        Motorcycle honda = new Motorcycle("Honda", "CBR1000RR Fireblad", 2023);
        honda.testDrive();
        assertThat(honda.getSpeed()).isEqualTo(75);
    }

    @Test
    void checkObjectCarHaveZeroSpeedInParckingMode() {
        Car uaz = new Car("УАЗ", "Буханка", 1986);
        uaz.testDrive();
        uaz.park();
        assertThat(uaz.getSpeed()).isEqualTo(0);

    }

    @Test
    void checkObjectMotorcycleHaveZeroSpeedInParckingMode() {
        Motorcycle jawa = new Motorcycle("Jawa", "350", 2020);
        jawa.testDrive();
        jawa.park();
        assertThat(jawa.getSpeed()).isEqualTo(0);
    }
    
}
