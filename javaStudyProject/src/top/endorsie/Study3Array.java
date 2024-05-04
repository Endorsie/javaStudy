package top.endorsie;

public class Study3Array {
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

        //用完整格式来动态初始化
        int [] student = new int [50];

        //二维数组初始化
        //数据类型[][] 数组名 = new 数据类型[][] {{元素1,元素2},{元素1,元素2}}；
        int[][] array2 = new int [][] {{1,2,3,3,5},{5,8,9,85,5,45,4}};      //完整格式
        int[][] array3 = {{1,2,3,5,6,8},{5454,48,4,8,9,9}};                 //简化格式
        //规范格式
        int[][] array4 = {
                {1,2,3,5},
                {2,5,6,9}
        };
        System.out.println(array4[0][2]);

        //二维数组的动态初始化
        int[][] array5 = new int [6][8];
    }
}
