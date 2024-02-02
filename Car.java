public class Car extends MotorVehicle{
    public int doorCount;

    public void start() {
        running = true;
        System.out.println("The vehicle is running");
        System.out.println("The vehicle is " + color);
        System.out.println("The vehicle is a Car");
        System.out.println("The vehicle has been started");
    }

    public void stop() {
        running = false;
        System.out.println("The vehicle is not running");
        System.out.println("The vehicle is " + color);
        System.out.println("The vehicle is a Car");
        System.out.println("The vehicle has been stopped");
    }
}
