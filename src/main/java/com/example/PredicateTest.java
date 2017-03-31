package main.java.com.example;

/**
 * Created by zhang on 2017/3/31.
 */
public class PredicateTest{
    public static void main(String[] args) {
        Person person = new Person();
        person.setId(10);
        person.setName("paul");
        person.setSalary(8000);
        findMatchPerson(person, p -> person.getId() == 10);
        findMatchPerson(person, p -> person.getName().equals("Bingo"));
        findMatchPerson(person, p -> person.getSalary() > 10000.0);
    }

    public static void findMatchPerson(Person p, Predicate pre){
        if(pre.test(p)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
