public class Vehicle {
    private double fuel;  // Түлшний хэмжээ литрээр

    // Конструктор
    public Vehicle(double initialFuel) {
        this.fuel = initialFuel;
    }

    // Түлш нэмэх функц
    public void refuel(double amount) {
        if (amount > 0) {
            fuel += amount;
            System.out.println(amount + " литр түлш нэмлээ. Одоо түлш: " + fuel + " литр.");
        } else {
            System.out.println("Түлш нэмэх хэмжээ эерэг байх ёстой.");
        }
    }

    // Түлшний одоогийн хэмжээг авах функц
    public double getFuel() {
        return fuel;
    }

    // Гол програм - туршилт
    public static void main(String[] args) {
        Vehicle car = new Vehicle(10);  // 10 литр түлштэй машин үүсгэв
        car.refuel(5);                  // 5 литр түлш нэмэв
        System.out.println("Одоо түлш: " + car.getFuel() + " литр байна.");
    }
}
