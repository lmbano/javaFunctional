package imperative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import  static  imperative.Main.Gender.*;



public class Main {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
            new Person ("Makanaka",FEMALE),
                new Person ("Matatendeka",MALE),
                new Person ("Alex",MALE),
                new Person ("Fadzai",FEMALE),
                new Person ("Tanya",MALE),
                new Person ("Aysha",FEMALE),
                new Person ("Praize",FEMALE)
        );


        // Imperative approach
        System.out.println("Declarative approach !!! ");

        List<Person> females= new ArrayList<Person>();

        for( Person p : people){

            if(FEMALE.equals(p.gender)){
                females.add(p);
            }
        }

        for( Person f : females){

            System.out.println(f);
        }

        // Declarative approach
        System.out.println("Declarative approach !!!");

//        people.stream()
//                .filter(p ->FEMALE.equals(p.gender))
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

     List<Person> females1=  people.stream()
                .filter(p ->FEMALE.equals(p.gender))
                .collect(Collectors.toList());

        females1.forEach(System.out::println);


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
