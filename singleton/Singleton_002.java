package com.jsj.singleton;

//2016年2月28日下午2:30:58
public class Singleton_002 {
	private static Singleton_002 singleton = null;

	private Singleton_002() {
	}

	/**
	 * 解决001中多线程会出现创建多个示例的问题
	 * @return
	 */
	public static Singleton_002 getSingleton() {
		synchronized (Singleton_002.class) {
			if (singleton == null) {
				singleton = new Singleton_002();
			}
		}
		return singleton;
	}
}
