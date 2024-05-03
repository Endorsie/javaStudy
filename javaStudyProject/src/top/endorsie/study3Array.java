package top.endorsie;

public class study3Array {
    public static void main(String[] args){
        //完整格式：int [] array0 = new int []{1,2,3,4,5};
        //简化格式：int [] array0 = {}
        String [] array1 = new String [] {"张三","李四"};
        String [] array = {"张三","李四"};

        //访问数组
        System.out.println(array1[0]);
        //java中数组的一个属性——length的调用方式为——数组名.length
        for(int i=0;i<array1.length;i++){
            System.out.println(array1[i]);
        }
        //动态初始化
    }
}
