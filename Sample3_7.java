public class Sample3_7 {
    public static void main(String[] args) {
        Car car1;
        car1 = new Car();

        int number = 1234;
        double gasoline = 20.5;

        car1.setNumGas(number, gasoline); // 傳遞2個引數來呼叫setNumGas方法
    }
}

// Car類別
class Car {
    int num;
    double gas;

    void setNumGas(int n, double g) { // 這個方法擁有兩個參數
        num = n;
        gas = g;
        System.out.println("將車號設為 " + num + "，汽油量設為 " + gas);
    }

    void show() {
        System.out.println("車號是 " + num);
        System.out.println("汽油量是 " + gas);
    }
}
