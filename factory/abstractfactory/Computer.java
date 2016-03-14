package com.jsj.designpatterns.factory.abstractfactory;

//2016年3月14日下午8:53:56
public abstract class Computer {
	public abstract String getRAM();

	public abstract String getHDD();

	public abstract String getCPU();

	@Override
	public String toString() {
		return "RAM= " + this.getRAM() + ", HDD=" + this.getHDD() + ",CPU=" + this.getCPU();
	}
}