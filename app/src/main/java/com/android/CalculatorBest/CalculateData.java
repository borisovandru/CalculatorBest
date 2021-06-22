package com.android.CalculatorBest;

import java.io.Serializable;

public class CalculateData implements Serializable {
    public static final String MINUS="-";
    public static final String PLUS="+";
    public static final String DIVIDER="/";
    public static final String MULTIPLY="*";
    public static final String PERCENT="%";
    public String state="";
    double numberOne=0.0;
    double numberTwo=0.0;
    double answer;
    boolean isFirst=true;

    public void minus(double number){
        numberOne = number;
        state=MINUS;
    }
    public void plus(double number){
        numberOne=number;
        state=PLUS;
    }
    public void divider(double number){
        numberOne=number;
        state=DIVIDER;
    }
    public void multiply(double number){
        numberOne=number;
        state=MULTIPLY;
    }
    public void percent(double number){
        numberOne=number;
        state=PERCENT;
    }
    public void delete() {
        numberOne = 0.0;
        numberTwo = 0.0;
        state = "";
    }
    public double getAnswer(double number) {
        switch (state) {
            case MINUS:
                return numberTwo=numberOne - number;
            case PLUS:
                return numberTwo=numberOne + number;
            case DIVIDER:
                return numberTwo=numberOne / number;
            case MULTIPLY:
                return numberTwo=numberOne * number;
            case PERCENT:
                return numberTwo=numberOne % number;

        }
        isFirst=false;
        return numberOne;
    }
}

