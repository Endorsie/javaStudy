package Practice0ObjectOriented;

import java.util.Random;

public class ResourcePractice0ObjectOriented {
    private String name;
    private int blood;
//Alt+Insert空参
    public ResourcePractice0ObjectOriented() {}
//Alt+Insert全参
    public ResourcePractice0ObjectOriented(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }
    //get and set
    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //定义方法to攻击，who to who，role1.attack(role2),方法的调用者去攻击参数
    //this关键字就表示方法的调用者,方法的调用者就是所属对象
    //如果要使用其他类里的变量或者方法作为参数，就需要使用格式：类名 变量
    //在这里，类名就是作为一个数据类型来使用
    public void attack(ResourcePractice0ObjectOriented role){
        Random rand = new Random();
        int hurt = rand.nextInt(20)+1;
        int afterBlood = role.getBlood() - hurt;
        afterBlood = afterBlood<=0 ? 0:afterBlood; //检验血量是否小于0
        role.setBlood(afterBlood);
        System.out.println(this.getName()+"attack"+role.getName()+"造成了"+hurt+"的伤害，"+role.getName()+"还剩下"+afterBlood+"点血");
    }
}
