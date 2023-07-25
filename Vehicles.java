package vehicle;

import java.util.Scanner;

public class Vehicles implements IVehicle {
    String maker;
    String model;
    double price;

    public String getMaker() {
        return maker;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Vehicles() {}

    public Vehicles(String maker, String model, double price) {
        this.maker = maker;
        this.model = model;
        this.price = price;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input maker:");
        maker = sc.nextLine();

        System.out.print("Input model:");
        model = sc.nextLine();

        System.out.print("Input price:");
        price = Double.parseDouble(sc.nextLine());

    }

    @Override
    public void display() {
        System.out.println(" " +maker+" "+model+" "+price);
    }
}
