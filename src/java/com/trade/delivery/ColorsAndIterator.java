package com.trade.delivery;

import java.util.ArrayList;
import java.util.Iterator;

public class ColorsAndIterator {
        public static void main(String[] args) {
            ArrayList<String> Colorlist = new ArrayList<String>(5);
            Iterator<String> colorIter;
            Colorlist.add("Red");
            Colorlist.add("Yellow");
            Colorlist.add("Blue");
            Colorlist.add("White");
            Colorlist.add("Black");
            colorIter = Colorlist.iterator();
            System.out.println("Elements in Color list are : ");
            while(colorIter.hasNext()){
                System.out.println(colorIter.next());
            }
        }
    }