package org.example.exercice4jee.model;

public class Cat {
    private String name;
    private String breed;
    private String favoriteFood;
    private String birthdate;

    public Cat(String name, String breed, String favoriteFood, String birthdate) {
        this.name = name;
        this.breed = breed;
        this.favoriteFood = favoriteFood;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
}
