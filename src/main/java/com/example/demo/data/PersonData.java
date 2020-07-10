package com.example.demo.data;

import com.example.demo.entity.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonData {
    public static List<Person> getPersons(){
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(1,"张三",18));
        persons.add(new Person(2,"李四",20));
        persons.add(new Person(3,"王五",30));
        persons.add(new Person(4,"赵六",16));
        return persons;
    }
}