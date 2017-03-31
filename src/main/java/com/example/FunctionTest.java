package main.java.com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Created by zhang on 2017/3/31.
 */
public class FunctionTest {
    public static void main(String[] args) {
        List<Person> people = getPeople();
        List<Car> cars = getCar();
        mapSum(people, Person::getSalary);
        mapSum(cars, Car::getPrice);
    }

    public static <T> void mapSum(List<T> entries, Function<T, Double> f) {
        int sum = 0;
        for (T entry : entries) {
            sum += f.apply(entry);
        }
        System.out.println(sum);
    }

    public static List<Person> getPeople() {
        List<Person> people = new ArrayList<>();
        Person p1 = new Person();
        p1.setId(10);
        p1.setName("paul");
        p1.setSalary(8000);
        Person p2 = new Person();
        p2.setId(20);
        p2.setName("Bingo");
        p2.setSalary(10000);
        Person p3 = new Person();
        p3.setId(30);
        p3.setName("jack");
        p3.setSalary(12000);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        return people;
    }

    public static List<Car> getCar() {
        List<Car> cars = new ArrayList<>();
        Car c1 = new Car();
        c1.setPrice(10000);
        Car c2 = new Car();
        c2.setPrice(15000);
        Car c3 = new Car();
        c3.setPrice(20000);
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        return cars;
    }
}
