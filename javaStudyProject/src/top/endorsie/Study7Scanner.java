package top.endorsie;

import java.util.Scanner;

public class Study7Scanner {
    public static void main(String[] args) {
        //键盘录入的细节
        Scanner sc = new Scanner(System.in);
        //第一体系：遇到空格，制表符(/t)，和回车就停止接收
        int Int1 = sc.nextInt();            //sc.nextInt()接收整数
        double Double1 = sc.nextDouble();   //sc.nextDouble()接收小数
        String String1 = sc.next();         //sc.next()接收字符串

        //第二体系：
        String String2 = sc.nextLine();     //sc.nextLine()接收字符串
    }
}
