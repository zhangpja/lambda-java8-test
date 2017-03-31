package main.java.com.example;


/**
 * Created by zhang on 2017/3/30.
 */
public class DoubleUnaryOperatorTest {
    public static void main(String[] args) {
        double d1 = test(x -> x, 9);
        System.out.println("d1:"+d1);//36.0
        double d2 = test(x -> x * x, 6);
        System.out.println("d2:"+d2);//54.0
        double d3 = test(x -> Math.pow(x, 2), 10);
        System.out.println("d3:"+d3);//250.0
        double d4 = test(Math::sqrt, 8);
        System.out.println("d4:"+d4);//16.0
    }

    public static double test(DoubleUnaryOperatorable duo, double x){
        int i = (int)x / 2;
        return duo.eval(i) * x;
    }
}
