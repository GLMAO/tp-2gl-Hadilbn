package com.polytech.tp;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireEmploiDuTemps implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private List<ICours> listeCours = new ArrayList<>();

    @Override
    public void attach(Observer o){
        observers.add(o);
    }

    @Override
    public void detach (Observer o) {
        observers.remove(o);
    }
    
    @Override
    public void notifyObservers(String message) {
        for (Observer obs : observers) {
            obs.update(message);
        }
    }

    public void ajouterCours(ICours cours) {
        this.listeCours.add(cours);
        System.out.println("Nouveau cours ajouté : " + cours.getDescription());
        // TODO: C'est ici qu'il faudrait notifier les étudiants (Observer pattern)
        notifyObservers("Nouveau cours ajouté : " + cours.getDescription());
    }

    public void modifierCours(ICours cours, String message) {
        // Logique de modification...
        System.out.println("Cours modifié : " + message);
        // TODO: Notifier les observateurs ici aussi
        notifyObservers("Le cours '" + cours.getDescription() + "' a été modifié : " + message);
    }

    public void setChangement(String string) {
        // TODO Auto-generated method stub
        notifyObservers("Changement : " + string);
        throw new UnsupportedOperationException("Unimplemented method 'setChangement'");
    }
}