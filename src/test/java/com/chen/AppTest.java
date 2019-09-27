package com.chen;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void x(){
        System.out.println(shouldAnswerWithTrue());
    }
    public String shouldAnswerWithTrue()
    {
        try{
            return "xx";
        }finally {
            return "nn";
        }
    }
}
