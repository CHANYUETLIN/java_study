package Student_lei;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();

        s.name = "cyl";
//        s.age=18;

        // 私有的成员变量需要用get、set方法来调用
        s.setAge(30);
        s.doHomeWork();
        System.out.println(s.getAge() + "直接在类中调用get方法也可以");
    }
}
