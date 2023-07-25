package vehicle.truck;

import vehicle.Vehicles;

import java.util.Scanner;

public class Truck extends Vehicles {
    private int truckload;

    @Override
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" input truck:");
        super.input();
        System.out.print(" input truckload:");
        truckload = Integer.parseInt(sc.nextLine());

    }

    @Override
    public void display(){
        super.display();
        System.out.println(" " + truckload);
    }
}
