package day3;

public class Constructor_demo {
	int length,breadth;
	Constructor_demo()
	{  
		length=10;
		breadth=20;
	}
	Constructor_demo(int l,int b)
	{
		length=l;
		breadth=b;
	}
	void display()
	{
		//System.out.println(" The length is " + length+ " and "+breadth + " is the breadth");
		System.out.println("the length and breadth is "+ length + " and " + breadth + " respectively");
		
	}
	
	public static void main(String[] args) {
		Constructor_demo obj1=new Constructor_demo();
		Constructor_demo obj2=new Constructor_demo(1,2);
		obj1.display();
		obj2.display();
		
				
	}

}
