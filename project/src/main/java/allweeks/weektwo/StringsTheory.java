package allweeks.weektwo;

import java.util.stream.IntStream;

public class StringsTheory {

    public static void  main(String arg[]){
        String s = "sai";
        int length = s.length();
        String string = s.toString();
        char c = s.charAt(1);
        boolean equals = s.equals("Sai");
        boolean contains = s.contains("a");
        String lowerCase = s.toLowerCase();
        String upperCase = s.toUpperCase();
        boolean matches = s.matches("Sai");
        char[] charArray = s.toCharArray();
        String[] s1 = s.split("a");
        String concat = s.concat(" kiran");
        boolean b = s.equalsIgnoreCase("SAI");
        int i = s.hashCode();
        String s2 = s.replaceAll("s", "S");
        String replace = s.replace("a", "A");
        String substring = s.substring(1, 2);
        String trim = s.trim();
        IntStream chars = s.chars();
        int i1 = s.indexOf('i');
        int i2 = s.compareTo("sai");
        boolean b2 = s.startsWith("s");
        boolean b1 = s.endsWith("i");
        boolean empty = s.isEmpty();
        int i3 = s.lastIndexOf("i");
        String intern = s.intern();
        String s3 = s.replaceFirst("s", "S");
        boolean b3 = s.contentEquals("sai");



    }



}
