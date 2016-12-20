package me.fahadalrabbani.calcengine;

/**
 * Created by achernar on 20/12/2016.
 */
public class PowerOf implements MathProcessing {
    @Override
    public String getKeyword() {
        return "power";
    }

    @Override
    public char getSymbol() {
        return '^';
    }

    @Override
    public double doCalculations(double leftVal, double rightVal) {
        return Math.pow(leftVal, rightVal);
    }
}
