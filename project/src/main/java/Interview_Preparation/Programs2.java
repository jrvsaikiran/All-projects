package Interview_Preparation;

import java.util.*;

public class Programs2 {
    public static void main(String arg[]){

        Integer[] aray1 = {3,9,5,7,2,2};
        Arrays.sort(aray1);
        System.out.println("sort method "+Arrays.toString(aray1));

        //using array reversed comparator
        Integer[] aray2 = {3,9,5,7,2,2};
        Arrays.sort(aray2, Comparator.reverseOrder());
        System.out.println(" array reversed comparator "+Arrays.toString(aray2));

        //sort by collections
        Integer[] aray3 = {3,9,5,7,2,2};
        ArrayList<Integer> araylist = new ArrayList<>(Arrays.asList(aray3));
        System.out.println(araylist.get(1));
        Collections.sort(araylist);
        System.out.println("sort by collections "+araylist);

        //sort by streams
        Integer[] aray4 = {3,9,5,7,2,2};
        System.out.println("sort by streams");
        Arrays.stream(aray4).sorted().forEach(System.out::println);

        //max and min in array
        Integer[] aray5 = {-3,4,5,6,7,-8,2};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i : aray5 ) {
            if(i>max){
                max=i;
            }
            if(i<min){
                min=i;
            }
        }
        System.out.println("max element in array "+max);
        System.out.println("min element in array "+min);

        //to reverse array
        Integer aray6[] = {5,5,2,1,7,8};
        int temp,i=0;
        int j=aray6.length-1;
        while(i<j){
            temp = aray6[i];
            aray6[i] = aray6[j];
            aray6[j] = temp;
            i++;
            j--;
        }
        for(int k : aray6){
            System.out.println("reverse array "+k);
        }
//======================================
        System.out.println("remove and find duplicates of individual in array");
        Integer[] charArray = {1,4,5,1,44,4,4};
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for(int ch : charArray) {
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            }
            else
                map.put(ch, 1);
        }
        System.out.println(map);
        int max1 = Integer.MIN_VALUE;
        int key = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getValue()>0) {
                System.out.println(entry.getKey()+"="+entry.getValue());
            }
            //most frequent element
            if(entry.getValue()>max1){
                max1 = entry.getValue();
                 key = entry.getKey();
            }
        }
        System.out.println("most frequent element "+key);
//      =============================================
        //remove duplicates in array
        int aray7[] = {3,3,4,5,5,6};
        Set<Integer> set = new HashSet<>();
        for(int a7:aray7){
            if(!set.add(a7)){
                System.out.println("find duplicates in array "+a7);
            }
        }
//        ==================================
        //find ovels in string
        String str= "triangle";
        String ovels = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        for(char c : chars){
            if(ovels.indexOf(c)>=0){
                sb.append(c);
            }
        }
        System.out.println(sb);
        System.out.println(sb.reverse());
//===============================
        //scond highest value in a map by using collections
        Map<String,Integer> mp = new HashMap<>();
        mp.put("sai",19);
        mp.put("kiran",5);
        mp.put("jrv",18);

        List<Integer> list=  new ArrayList<>(mp.values());
        System.out.println(list);
        Collections.sort(list);
        Integer integer = list.get(mp.size() - 2);
        System.out.println("======"+integer);

        //scond highest value in a map by using TREESET
        Map<String,Integer> mp1 = new HashMap<>();
        mp1.put("sai",19);
        mp1.put("kiran",5);
        mp1.put("jrv",18);

        TreeSet<Integer> sort = new TreeSet<>(mp1.values()); //tree set automatically sort values
        sort.pollLast(); // Retrieves and removes the last (highest) element, or returns null if this set is empty.
        Integer last = sort.last();
        System.out.println("------"+last);
//===========================================

        String st = "ab1ty4u8"; //output=1+4+8=13
        int sum = 0;
        char[] c = st.toCharArray();
        for(char ch : c ){
            if(Character.isDigit(ch)){
                // Converting the character to it's integer value
                int a = Integer.parseInt(String.valueOf(ch));
//                int a = Character.getNumericValue(ch);
                 sum = sum + a;
                System.out.println("total sum "+sum);
            }
        }
//  ===================================================
        //tomorrow==t$m$$rr$$$w
        String s = replaceCharFrequently("tomorrow", 'o', '$');
        System.out.println(s);
//=====================end======================
    }

    public static String replaceCharFrequently(String s, char c, char replacement) {
        if (s == null || s.length() == 0) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        int countSofar = 0;
        for (char ch : s.toCharArray()) {
            if (ch != c) {
                sb.append(ch);
            } else {
                countSofar = countSofar + 1;
                for (int i = 0; i < countSofar; i++) {
                    sb.append(replacement);
                }
            }
        }
        return sb.toString();
    }


}
