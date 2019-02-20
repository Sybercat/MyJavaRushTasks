package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Stall", df.parse("JULY 2 1970"));
        map.put("Stallberg", df.parse("MAY 22 1970"));
        map.put("Steinberg", df.parse("JANUARY 21 1970"));
        map.put("Strabag", df.parse("DECEMBER 9 1970"));
        map.put("Stocky", df.parse("OCTOBER 8 1970"));
        map.put("Special", df.parse("AUGUST 7 1970"));
        map.put("Ardensy", df.parse("SEPTEMBER 6 1970"));
        map.put("Killer", df.parse("FEBRUARY 5 1970"));
        map.put("Biller", df.parse("JULY 3 1970"));

        return map;
        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        String d;
        Set<String> keysToRemove = new HashSet<>();
        /*Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            d=pair.getValue();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            it.remove(); // avoids a ConcurrentModificationException
        }*/
        for (Map.Entry<String, Date> m: map.entrySet()
             ) {
            d = m.getValue().toString();

            if (d.contains("Jun")|d.contains("Jul")|d.contains("Aug")){
            //System.out.println(d);
                keysToRemove.add(m.getKey());
            }

        }
        map.keySet().removeAll(keysToRemove);


    }

    public static void main(String[] args) throws ParseException {




    }
}
