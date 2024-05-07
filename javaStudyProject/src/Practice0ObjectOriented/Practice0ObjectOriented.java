package Practice0ObjectOriented;

public class Practice0ObjectOriented {
    public static void main(String[] args){
        //创建两个对象
        ResourcePractice0ObjectOriented role1 = new ResourcePractice0ObjectOriented("张三",100);
        ResourcePractice0ObjectOriented role2 = new ResourcePractice0ObjectOriented("李四",100);

        //开始游戏
        while(true){
            role1.attack(role2);
            //判断role2的血量
            if(role2.getBlood() == 0) {
                System.out.println(role1.getName()+"win");
                break;
            }
            role2.attack(role1);
            if(role1.getBlood() == 0) {
                System.out.println(role2.getName()+"win");
                break;
            }
        }
        }
    }

