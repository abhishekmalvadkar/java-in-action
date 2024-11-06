package com.amalvadkar.jia.challenges;

/*
    Write a program that asks the user to enter the name of his or her favorite city.
    Use a String variable to store the input. The program should display the following:

    •  The number of characters in the city name
    •  The name of the city in all uppercase letters
    •  The name of the city in all lowercase letters
    •  The first character in the name of the city
 */
public class StringManipulator {

    public static CityResult processCity(String favoriteCityName){
        return new CityResult(
                favoriteCityName.length(),
                favoriteCityName.toUpperCase(),
                favoriteCityName.toLowerCase(),
                favoriteCityName.charAt(0)
        );
    }

}

record CityResult(int totalCharacterInCity,String cityInUppercase, String cityInLowercase,
                  char cityFirstCharacter){}

/*
    Learning point :

    -> When you want to return more than one thing from method then
       there are multiple ways
       -> Use tuple
       -> Use Map
       -> Use custom class object - here you need to create all ceremonies like
          making them immutable, toString(), equals() and hashCode() etc..
       -> Use record (Best and type safe way and get all things out of the box)
 */
