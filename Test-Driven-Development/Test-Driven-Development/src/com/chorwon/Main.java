package com.chorwon;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

class Dollar extends Money{

    Dollar(int amount) {
        this.amount = amount;
    }

    Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}

class Franc extends Money{

    Franc(int amount) {
        this.amount = amount;
    }

    Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}

abstract class Money {

    abstract Money times(int multiplier);

    protected int amount;

    static Money dollar(int amount) {
        return new Dollar(amount);
    }

    static Money franc(int amount) {
        return new Franc(amount);
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }
}

