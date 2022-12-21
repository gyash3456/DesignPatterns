package builderDesignPattern;

public class DataStore {
	private String host;
	private Integer port;
	private String url;
	
	public void printDb() {
		System.out.print("http://"+host+port+url);     
	}
	
	private DataStore() {
		
	}
	public static DataStoreBuilder builder() {
		return new DataStoreBuilder();
	}
	public static class DataStoreBuilder{
		private String host;
		private Integer port;
		private String url;
		
		//fluent interface
		public DataStoreBuilder withHost(String host) {
			this.host=host;
			return this;
		}
		public DataStoreBuilder withPort(Integer port) {
			this.port=port;
			return this;
		}
		public DataStoreBuilder withUrl(String url) {
			this.url=url;
			return this;
		}
		
		
		public DataStore build() {
			
			
//			if(!isValid()) {
//			throw new IllegalArgumentException("Invalid db configuration");
//		}
		

			DataStore ds=new DataStore();
			ds.url=this.url;
			ds.port=this.port;
			ds.host=this.host;
			return ds;
			
		}
		public DataStoreBuilder isValid() {
			if((this.url==null)||(this.port==null)||(this.host==null)) {
				throw new IllegalArgumentException("Invalid db configuration");
			}
			return this;
		}
	}

}
