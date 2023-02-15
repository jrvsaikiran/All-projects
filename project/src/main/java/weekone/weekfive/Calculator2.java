package weekfive;

public class Calculator2 {

	private static final String d = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator2 obj = new Calculator2();
		int output1 = obj.addition(10,20);
		int output2 = obj.addition(15,30);
		obj.substraction(output1,output2);
		
	}

	

	
	
	public int addition(int a,int b) {
		int d=a+b;
		System.out.println("addition of a,b is: "+d);
		return d;
		
		 
	}
	public void substraction(int a, int b) {
		// TODO Auto-generated method stub
		int c= a-b;
		
		System.out.println("substraction is: "+c);
		
	}
	

}
