package weekfive;




public class SampleA {
	 
	public static void method1() {
		method2();
		method1();
		
		SampleA obj1 =new SampleA();
		obj1.method3();
		obj1.method4();
		
	}
	
	
	public static void method2() {
		method1();
		method2();
		
		SampleA obj = new SampleA();
		obj.method3();
		obj.method4();
		
		
		
	}

	public void method3(){
		
	method1();
	method2();
	method4();
	method3();
	
	}
	
	public void method4() {
		
		method1();
		method2();
		method3();
		method4();
		
	}
	
	
	/*
	rules
	S-S    = no obj is created
	S-NS   = creat obj 
	NS - S = no obj is created
	NS -NS = no obj is created
	*/
	
	
	
	
	
	 
	
	
	
	
	 
	}

