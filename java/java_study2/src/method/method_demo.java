package method;

public class method_demo {
    public static void main(String[] args){
        // main方法是程序的入口方法，在main里面调用
        isEvenNumber();
        int num = 10;
        isEvenNumber1(num);
        getMax(2,10);
        isReturn(); // 啥都没输出
        boolean flag = isReturn();
        System.out.println(flag); // 输出true

//        int[] arr = new int[3];
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,2,3,4};
        compareArr(arr1,arr2);
        System.out.println("----------");
        reverse();

    }
    // 定义一个方法，在方法中定义一个变量，判断该变量是否是一个偶数
    public static void isEvenNumber(){
        // 定义变量
        int num = 10;
        // 判断该数据是否是偶数
        if(num%2 == 0){
            System.out.println("是偶数");
        }else{
            System.out.println("不是偶数");
        }
    }
    public static void isEvenNumber1(int number){
        if(number%2 == 0){
            System.out.println("是偶数");
        }else{
            System.out.println("不是偶数");
        }
    }
    public static void getMax(int num1,int num2){
        if(num1>num2){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }
    }
    public static boolean isReturn(){
        return true;
    }
    // 比较数组中是否有相同的元素
    public static boolean compareArr(int[] arr,int[] arr2){
        if(arr.length != arr2.length){
            return false;
        }
        for (int i=0;i<arr.length;i++){
            if(arr[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
    // 定义两个变量，遍历数组并反转数组
    public static void reverse(){
        int[] arr = {1,2,3,4,5};
        for(int start=0,end=arr.length-1;start<=end;start++,end--){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"arr的值是多少？");
        }
    }
}
