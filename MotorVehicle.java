import java.util.Scanner;
public class MotorVehicle {
    public boolean running;
    public String color;

    Car[] aCar = new Car[3];

    Motorcycle[] aMotorcycle = new Motorcycle[3];

    public void run() {
        Scanner scnr = new Scanner(System.in);  // Create a Scanner object

        //instantiate Car objects
        Car Car1 = new Car();
        Car Car2 = new Car();
        Car Car3 = new Car();

        //instantiate Motorcycle objects
        Motorcycle Motorcycle1 = new Motorcycle();
        Motorcycle Motorcycle2 = new Motorcycle();
        Motorcycle Motorcycle3 = new Motorcycle();

        //Set Car running variables to default
        Car1.running = false;
        Car1.color = "green";
        Car1.doorCount = 2;
        Car2.running = false;
        Car3.color = "yellow";
        Car2.doorCount = 4;
        Car3.running = false;
        Car3.color = "red";
        Car3.doorCount = 4;

        //Set Motorcycle running variables to default
        Motorcycle1.running = false;
        Motorcycle1.color = "purple";
        Motorcycle1.hasWindshield = true;
        Motorcycle2.running = false;
        Motorcycle2.color = "orange";
        Motorcycle2.hasWindshield = false;
        Motorcycle3.running = false;
        Motorcycle3.color = "blue";
        Motorcycle3.hasWindshield = false;

        //Add car objects to previous array Car[]
        aCar[0] = Car1;
        aCar[1] = Car2;
        aCar[2] = Car3;

        //Add Motorcycle objects to previous array Motorcycle[]
        aMotorcycle[0] = Motorcycle1;
        aMotorcycle[1] = Motorcycle2;
        aMotorcycle[2] = Motorcycle3;

        System.out.println("Pick a number to start a car");
        System.out.println("1. Car1, 2. Car2, 3. Car3");
        int userNum = scnr.nextInt();
        userNum--;
        System.out.println(userNum);
    }
}
