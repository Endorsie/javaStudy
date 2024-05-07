package Practice2ObjectOriented;

import java.util.Scanner;

public class Practice2ObjectOriented {
    public static void main(String[] args) {
        //创建对象
        ResourcePractice2ObjectOriented car1 = new ResourcePractice2ObjectOriented();
        ResourcePractice2ObjectOriented car2 = new ResourcePractice2ObjectOriented();
        ResourcePractice2ObjectOriented car3 = new ResourcePractice2ObjectOriented();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the brand of the car: ");
        car1.setBrand(sc.nextLine());

        System.out.println("Enter the price of the car: ");
        car1.setPrice(sc.nextLine());

        System.out.println("Enter the color of the car: ");
        car1.setColor(sc.nextLine());

        System.out.println("Enter the brand of the car: ");
        car2.setBrand(sc.nextLine());

        System.out.println("Enter the price of the car: ");
        car2.setPrice(sc.nextLine());

        System.out.println("Enter the color of the car: ");
        car2.setColor(sc.nextLine());

        System.out.println("Enter the brand of the car: ");
        car3.setBrand(sc.nextLine());

        System.out.println("Enter the price of the car: ");
        car3.setPrice(sc.nextLine());

        System.out.println("Enter the color of the car: ");
        car3.setColor(sc.nextLine());

        System.out.println(car1.getBrand());
        System.out.println(car1.getPrice());
        System.out.println(car1.getColor());

        System.out.println(car2.getBrand());
        System.out.println(car2.getPrice());
        System.out.println(car2.getColor());

        System.out.println(car3.getBrand());
        System.out.println(car3.getPrice());
        System.out.println(car3.getColor());

    }
}
