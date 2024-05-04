package top.endorsie;

import java.util.Scanner;

public class Study1Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What noodles you want to eat:\n1 is 1 and 2 is 2");
        int noodles = sc.nextInt();
        switch(noodles){
            case 1:
                System.out.println("That is ok!");
                break;
            case 2:
                System.out.println("No,you cant");
                break;
            default:
                System.out.println("This is over.We can go to sleep earlier");
        }
    }
}
