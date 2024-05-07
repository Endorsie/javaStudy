package top.endorsie;

import java.util.Scanner;

public class Study8String {

    //API:应用程序编程接口，java API就是指JDK中提供的各种java类
    public static void main(String[] args){
        //practice
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println(a);

        //String.字符串的内容在创建对象后不会也不能发生改变
        //String是java定义好的一个类，定义在Java.lang包(核心包)中，所以使用时是不需要导包的
        //java程序中所有字符串文字都视为此类的对象

        //new字符串对象
        //空参
        String b = new String();

        //传递一个字符数组，根据其内容创建一个新的字符串对象
        char[] array = {'2','0','0','5'};
        String c = new String(array);
        System.out.println(c);
    }
}
