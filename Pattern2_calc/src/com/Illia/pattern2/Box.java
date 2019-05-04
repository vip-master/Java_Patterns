package com.Illia.pattern2;

import java.util.ArrayList;

public class Box implements Element {
    private Sign sign;
    private ArrayList<Element> array = new ArrayList<Element>();

    Box(Sign s) {
        sign = s;
    }

    void add(Element child) {
        array.add(child);
    }

    void remove(Element child) {
        array.remove(child);
    }


    @Override
    public double calculate() throws IllegalArgumentException {
        double result = 0.0;
        double previous = 0.0;
        Sign prevSign = Sign.PLUS;
        boolean pre = false;

        for (Element e : array) {
            Sign sign = e.getSign();
            double current = e.calculate();

            if (sign == Sign.START) throw new IllegalArgumentException();
            if (pre) {
                if (sign == Sign.PLUS || sign == Sign.MINUS) {
                    result = Sign.calc(result, Sign.calc(previous, current, sign), prevSign);
                    pre = false;
                    prevSign = sign;
                    previous = 0.0;
                } else {
                    previous = Sign.calc(previous, current, sign);
                }
            } else {
                if (sign == Sign.PLUS || sign == Sign.MINUS) {
                    result = Sign.calc(result, previous, prevSign);
                    previous = current;
                    prevSign = sign;
                } else {
                    pre = true;
                    previous = Sign.calc(previous, current, sign);
                }
            }
        }
        result = Sign.calc(result, previous, prevSign);
        return result;
    }


    @Override
    public Sign getSign() {
        return sign;
    }
}
