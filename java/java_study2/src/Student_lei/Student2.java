package Student_lei;

public class Student2 {
    // 成员变量
    private String name;
    // 一个私有的成员变量
    private int age;

    // 构造方法 （如果没有写构造方法，java会自动给一个无参构造方法）
    public Student2(){
        System.out.println("这是一个无参构造方法");
    }
    public Student2(String name){
        System.out.println("这是有参构造方法");
        this.name = name;
    }
    public Student2(String name,int age){
        this.name = name;
        this.age = age;
    }
    // 成员方法
    public void show(){
        System.out.println(name + "," + age);
    }
}
