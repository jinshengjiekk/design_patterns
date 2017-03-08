package com.jsj.designpatterns.factory.abstractfactory;

//2016年3月14日下午9:03:20
public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }

}
