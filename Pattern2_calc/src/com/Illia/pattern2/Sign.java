package com.Illia.pattern2;

public enum Sign {
    PLUS,MINUS,MULT,DIV,START;
    public static double calc(double x,double y,Sign sign){
        switch (sign){
            case PLUS: return x+y;
            case MINUS: return x-y;
            case MULT: return x*y;
            case DIV: return x/y;
            default: throw new IllegalArgumentException("NO START");
        }
    }
}
