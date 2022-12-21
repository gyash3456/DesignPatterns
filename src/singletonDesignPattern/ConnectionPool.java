package singletonDesignPattern;

public class ConnectionPool {
	
//	ConnectionPool cp = new ConnectionPool();eager way of connection pool;
	private static ConnectionPool cp;
	private  String url;
	private  ConnectionPool() {
		//code to connect with database.
	}
	public String getUrl() {
		return url;
	}
	public static ConnectionPool getConnectionPoolInstance() {
		if(cp==null) {
			synchronized (ConnectionPool.class) {
				if(cp==null) {
					cp = new ConnectionPool();
					cp.url="You are now connected to database";//lazy way of initialisation on multithreaded environment
				}
			}
		}
		return cp;
	}
	
}
