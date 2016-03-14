package com.jsj.designpatterns.factory.simplefactory;
//2016年3月14日下午8:27:00
public class Factory {

	public Factory() {
	}
	
	
	public BMW createBMW(int type) throws IllegalArgumentException{
		switch (type) {
		case 320:
			return new BMW320();
		case 523:
			return new BMW523();
		default:
			break;
		}
		throw new IllegalArgumentException("传入的宝马车型号不对！");
	}
}
