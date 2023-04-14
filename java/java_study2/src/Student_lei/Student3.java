package Student_lei;

/*
* 标准类的创建
* */
public class Student3 {
    // 成员变量
    private String name;
    private int age;

    // 构造方法
    public Student3(){

    }

    public Student3(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void show(){
        System.out.println("名字："+name+"年龄："+age);
    }
}
