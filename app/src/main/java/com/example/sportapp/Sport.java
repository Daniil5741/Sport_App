package com.example.sportapp;


public class Sport {
    String getDescription() {
        return description;
    }

    String getName() {
        return name;
    }

    int getImageResourseId() {
        return imageResourseId;
    }

    public String toString() {
        return this.name;
    }

    private String name;
    private String description;
    private int imageResourseId;

    private Sport(String name, String description, int imageResourseId) {
        this.name = name;
        this.description = description;
        this.imageResourseId = imageResourseId;
    }

   static final Sport[] sports = {
            new Sport("Basketball", "is", R.drawable.basketball),
            new Sport("Boxing", "is", R.drawable.boxing),
            new Sport("Dancing", "is", R.drawable.dancing),
            new Sport("Football", "is", R.drawable.football),
            new Sport("Hockey", "is", R.drawable.hockey),
            new Sport("Karate", "is", R.drawable.karate),
            new Sport("Logo", "is", R.drawable.logo),
            new Sport("Rugby", "is", R.drawable.rugby),
            new Sport("Swimming", "is", R.drawable.swimming),
            new Sport("Tennis", "is", R.drawable.tennis),
            new Sport("Voleyball", "is", R.drawable.volleyball)

    };
}
