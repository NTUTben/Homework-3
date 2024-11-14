public class Sample3_8 {
    public static void main(String[] args) {
        Car car1;
        car1 = new Car();

        car1.setNumGas(1234, 20.5);

        int number = car1.getNum();
        double gasoline = car1.getGas();

        System.out.println("調查樣品車時得知");
        System.out.println("車號是 " + number + "，汽油量是 " + gasoline);
    }
}

// Car類別
class Car {
    int num;
    double gas;

    int getNum() { // 有回傳值的方法，回傳型別為 int
        System.out.println("調查車號");
        return num;
    }

    double getGas() { // 有回傳值的方法，回傳型別為 double
        System.out.println("調查汽油量");
        return gas;
    }

    void setNumGas(int n, double g) { // 無回傳值的方法
        num = n;
        gas = g;
        System.out.println("將車號設為 " + num + "，汽油量設為 " + gas);
    }
}
