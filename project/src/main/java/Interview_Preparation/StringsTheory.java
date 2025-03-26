package Interview_Preparation;

import java.util.stream.IntStream;

public class StringsTheory {

    public static void  main(String arg[]){
        String s = "sai";

        int length = s.length();
        String string = s.toString();
        char c = s.charAt(2);
        char[] charArray = s.toCharArray();
        String[] s1 = s.split("a");

        int i1 = s.indexOf('i');
        int i2 = s.compareTo("sai");
        int i4 = s.compareToIgnoreCase("SAi");
        int i = s.hashCode();
        int i3 = s.lastIndexOf("i");

        boolean matches = s.matches("Sai");
        boolean equals = s.equals("Sai");
        boolean contains = s.contains("a");
        boolean b = s.equalsIgnoreCase("SAI");
        boolean b2 = s.startsWith("s");
        boolean b1 = s.endsWith("i");
        boolean empty = s.isEmpty();
        boolean b3 = s.contentEquals("sai");

        String lowerCase = s.toLowerCase();
        String upperCase = s.toUpperCase();
        String concat = s.concat(" kiran");

        String s3 = s.replaceFirst("s", "S");
        String s2 = s.replaceAll("i", "I");
        String replace = s.replace("a", "A");
        String substring = s.substring(1, 2);
        String trim = s.trim();
        IntStream chars = s.chars();
        String intern = s.intern();


        StringBuffer buf = new StringBuffer("kiran");
        String string1 = buf.toString();
        char c1 = buf.charAt(1);
        int i5 = buf.indexOf("n");
        int i6 = buf.lastIndexOf("n");
        int length1 = buf.length();
        StringBuffer append = buf.append(" jrv");
        String substring1 = buf.substring(2);
        String substring2 = buf.substring(1, 5);
//        StringBuffer stringBuffer = buf.deleteCharAt(1);
        int d = buf.lastIndexOf("k", 0);
//        String string2 = buf.reverse().toString();


    }



}
