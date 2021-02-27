package com.collectioninject.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ApplicationRunnerListInjection {


    private final List<IOperation>m_operation;
    @Autowired
    public ApplicationRunnerListInjection(List<IOperation> m_operation) {
        this.m_operation = m_operation;
    }

    @Bean
    public ApplicationRunner runlistInject()
    {
        return  args->{
            System.out.println("list injection is running ...");
          m_operation.forEach(op-> System.out.println(op.hesapla(12,34)));
        };
    }


}
