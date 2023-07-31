package task_3;

public class Ship extends Vehicle {
    public int passengers_ship;
    public int home_port;

    public Ship(int coordinate, double price, double speed, int year, int passengers_ship, int home_port) {
        super(coordinate, price, speed, year);
        this.passengers_ship = passengers_ship;
        this.home_port = home_port;
    }

    @Override

    public void show() {
        super.show();
        System.out.println("Количество пассажиров на корабле: " +passengers_ship);
        System.out.println("Номер порта: " + home_port);
    }
}
