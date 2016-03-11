package com.jsj.singleton;

//2016年2月28日下午2:30:58
public class Singleton_005 {
	private Singleton_005(){
		
	}
	private static class SingletonHolder{
		private static final Singleton_005 INSTANCE = new Singleton_005();
	}
	
	public static final Singleton_005 getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
