package com.bignerdranch.android.buzzfeedquiz;

import org.junit.Test;

import static org.junit.Assert.*;

public class ResultTest {

    private Result result = new Result(0);

    @Test
    public void getResult() {
        result.setResult(1);
        assertEquals(1, result.getResult());
    }

    @Test
    public void setResult() {
        result.setResult(1);
        assertEquals(1, result.getResult());
    }
}