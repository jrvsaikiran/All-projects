package weekone.weektwo;

import org.apache.poi.ss.formula.functions.T;

import java.util.function.Predicate;

public class Java8 {

//    @FunctionalInterface
    interface LamdaTest{
        String method(String source);
    }

    public static void main(String[] arg) {

        LamdaTest lam = source -> {
            System.out.println("Lamda " + source);
            return source;
        };
        lam.method("hyd");


//========================================================================
//        predicate interface
        Predicate<Integer> pre = integer -> (integer > 10);
        System.out.println(pre.test(34));
        System.out.println(pre.test(3));

        Predicate<String> predicate = str -> (str.length() > 2);
        System.out.println(predicate.test("6io88"));

        String[] aray = {"sai", "kiran", "jrv"};
        for (String s : aray) {
            predicate.test("s");
            System.out.println(s);
        }
    }

//=======================



















}
