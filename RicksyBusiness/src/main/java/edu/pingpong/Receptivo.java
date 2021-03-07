package edu.pingpong;

import java.util.LinkedHashSet;
import java.util.Set;

public class Receptivo {
    // Los elementos están ordenados por entrada, y no hay repetidos "LinkedHashSet"
    private Set<GuestDispatcher> observers = new LinkedHashSet<>();

    Receptivo(){}

    void registra(GuestDispatcher observer) {
        observers.add(observer);
    }

    void dispatch(CreditCard creditCard) {
        for (GuestDispatcher observer: this.observers) {
            observer.dispatch(creditCard);
        }
    }
}
