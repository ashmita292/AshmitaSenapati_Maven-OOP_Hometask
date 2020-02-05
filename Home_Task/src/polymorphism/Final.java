package polymorphism;


public class Final extends Test {
	void show()
    {
     System.out.println("overriden method");
    }
	public static void main(String[] args) {
		Test t=new Test();
		t.show();
		
      
       Final f=new Final();
       f.show();
	}

}
