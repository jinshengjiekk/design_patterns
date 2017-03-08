package com.jsj.designpatterns.singleton;

//2016年2月28日下午2:30:58
public class Singleton_004 {
    private static volatile Singleton_004 singleton = null;

    private Singleton_004() {
    }

    /**
     * 主要在于singleton = new Singleton()这句，这并非是一个原子操作，事实上在 JVM 中这句话大概做了下面 3 件事情。
     * <p>
     * 1：给 com.jsj.designpatterns.singleton 分配内存 调用 2：Singleton 的构造函数来初始化成员变量，形成实例
     * 3：将singleton对象指向分配的内存空间（执行完这步 singleton才是非 null 了）
     * 但是在JVM的即时编译器中存在指令重排序的优化。也就是说上面的第二步和第三步的顺序是不能保证的，最终的执行顺序可能是 1-2-3 也可能是
     * 1-3-2。如果是后者，则在 3 执行完毕、2 未执行之前，被线程二抢占了，这时 instance 已经是非 null
     * 了（但却没有初始化），所以线程二会直接返回 instance，然后使用，然后顺理成章地报错。
     * <p>
     * <p>
     * 使用 volatile 有两个功用：
     * <p>
     * 1）这个变量不会在多个线程中存在复本，直接从内存读取。
     * <p>
     * 2）这个关键字会禁止指令重排序优化。也就是说，在 volatile
     * 变量的赋值操作后面会有一个内存屏障（生成的汇编代码上），读操作不会被重排序到内存屏障之前。
     * <p>
     * 但是，这个事情仅在Java 1.5版后有用，1.5版之前用这个变量也有问题，因为老版本的Java的内存模型是有缺陷的。
     *
     * @return
     */
    public static Singleton_004 getSingleton() {
        if (singleton == null) {
            synchronized (Singleton_004.class) {
                if (singleton == null) {
                    singleton = new Singleton_004();
                }
            }
        }
        return singleton;
    }
}
