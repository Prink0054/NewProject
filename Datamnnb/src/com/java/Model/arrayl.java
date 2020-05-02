package com.java.Model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class arrayl {

	public static void main(String[] args) {
		
		ArrayList<String> arryalsis = new ArrayList<String>();
		
		arryalsis.add("1");
		arryalsis.add("2");
		arryalsis.add("2");
		arryalsis.add("1");
		arryalsis.add("2");
		arryalsis.add("3");
		
		LinkedHashSet<String> hashset = new LinkedHashSet<String>(arryalsis);
		ArrayList<String> data = new ArrayList<String>(hashset);
		System.out.println(data);		
	}
}
