package top.endorsie;

public class Study5ObjectOriented {

    //属性(成员变量)
    String brand;
    double price;

    //行为(成员方法)
    public void display(){}
    public void play(){}

    public static void main(String[] args){
        /*
        定义类：
        public class 类名 {
        1.成员变量(属性)
        2.成员方法(行为)
        }
        */
        //类名首字母要大写

        //创造对象: 类名 对象名 = new 类名()
        Study5ObjectOriented test0 = new Study5ObjectOriented();
        Study5ObjectOriented test1 = new Study5ObjectOriented();

        //使用对象
        test0.brand = "0";
        System.out.println(test0.brand); //访问属性
        System.out.println(test1.brand);
        test0.display(); //访问行为

        //用来描述一类事物的类，专称JavaBean类；在javaBean中，是不写main方法的
        //带main的类叫测试类
    }
}


