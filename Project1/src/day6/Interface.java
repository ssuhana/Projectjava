package day6;

public interface Interface {
	void add();
	default void show()//concrete method
	{
		System.out.println("in interface");
	}

static void show1() {
	System.out.println("in static interface");
}
	
}