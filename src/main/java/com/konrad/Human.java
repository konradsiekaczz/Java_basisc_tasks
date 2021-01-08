package com.konrad;

public class Human {
    private int age;
    private int weight;
    private int height;
    private String name;
    private int gender;

    public Human(int age, int weight, int height, String name, int gender) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public int getGender() {
        return gender;
    }

    public boolean isMale(String gender){
        return gender.equals("male");
    }
}
