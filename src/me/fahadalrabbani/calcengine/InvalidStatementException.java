package me.fahadalrabbani.calcengine;

/**
 * Created by achernar on 01/12/2016.
 */
public class InvalidStatementException extends Exception {
    public InvalidStatementException(String reason, String statement){
        super(reason+ ": "+statement);
    }

    public InvalidStatementException(String reason, String statement, Throwable cause){
        super(reason+ ": "+statement,cause);
    }
}
