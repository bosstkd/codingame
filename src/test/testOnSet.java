package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class testOnSet {

	public static void main(String[] args) {
		Set<String> strS = new HashSet<>();
	
		
		for(int i = 1; i<=55; i++) {
			strS.add("test "+i);
		}
		
		
		strS.stream().forEach(System.out::println);
	}
	
}
