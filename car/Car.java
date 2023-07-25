package vehicle.car;

import vehicle.Vehicles;

import java.util.Scanner;

public class Car extends Vehicles {
    private String color;

    @Override
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" input car:");
        super.input();
        System.out.print(" input car color:");
        color = sc.nextLine();
    }

    @Override
    public void display(){
        super.display();
        System.out.println(" " +color);
    }



}
