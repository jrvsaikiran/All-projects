package weekfive;

public class SampleB {

	
	public static void method5() {
		
		SampleA.method1();
		SampleA.method2();
		
	}
	
	public static void method6() {
		
		SampleA.method1();
		SampleA obj = new SampleA();
		obj.method3();
		obj.method4();
		
		
	}
	
	public void method7() {
		
		SampleA.method1();
		SampleA.method2();
		
		
		
	}
	
	public void method8() {
		
		
		
		
		SampleA obj1 = new SampleA();
		obj1.method3();
		obj1.method4();
		
		
		
		
	}
	
	/*rules:-
		S - S = specify classname
		S - NS = creat object
		NS - S = specify classname
		NS - NS = creat object
	*/
	
	
	}




