package singleton;

public class CarFactory {

    private static CarFactory carFactory = new CarFactory();
    private CarFactory() {}

    public static CarFactory getCarFactory() {
        if(carFactory == null) {
            carFactory = new CarFactory();
        }
        return carFactory;
    }

    public Car createCar() {

        Car car = new Car();
        return car;
    }
}
