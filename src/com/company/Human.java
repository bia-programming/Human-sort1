package com.company;

public class Human {
    int age;
    int kg;
    boolean isAfrican;
    float height;
    boolean isRich;
    boolean isBald;
    boolean hasGlasses;
    boolean hasBeard;
    String lastName;
    String firstName;
    String eyeColor;
    String job;
    String city;
    String country;

    public Human() {

    }

    public Human(int age, int kg, boolean isAfrican, float height, boolean isRich, boolean isBald, boolean hasGlasses, boolean hasBeard, String lastName, String firstName, String eyeColor, String job, String city, String country) {
        this.age = age;
        this.kg = kg;
        this.isAfrican = isAfrican;
        this.height = height;
        this.isRich = isRich;
        this.isBald = isBald;
        this.hasGlasses = hasGlasses;
        this.hasBeard = hasBeard;
        this.lastName = lastName;
        this.firstName = firstName;
        this.eyeColor = eyeColor;
        this.job = job;
        this.city = city;
        this.country = country;
    }

    public String toString() {
        return "Human{" +
                "age=" + age +
                ", kg=" + kg +
                ", isAfrican=" + isAfrican +
                ", height=" + height +
                ", isRich=" + isRich +
                ", isBald=" + isBald +
                ", hasGlasses=" + hasGlasses +
                ", hasBeard=" + hasBeard +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", job='" + job + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
