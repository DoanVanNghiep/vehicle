package vehicle.test;

import vehicle.Vehicles;
import vehicle.car.Car;
import vehicle.truck.Truck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {

    private static List<Vehicles> vehicles = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        do {
            System.out.println("1. Input");
            System.out.println("2. Display");
            System.out.println("3. Sort by price");
            System.out.println("4. Search by model");
            System.out.println("5. Exit");
            System.out.print("Your choice:");
            x = sc.nextInt();
            switch (x){
                case 1:
                    input(vehicles);
                    System.out.println("Saved to the system!");
                    break;
                case 2:
                    display(vehicles);
                    break;
                case 3:
                    sortByPrice(vehicles);
                    break;
                case 4:
                    searchByModel(vehicles);
                    break;
                default:
                    System.out.println(" Exit successfully!");
                    sc.close();
                    break;
            }
        }while (x!=5);System.out.println("Không tìm thấy chức năng trên. xin nhập lại!");
    }

    static void input(List<Vehicles> vehicles){
        System.out.println("Input 3 car:");
        for (int i = 0; i < 3; i++) {
            Car car = new Car();
            car.input();
            vehicles.add(car);
        }
        System.out.println("Input 3 truck:");
        for (int i = 0; i < 3; i++) {
            Truck truck = new Truck();
            truck.input();
            vehicles.add(truck);
        }
    }
    static void display(List<Vehicles> vehicles){
        for (int i = 0; i < vehicles.size(); i++) {
            vehicles.get(i).display();
        }
    }
    static void sortByPrice(List<Vehicles> vehicles){
        System.out.println(" Trước sắp xếp:");
        vehicles.forEach(Vehicles ::display);
        System.out.println(" Sau khi sắp xếp:");
        vehicles.sort((x,y) -> (int) (x.getPrice()-y.getPrice()));
        vehicles.forEach(Vehicles ::display);
    }
    static void searchByModel(List<Vehicles> vehicles){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào Model cần tìm kiếm:");
        String searchModel = sc.nextLine();

        boolean search = false;
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getModel().equals(searchModel)) {
                search = true;
                vehicles.get(i).display();
                break;
            }
        }
        if(search = false) System.out.println("Không tìm thấy!");
    }
}
