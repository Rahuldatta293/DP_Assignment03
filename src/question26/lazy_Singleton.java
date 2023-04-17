package question26;

public class lazy_Singleton {
	
	private <LazySingleton> lazy_Singleton(){
		LazySingleton getInstance(){
		return LazyHolder.INSTANCE;

		}
		private static class LazyHolder{
		private static final LazySingleton INSTANCE = new LazySingleton();
		}
		private Object readResolve(){
		return LazyHolder.INSTANCE;
		}
		}

}
