package builderDesignPattern;

import builderDesignPattern.DataStore.DataStoreBuilder;

public class DataStore2 {
	private String host;
	private Integer port;
	private String url;
	
	public void printDb() {
		System.out.print("http://"+host+port+url);     
	}
	
	private DataStore2() {
		
	}
	public static DataStoreBuilder builder() {
		return new DataStoreBuilder();
	}
	public static class DataStoreBuilder{
		
		private DataStore2 ds2;
		public DataStoreBuilder() {
			ds2 = new DataStore2();
		}
		
		//fluent interface
		public DataStoreBuilder withHost(String host) {
			ds2.host=host;
			return this;
		}
		public DataStoreBuilder withPort(Integer port) {
			ds2.port=port;
			return this;
		}
		public DataStoreBuilder withUrl(String url) {
			ds2.url=url;
			return this;
		}
		
		
		public DataStore2 build() {
			
			
//			if(!isValid()) {
//			throw new IllegalArgumentException("Invalid db configuration");
//		}
		

			
			return ds2;
			
		}
		public DataStoreBuilder isValid() {
			if((ds2.url==null)||(ds2.port==null)||(ds2.host==null)) {
				throw new IllegalArgumentException("Invalid db configuration");
			}
			return this;
		}
	}

}
