package com.Illia.pattern2;

public class Number implements Element {

    private double value;
    private Sign sign;

    Number(double num,Sign s){
        value=num;
        sign=s;
    }

    @Override
    public double calculate() {
        return value;
    }

    @Override
    public Sign getSign() {
        return sign;
    }
}
