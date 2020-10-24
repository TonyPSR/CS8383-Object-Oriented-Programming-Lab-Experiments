package com.company.tonypsr;

public class MarkException extends Exception
{
    private int mark;
    MarkException(int x)
    {
        mark=x;
    }
    public String toString()
    {
        return"MarkException: " + mark + " > 100";
    }
}