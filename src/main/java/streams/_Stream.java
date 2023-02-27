package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static streams._Stream.Gender.*;

public class _Stream {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person ("Makanakaishe",FEMALE),
                new Person ("Matatendeka",MALE),
                new Person ("Alex",MALE),
                new Person ("Alex",MALE),
                new Person ("Alex",MALE),
                new Person ("Alex",MALE),
                new Person ("Fadzai",FEMALE),
                new Person ("Tanya",MALE),
                new Person ("Aysha",FEMALE),
                new Person ("Praize",FEMALE)
        );
// map to set
        people.stream()
                .map(person -> person.name)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
        // map to int

        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);


    }

    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender {
        MALE, FEMALE
    }

}
