package com.example.musikspringdb.Model;

public class Artist {
    private int artist_ID;
    private String artistName;
    private int age;
    private String country;
    private String gender;

    public Artist() {
    }

    public Artist(int artist_ID, String artistName, int age, String country, String gender) {
        this.artist_ID = artist_ID;
        this.artistName = artistName;
        this.age = age;
        this.country = country;
        this.gender = gender;
    }

    public int getArtist_ID() {
        return artist_ID;
    }

    public void setArtist_ID(int artist_ID) {
        this.artist_ID = artist_ID;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}