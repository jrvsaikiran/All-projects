package weeksix;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// immutable are  string(not changable)
		
		String s1 = new String("kiran");
		System.out.println(s1.hashCode());
		String s2 = new String("kiran");
		System.out.println(s2.hashCode());
		System.out.println(s2.concat(s1));
		String s3 = new String("KIRAN");
		System.out.println(s3.hashCode());
		System.out.println(s3.concat(s2));
		//s3.concat(s2).concat(s1);
		System.out.println(s3.concat(s2).concat(s1));
		
		System.out.println("stringbuffer starts");
		
		StringBuffer s4 = new StringBuffer("sai");
		System.out.println(s4.hashCode());
		StringBuffer s5 = new StringBuffer("sai");
		System.out.println(s5.hashCode());
		StringBuffer s6 = new StringBuffer("SAI");
		System.out.println(s6.hashCode());
		//s6.append("jrv sai kiran");
		s4.append(s6).append(s5);
		System.out.println(s4);
		
		System.out.println("stringbuilder starts");
		
		StringBuilder s7 = new StringBuilder("jakkula");
		System.out.println(s7.hashCode());
		StringBuilder s8 = new StringBuilder("jakkula");
		System.out.println(s8.hashCode());
		StringBuilder s9 = new StringBuilder("JAKKULA");
		System.out.println(s9.hashCode());
		s9.append("5778");
		s9.append("6788");
		System.out.println(s9);
		
	}

}
