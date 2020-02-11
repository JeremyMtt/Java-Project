package edu.nyu.cs9053.homework9;

import java.util.concurrent.Semaphore;

/**
 * User: blangel
 */
public class Factory {
    private final static Semaphore semaphore = new Semaphore(1);

    public static Customer createCustomer() {
	NewCustomer newcustomer = new NewCustomer(semaphore);
	return newcustomer;
    }

    public static Barista createBarista() {
	NewBarista newbarista  = new NewBarista(semaphore);
	return newbarista;
    }
}
