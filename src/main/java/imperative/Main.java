package imperative;

import jdk.internal.icu.impl.NormalizerImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static imperative.Main.Gender.*;
public class Main
{
    private static final Object MALE = MALE;
    private static final NormalizerImpl.ReorderingBuffer FEMALE = FEMALE;

    public static <Person> void main(String[] args)
    {
        Object name;
        List<Person> people = List.of(
                new Person(name; "John", MALE),
                new Person(name; "John", MALE),
                new Person(name; "Jane", FEMALE),
                new Person(name; "Joan", FEMALE),
                new Person(name; "Jean", FEMALE),
        );
        //Imperative Approach
        List<Person> females = new ArrayList<>();
        for (Person person: people)
        {
            if (FEMALE.equals(person.gender)){
                females.add(person);

            }
        }
        for (Person female: females)
        {
            System.out.println(female);
        }
        System.out.println("Imperative Approach");
            //Declarative Approach
            people.stream()
                    .filter(person ->FEMALE.equals(person.gender))
                    .collect(Collectors.toList())
                    .forEach(System.out::println);
    }

    static class Person
    {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender)
        {
            this.name = name;
            this.gender = gender;
        }


    }
}
