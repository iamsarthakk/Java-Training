package com.p9;

import java.util.TreeSet;
import java.util.Comparator;

class MyComp implements Comparator
{
 public int compare(Object a, Object b) 
{
	String aStr, bStr;
	aStr = (String) a;
	bStr = (String) b;
	return bStr.compareTo(aStr);
	}
}
