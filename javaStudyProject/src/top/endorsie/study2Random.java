package top.endorsie;

import java.util.Random;
import java.util.Scanner;

public class study2Random {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        // r为变量名

        int random_num = r.nextInt(10)+1;   //直接输数字，bound自动生成
        //范围包括左边但不包括右边。从开头遍历，但不包括结尾

        System.out.println("This is the num : random_num = " + random_num);
        //java中很少有占位符这样的概念，而是以新的格式来代替占位符的作用
    }
}
