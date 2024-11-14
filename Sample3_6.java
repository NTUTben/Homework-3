
public class Sample3_6 {
    public static void main(String[] args) {
        Car car1;
        car1 = new Car();

        car1.setNum(1234); // 傳遞引數1234來呼叫setNum方法
        car1.setGas(20.5); // 傳遞引數20.5來呼叫setGas方法
    }
}

// Car類別
class Car {
    int num;
    double gas;

    void setNum(int n) { // 確認這個方法存在並符合簽章
        num = n;
        System.out.println("將車號設為 " + num);
    }

    void setGas(double g) {
        gas = g;
        System.out.println("將汽油量設為 " + gas);
    }
}
