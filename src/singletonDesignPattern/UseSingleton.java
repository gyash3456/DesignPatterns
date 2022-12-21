package singletonDesignPattern;

public class UseSingleton {
	public static void main(String args[]) {
		ConnectionPool cp = ConnectionPool.getConnectionPoolInstance();
		System.out.println(cp.getUrl());
	}
}
