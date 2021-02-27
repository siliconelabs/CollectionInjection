package com.collectioninject.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class IntAddOpration implements IOperation {
  @Value("${AddOperation:default}")
  String operator;

    @Override
    public int hesapla(int t1, int t2) {
        System.out.println(operator+ " isleminin icindeyim");
        return t1+t2;
    }

    @Override
    public boolean isValid(char op) {

        return op=='+';
    }
}
