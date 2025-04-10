package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.model.IPhone;

public class Client {

	public static void main(String[] args) {

		System.out.println("----------------------------------------------------");

		IPhone device = IPhoneFactory.createIPhone("X", "standard");
		System.out.println("Return cellPhone: " + device);

		System.out.println("----------------------------------------------------");

		IPhone device2 = IPhoneFactory.createIPhone("X", "HighEnd");
		System.out.println("Return cellPhone: " + device2);

		System.out.println("----------------------------------------------------");

		IPhone device3 = IPhoneFactory.createIPhone("11", "standard");
		System.out.println("Return cellPhone: " + device3);

		System.out.println("----------------------------------------------------");

		IPhone device4 = IPhoneFactory.createIPhone("11", "HighEnd");
		System.out.println("Return cellPhone: " + device4);

	}
}
