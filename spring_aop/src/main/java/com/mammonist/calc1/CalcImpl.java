package com.mammonist.calc1;

import org.springframework.stereotype.Service;

@Service
public class CalcImpl implements Calc {
    @Override
    public int add(int i, int j) {
        return i + j;
    }

    @Override
    public int sub(int i, int j) {
        return i - j;
    }
}
