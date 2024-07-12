package org.example.exercice4jee.model;

import java.time.LocalDate;

public class Cat {
    private String name;
    private String breed;
    private String favoriteFood;
    private LocalDate birthdate;

    public Cat(String name, String breed, String favoriteFood, LocalDate birthdate) {
        this.name = name;
        this.breed = breed;
        this.favoriteFood = favoriteFood;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
}
