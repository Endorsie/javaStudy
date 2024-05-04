package top.endorsie;

import java.util.Random;

public class Study6Encapsulation {
//  封装原则：对象代表什么，就得封装对应的数据，并提供数据对应的行为

    /*
    关键字——private：
    1.权限修饰符
    2.可以修饰成员(成员变量和成员方法)
    3.被private修饰的成员只能在本类中才能访问
    */
    private int test;
    private int demo = 1; //在类中所有的属性都要加上private来防止外部访问
    //同时每个属性都要提供public的get(获取)和set(赋值)方法
    public void setDemo(int outDemo){
        demo = outDemo;
    }
    public int getDemo(){
        return demo;
    }
    public void thisDemo(){
        int demo = 10;
        System.out.println(this.demo);  //添加this关键字，使其指向全局变量
    }

    public static void main(String[] args){
        //创造对象
        Study6Encapsulation demo0 = new Study6Encapsulation();
        Random rand = new Random();
//        demo0.setDemo(rand.nextInt(10));    //赋随机值
//        System.out.println(demo0.getDemo());       //读值

        //this关键字的用法：
        demo0.thisDemo();

        //创造对象
        Study6Encapsulation test0 = new Study6Encapsulation(5);
        //每创造一次对象，都会执行一次构造
    }
    /*
    构造方法:
    格式：
    public class 类名{                        1.方法名与类名相同，大小写也要一致
        修饰符 类名(参数) {                    2.没有返回值类型，连void都没有
           方法体;                            3.没有具体返回值，同时也不能使用return
        }
    }
    */
    //空参构造
    //public Study6Encapsulation(){}
    //带参数的构造
    public Study6Encapsulation(int demo){
        System.out.println("参执行"+demo);
    }
    //若类中没有写任何的构造方法，则虚拟机会自动加上一个空参构造
    public Study6Encapsulation(){
        System.out.println("空测试"+this.demo);
    }
    //  标准JavaBean规则：成员变量用private修饰，提供至少两个构造方法，每个成员方法提供对应的set和get
}
