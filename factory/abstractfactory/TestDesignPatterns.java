package com.jsj.designpatterns.factory.abstractfactory;

//2016年3月14日下午9:09:31
public class TestDesignPatterns {
	public static void main(String[] args) {
		testAbstractFactory();
	}

	private static void testAbstractFactory() {
		Computer pc = ComputerFactory.getComputer(new PCFactory("12G", "240G", "2.2G"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("24G", "1TG", "2.6G"));
		System.out.println("pc:" + pc.toString());
		System.out.println("server:" + server.toString());
	}
}
