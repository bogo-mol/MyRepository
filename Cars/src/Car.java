import java.util.Random;

public class Car {
    private String brand;
    private int speed;
    private int coast;

    public Car(String brand, int speed, int coast) {
        setBrand(brand);
        setSpeed(speed);
        setCoast(coast);
    }

    public Car() {
    }

    public void start() throws MyError {
        Random random = new Random();
        int number = random.nextInt(21);
        System.out.println(number + " - случайное число.");
        System.out.println(getBrand() + ", " + getSpeed() + " км/ч, " + getCoast() + " $");
        if (number % 2 == 0) {
            throw new MyError();

        } else {
            System.out.println("Машина завелась");
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCoast() {
        return coast;
    }

    public void setCoast(int coast) {
        this.coast = coast;
    }
}