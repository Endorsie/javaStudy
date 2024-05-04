package top.endorsie;

public class Study4Method {
    public static void main(String[] args){
        /*
        方法定义：
        public static 返回值类型 方法名(参数){
        方法体;
        return 返回值;
        }
        */

        //方法的重组：不同的方法可以取同一个名字，但形参不能一样(个数，类型，顺序)

        //方法的值传递
        int num = 100;
        System.out.println(num);
        change(num);
        System.out.println(num);
        //其中函数change中形参num是局部变量，即即使num如何改变，都不会影响到main方法中的num变量
        //而且方法change中形参可以随意命名，无需与全局变量名字相同，仅需在方法内部保持一致即可

        //值传递和址传递
        int[] arr = {1,2,3,4,5};
        change(arr);
        /*方法运行在栈内存，数组保存在堆内存，传入方法的是地址，则方法在堆内存内修改数组数据
        当方法运行结束，堆内存内的数组数据保留，而栈内存内的方法内的地址数据销毁
        所以在方法内改变在堆内存的数组数据成功*/
        System.out.println(arr[1]);

        //抽取方法内代码快捷键:Alt+Control+M，可快捷替换类中相似的代码
        getPrintln(arr);

        String s = "kdsajdiashduiahduiahduisudagiud";
        int length = s.length();    //获得字符串的长度
        String Upper = s.toUpperCase(); //改大写
        System.out.println(length + Upper);

        }

//抽取一次
    private static void getPrintln(int[] arr) {
        extracted(arr[1]);
    }

//抽取两次
    private static void extracted(int arr) {
        System.out.println(arr);
    }

    public static int change(int number){
        number = 2000;
        return number;
    }

    public static void change(int[] array){
        array[0]=1000;
    }
}
