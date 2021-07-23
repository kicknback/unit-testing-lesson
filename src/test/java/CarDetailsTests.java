import org.junit.Assert;
import org.junit.Test;

public class CarDetailsTests {

    @Test
    public void getCarDetails_GivenValidCar_returnsExpectedString() {
        // Arrange
        Car car = new Car();
        car.setColor("Gray");
        car.setMake("Ford");
        car.setModel("Mustang");
        car.setYear("2019");

        // Act
        String details = CarUtils.getCarDetails(car);

        // Assert
        Assert.assertEquals("Gray 2019 Ford Mustang", details);
    }

    @Test
    public void getCarDetails_GivenNullValues_ReturnsErrorString() {
        // Arrange
        Car car = new Car();
        // color omitted
        car.setMake("Ford");
        car.setModel(null);
        car.setYear("2019");

        // Act
        String details = CarUtils.getCarDetails(car);

        // Assert
        Assert.assertEquals("Not able to provide details", details);
    }

    @Test
    public void addToMileage_GivenMiles_SetsMileage() {
        // Arrange
        Car car = new Car();
        car.setMileage(78342);

        // Act
        CarUtils.addToMileage(car, 735);

        // Assert
        Assert.assertEquals(car.getMileage(), 79077, 0);
    }

    @Test
    public void convertToElectric_GivenString_SetsBoolean() {
        // Arrange
        Car car = new Car();

        // Act
        CarUtils.convertToElectric(car, "xmr 75 electric");

        // Assert
        Assert.assertTrue("car is electric", car.isElectric());
    }

    @Test
    public void convertToElectric_GivenStringCapsOrNot_SetsBoolean() {
        // Arrange
        Car car = new Car();

        // Act
        CarUtils.convertToElectric(car, "xmr 75 elEcTric");

        // Assert
        Assert.assertTrue("car is electric", car.isElectric());
    }

}
