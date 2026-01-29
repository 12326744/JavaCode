package com.work.encapsulation;

public class Car {
//    final private String name="TOYOTA";
    final private String name;
    private String noPlace;
    private Float mielage;

    public Car(String name, String noPlace, Float mielage) {
        this.name = name;
        this.noPlace = noPlace;
        this.mielage = mielage;
    }

    public String getName() {
        return name;
    }

    public String getNoPlace() {
        return noPlace;
    }

    public void setNoPlace(String noPlace) {
        this.noPlace = noPlace;
    }

    public Float getMielage() {
        return mielage;
    }

    public void setMielage(Float mielage) {
        this.mielage = mielage;
    }
}
