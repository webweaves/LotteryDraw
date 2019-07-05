package com.csw.lottery.utils;

import java.util.Comparator;

public class NumberComparator implements Comparator<Integer>
{
    public int compare(Integer a, Integer b)
    {
        if (a.compareTo(b) > 0) {
        	return 1;
        } else if (a.compareTo(b) < 0) {
            return -1; 
        } else {
            return 0;
        }
    }
}