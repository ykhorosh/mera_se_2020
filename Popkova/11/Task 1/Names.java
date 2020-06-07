package com.katepopkova;

public enum Names {
    ANNA("Anna"),
    MIKE("Mike"),
    KARL("Karl"),
    SOFIA("Sofia"),
    VLAD("Vlad");

    private String name;

    Names(String name) {
        this.name = name;
    }

    public String geValue() {
        return name;
    }
}