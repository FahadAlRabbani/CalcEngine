package me.fahadalrabbani.calcengine;

/**
 * Created by achernar on 20/12/2016.
 */
public interface MathProcessing {
    String SEPERATOR = " ";
    String getKeyword();
    char getSymbol();
    double doCalculations(double leftVal, double rightVal);

}
