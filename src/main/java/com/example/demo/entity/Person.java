package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Comparable{
    private Integer id;
    private String name;
    private Integer age;


    @Override
    public int compareTo(Object o) {
        Person p = (Person)o;
        return this.age-p.age;
    }
}
