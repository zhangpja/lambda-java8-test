package main.java.com.example;

/**
 * Created by zhang on 2017/3/31.
 */
@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}

