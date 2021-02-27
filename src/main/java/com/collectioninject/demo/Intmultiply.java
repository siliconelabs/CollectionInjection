package com.collectioninject.demo;

import org.springframework.stereotype.Component;

@Component
public class Intmultiply implements IOperation {

//...
@Override
public int hesapla(int t1, int t2)
        {
        System.out.println("IntMultiplyOperation");
        return  t1 * t2;
        }

@Override
public boolean isValid(char op)
        {
        return op == '*';
        }

}
