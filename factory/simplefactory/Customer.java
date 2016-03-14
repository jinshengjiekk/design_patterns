package com.jsj.designpatterns.factory.simplefactory;

//2016年3月14日下午8:32:42
public class Customer {

	public Customer() {
	}
	
	public static void main(String[] args) {
		try{
		Factory factory = new Factory();
		BMW bmw320 = factory.createBMW(320);
		BMW bmw523 = factory.createBMW(523);
		BMW bmw123 = factory.createBMW(123);
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
