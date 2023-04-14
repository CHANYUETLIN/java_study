package Student_lei;

public class Student {
    // 成员变量
    String name;
    // 一个私有的成员变量
    private int age;

    // private提供get和set方法
    public void setAge(int a){
        if(a<0){
            System.out.println("年龄不可小于0");
            return;
        }
        age = a;
    }
    public int getAge(){
        return age;
    }

    // 成员方法
    public void doHomeWork(){
        System.out.println(name + "年龄" + age);
    }

    // 我们不应该直接使用n或者什么其他没有语义的字母或字符来给值，比如名字name,我们的私有name应该是
    public void setName(String name){
//        name = name; // 但是这样会导致两个name都拿的是这个String name的局部变量
        // 所以我们需要一个this
        this.name = name; // this指代的就是成员变量

    }

}
