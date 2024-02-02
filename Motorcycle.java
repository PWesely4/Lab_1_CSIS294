public class Motorcycle extends MotorVehicle{
    public boolean hasWindshield;

    public void start() {
        running = true;
        System.out.println("The vehicle is running");
        System.out.println("The vehicle is " + color);
        System.out.println("The vehicle is a Motorcycle");
        System.out.println("The vehicle has been started");
    }

    public void stop() {
        running = false;
        System.out.println("The vehicle is not running");
        System.out.println("The vehicle is " + color);
        System.out.println("The vehicle is a Motorcycle");
        System.out.println("The vehicle has been stopped");
    }
}
