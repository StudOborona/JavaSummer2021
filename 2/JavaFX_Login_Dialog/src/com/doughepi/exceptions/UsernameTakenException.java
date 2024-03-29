package com.doughepi.exceptions;

/**
 * @author Omran Alhaja
 * @version 1.0
 */
public class UsernameTakenException extends Exception
{
    /**
     * Custom exception used when a username is already present in a database.
     */
    public UsernameTakenException()
    {
        super("Username is already taken.");
    }
}
