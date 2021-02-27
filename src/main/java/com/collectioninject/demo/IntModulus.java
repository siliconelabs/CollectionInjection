package com.collectioninject.demo;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
public class IntModulus implements IOperation {

        //...
        @Override
        public int hesapla(int t1, int t2)
        {
            System.out.println("IntModulusOperation");
            return  t1 % t2;
        }

        @Override
        public boolean isValid(char op)
        {
            return op == '%';
        }
    }

