package com.jsj.designpatterns.singleton;

//2016年2月28日下午2:30:58
public class Singleton_001 {
    private static Singleton_001 singleton = null;

    private Singleton_001() {
    }

    public static Singleton_001 getSingleton() {
        if (singleton == null) {
            singleton = new Singleton_001();
        }
        return singleton;
    }
}
