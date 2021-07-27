package Fundamental;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        // Normal Array Declaration
        int a[] = new int[5];


        // Allows All the data dype
        java.util.ArrayList al = new java.util.ArrayList();

        al.add("Ratul Hasan");
        al.add(220);
        al.add(2.4);
        al.add(2,"lab");
        al.remove(3);

        System.out.println("The size of Array is "+ al.size());
        for (Object val : al) {
            System.out.println(val);
        }






        // Only allow String
        java.util.ArrayList<String> list = new java.util.ArrayList<String>();
        list.add("Ratul");
        list.add("CrushersLab");
        list.add("TrainingCrushersLab");

        System.out.println(list.size());

        // Print name from array list
        for (String name:list) {
            System.out.println(name);
        }


        // Only Allow Int
        java.util.ArrayList<Integer> intal = new java.util.ArrayList<Integer>();

        intal.add(23);
        System.out.println(intal);

    }
}
