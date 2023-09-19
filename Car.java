package JavaProject2;
//11. Create a Class Car that would have the following fields: carPrice and
//color and method calculateSalePrice() which should be returning a
//price of the car.
//Create 2 sub classes: Sedan and Truck. The Truck class has a field
//as weight and has its own implementation of calculateSalePrice()
//method in which returned price is calculated as following: if
//weight>2000 then returned price car should include 10% discount,
//otherwise 20% discount.
//The Sedan class has field as length and also does it is own
//implementation of calculateSalePrice(): if length of sedan is >20 feet
//then returned car price should include 5% discount, otherwise 10%
//discount

public class Car {
    private double carPrice;
    private String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;

    }

    public double calculateSalePrice() {

        return carPrice;
    }

    static class Sedan extends Car {
        private double length;

        public Sedan(double carPrice, String color, double length) {
            super(carPrice, color);
            this.length = length;
        }

        @Override
        public double calculateSalePrice() {
            if (length > 20) {
                // Apply 5% discount for sedans with length > 20 feet
                return super.calculateSalePrice() * 0.95;
            } else {
                // Apply 10% discount for sedans with length <= 20 feet
                return super.calculateSalePrice() * 0.90;
            }
        }
    }

    static class Truck extends Car {
        private double weight;

        public Truck(double carPrice, String color, double weight) {
            super(carPrice, color);
            this.weight = weight;
        }

        @Override
        public double calculateSalePrice() {
            if (weight > 2000) {
                // Apply 10% discount for trucks with weight > 2000
                return super.calculateSalePrice() * 0.90;
            } else {
                // Apply 20% discount for trucks with weight <= 2000
                return super.calculateSalePrice() * 0.80;
            }
        }


    }

    public static void main(String[] args) {
        Car car1 = new Truck(25000, "Red", 2200);
        Car car2= new Sedan(30000, "Blue", 18);

        System.out.println("Car 1 Sale Price: $" + car1.calculateSalePrice());
        System.out.println("Car 2 Sale Price: $" + car2.calculateSalePrice());

    }
}