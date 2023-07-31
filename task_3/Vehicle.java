package task_3;

public class Vehicle {
    public int coordinate;
    public double price;
    public double speed;
    public int year;

    public Vehicle (int coordinate, double price, double speed, int year){
        this.coordinate = coordinate;
        this.price = price;
        this.speed = speed;
        this.year = year;

    }

    public void show() {
        System.out.println("Координаты: " + coordinate);
        System.out.println("Цена: " + price);
        System.out.println("Скорость: " + speed);
        System.out.println("Год выпуска: " + year);
    }

}
