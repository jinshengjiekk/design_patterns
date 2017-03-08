package com.jsj.designpatterns.singleton;

//2016年2月28日下午2:30:58
public class Singleton_003 {
    private static Singleton_003 singleton = null;

    private Singleton_003() {
    }

    /**
     * 解决002中每个线程进入getSingleton方法都会同步的问题。
     * 例如：singleton已经存在的情况下，仍然进行同步的话是没有必要的，是影响性能的。
     * 这个版本叫作“双重检查”--“Double Check”
     *
     * @return
     */
    public static Singleton_003 getSingleton() {
        if (singleton == null) {
            synchronized (Singleton_003.class) {
                if (singleton == null) {
                    singleton = new Singleton_003();
                }
            }
        }
        return singleton;
    }
}
