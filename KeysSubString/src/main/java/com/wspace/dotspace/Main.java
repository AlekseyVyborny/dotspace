package com.wspace.dotspace;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main( String[] args ) {
        System.out.println(); // "Hello World!" );
        String inputFileName = "D:\\team\\input.txt";
        String outputFileName = "D:\\team\\output.txt";

        String line1, line2;
        Set<String> stringSet;

        stringSet = new HashSet<>();
        try {
//            FileReader mfr = new FileReader(inputFileName);
            InputStream inputStream = new FileInputStream(inputFileName);
            BufferedReader mbr = new BufferedReader(new InputStreamReader(inputStream));
            try {
                line1 = mbr.readLine();
                System.out.println(line1);
                line2 = mbr.readLine();
                System.out.println(line2);

                getSetOfUniqueSubstring(line2,stringSet);
//                for (int i = 0; i <= arrChar.length; i++) {
//
//                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("---------------------------------------------------");
        System.out.println(stringSet.size());
        System.out.println(stringSet.toString());
    }

    public void hashMapbuilder(String s, HashMap hm) {
        HashMap resultHashMap = hm;
    }
    public HashMap<String,Set> hashMapbuilder(String s) {
        HashMap resultHashMap = null;
        return resultHashMap;
    }
    public static void getSetOfUniqueSubstring(String s, Set<String> resultSet){
        StringBuilder stringBuilder;
        char[] arrChar = s.toCharArray();
        stringBuilder = new StringBuilder();
//        int g = 0;
        for (int j = 0; j < arrChar.length; j++) {
            for (int z = 0; z < arrChar.length - j; z++) {//arrChar.length
                stringBuilder.append("");
                for (int k = z; k <= j + z; k++) {
                    stringBuilder.append(arrChar[k]);
//                            stringSet.add(stringBuilder.toString());
//                            g++;
//                            System.out.println(g);
//                            stringSet.add(String.valueOf(arrChar[k]));
                }
                resultSet.add(stringBuilder.toString());
                System.out.println(stringBuilder.toString());
                stringBuilder.delete(0,stringBuilder.length());// = new StringBuilder();
            }
        }
    }
}
