package com.scaler;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
@EqualsAndHashCode(of = {"name","age"}) //if name & age are same, hash code will be same.

public class Person {
    private String name;
    private int age;
}

