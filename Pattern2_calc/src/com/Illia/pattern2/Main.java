package com.Illia.pattern2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Box brackets=new Box(Sign.START);

        String expression=scanner.next();


        try{
            reading(expression,brackets);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return;
        }

        System.out.println(brackets.calculate());





    }

    private static void checking(String expression){
        boolean markNotNext=false;
        int brackets1=0,brackets2=0;
        for(int i=0;i<expression.length();i++){
            char c=expression.charAt(i);
            if(c!='0' && c!='1' && c!='2' && c!='3' && c!='4' && c!='5' && c!='6' && c!='7' && c!='8' &&
                    c!='9' && c!='(' && c!=')' && c!='+' && c!='-' && c!='*' && c!='/')
                        throw new IllegalArgumentException("Illegal symbol");

            if(c=='(') {
                markNotNext=true;
                brackets1++;
            }
            if(c==')') {
                if (markNotNext) throw new IllegalArgumentException("Unsupported Mark position");
                brackets2++;
            }

            if (markNotNext){
                if(c=='+' || c=='-' || c=='*' || c=='/') throw new IllegalArgumentException("Unsupported Mark duplicates");
                else markNotNext=false;
            }
            else if(c=='+' || c=='-' || c=='*' || c=='/') markNotNext=true;

            if(brackets2>brackets1) throw new IllegalArgumentException("Illegal brackets");
        }
        if(brackets2!=brackets1) throw new IllegalArgumentException("Illegal brackets");
    }

    private static void reading(String expression,Box brackets) throws IllegalArgumentException{
        checking(expression);

        ArrayList<Box> stack=new ArrayList<>();
        ArrayList<Character> num=new ArrayList<>();
        int i=0;
        char c;
        Sign sign=Sign.PLUS;

        while(true){
            c=expression.charAt(i);

            if(c=='('){
                if(!num.isEmpty()){
                    brackets.add(new Number(Integer.valueOf(toString(num)),sign));
                    num.clear();
                    sign=Sign.MULT;
                }
                stack.add(brackets);
                brackets=new Box(sign);
                sign=Sign.PLUS;
            }
            if(c==')'){
                if(!num.isEmpty()){
                    brackets.add(new Number(Integer.valueOf(toString(num)),sign));
                    num.clear();
                }
                int end=stack.size()-1;
                stack.get(end).add(brackets);
                brackets=stack.get(end);
                stack.remove(end);
                sign=Sign.MULT;
            }

            if(c=='0' || c=='1' || c=='2' || c=='3' || c=='4' || c=='5' || c=='6' || c=='7' || c=='8' || c=='9'){
                num.add(c);
            }

            if(c=='+' || c=='-' || c=='*' || c=='/') {
                if(!num.isEmpty()){
                    brackets.add(new Number(Integer.valueOf(toString(num)),sign));
                    num.clear();
                }
                switch (c){
                    case '+': sign=Sign.PLUS;
                        break;
                    case '-': sign=Sign.MINUS;
                        break;
                    case '*': sign=Sign.MULT;
                        break;
                    case '/': sign=Sign.DIV;
                }
            }
            if(i==expression.length()-1){
                if(!num.isEmpty()){
                    brackets.add(new Number(Integer.valueOf(toString(num)),sign));
                    num.clear();
                }
                break;
            }
            i++;
        }





    }

    private static String toString(ArrayList<Character> array){
        char[] arr = new char[array.size()];
        for (int i=0;i<arr.length;i++) {
            arr[i]=array.get(i);
        }

        return String.valueOf(arr);
    }

}
