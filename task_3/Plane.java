package task_3;

public class Plane extends Vehicle {
    public double height;
    public int passengers_plane;

    public Plane(int coordinate, double price, double speed, int year, double height, int passengers_plane) {
        super(coordinate, price, speed, year);
        this.height = height;
        this.passengers_plane = passengers_plane;
    }

        @Override
        public void show() {
            super.show();
            System.out.println("Высота: " + height);
            System.out.println("Количество пассажиров на самолете: " + passengers_plane);
        }

    }



