public class CarUtils {

    public static String getCarDetails(Car car) {
//        String make = car.getMake();
//        String model  = car.getModel();
//        String year = car.getYear();

        if (car.getMake() == null || car.getModel() == null || car.getYear() == null || car.getColor() == null) {
            return "Not able to provide details";
        }

        return  String.format("%s %s %s %s", car.getColor(), car.getYear(), car.getMake(), car.getModel());

    }

//    In CarUtils, write a static void method called addToMileage. This method takes in a car object and a double
//    'mileageToAdd'. The method will set the car's mileage to be equal to the current mileage + the mileageToAdd
//    Then, write a test, following Arrange/Act/Assert which tests whether the new mileage was correctly added.
//    You will probably call car.getMileage in your assertion and compare it to what you expect.

    public static void addToMileage(Car car, double mileageToAdd) {
        car.setMileage(car.getMileage() + mileageToAdd);
    }

//    In CarUtils, write a static void method called convertToElectric. It takes in a car object and a String 'engineType.'
//    If the string includes the word 'electric' anywhere inside, then set the car's isElectric value to be true. You
//    will use setElectric() to do that.
//    Then, write a test following Arrange/Act/Assert which tests convertToElectric on whether the car's isElectric field
//    was set when 'electric' is present in the engineType string.
//    Then, write a test to make sure that convertToElectric will set the car's isElectric field regardless of how the
//    string with 'electric' is capitalized.
//    For BOTH of these tests, you will use assertTrue or assertFalse to see if car.isElectric is true or false.
//    Be sure to look at the curriculum on how to use those methods!

    public static void convertToElectric(Car car, String engineType) {
        if (engineType.toLowerCase().contains("electric")) {
            car.setElectric(true);
        }
    }

}
