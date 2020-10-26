
public class MyJNITest {

	
	public static void main(String[] args)
	{
				System.loadLibrary("MyJNITest");
		MyJNITest myTest = new MyJNITest();
		int c = myTest.add(10, 20);
		System.out.println("Result: " + c);
		

	}
	
	private native int add(int a, int b);

}
