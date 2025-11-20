package com.polytech.tp;

public class Responsable {
    private String nom;

    public Responsable(String nom) {
        this.nom = nom;
    }

    @override 
    public void update(String message) {
        System.out.println("Notification pour le responsable " + nom + " : " + message);
    }
}
