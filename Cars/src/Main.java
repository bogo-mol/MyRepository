public class Main {
    public static void main(String[] args) {
        try {
            Car carOne = new Car("Audi", 300, 20000);
            carOne.start();
        } catch (MyError myError) {
            System.out.println(myError.getMessage());
        }
        System.out.println();
        try {
            Car carTwo = new Car();
            carTwo.setBrand("Ford");
            carTwo.setSpeed(250);
            carTwo.setCoast(15000);
            carTwo.start();
        } catch (MyError myError) {
            System.out.println(myError.getMessage());
        }
    }
}