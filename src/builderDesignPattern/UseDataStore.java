package builderDesignPattern;

import builderDesignPattern.DataStore.DataStoreBuilder;

public class UseDataStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataStoreBuilder dsb = DataStore.builder();
		DataStore ds = dsb.withHost("localhost").withPort(8000).withUrl("mysql").isValid().build();
		ds.printDb();
		
			builderDesignPattern.DataStore2.DataStoreBuilder dsb2 = DataStore2.builder();
			DataStore2 ds2 =dsb2.withHost("newhost").withPort(3000).withUrl("mongodb").isValid().build();
			ds2.printDb();
		
		
	}

}
