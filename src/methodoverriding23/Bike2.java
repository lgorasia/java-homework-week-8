package methodoverriding23;
// Creating child class
class Bike2 extends Vehicle {
    // defining same method as in the parent class
    public void run(){
        System.out.println("Bike is runnign safely");
    }

    public static void main(String[] args) {
        Bike2 obj = new Bike2();// Creating object
        obj.run(); // Calling method

    }
}
