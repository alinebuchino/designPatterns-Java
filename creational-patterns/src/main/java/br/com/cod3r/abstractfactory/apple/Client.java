package br.com.cod3r.abstractfactory.apple;

import br.com.cod3r.abstractfactory.apple.factory.IPhone11Factory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneXFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.BrasilRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.USRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone;

public class Client {

	public static void main(String[] args) {
		CountryRulesAbstractFactory rules = new BrasilRulesAbstractFactory();
		IPhone11Factory iPhone11Factory = new IPhone11Factory(rules);
		IPhone createIphone = iPhone11Factory.orderIPhone("standard");
		System.out.println("Creating iPhone 11 with rules: " + createIphone);

		System.out.println("================================================");

		CountryRulesAbstractFactory rulesUS = new USRulesAbstractFactory();
		IPhoneXFactory iPhoneXFactory = new IPhoneXFactory(rulesUS);
		IPhone createIphoneX = iPhoneXFactory.orderIPhone("highEnd");
		System.out.println("Creating iPhone X with rules: " + createIphoneX);
	}
}
