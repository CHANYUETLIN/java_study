package lei;

public class PhoneDemo {
    // pvsm
    public static void main(String[] args) {
        // 创建对象
        Phone p = new Phone();

        // 使用成员变量
        System.out.println(p.brand);
        System.out.println(p.price);

        // 赋值
        p.brand = "小米";
        p.price = 2999;

        // 成员方法的使用
        p.call();
        p.send();
    }
}
