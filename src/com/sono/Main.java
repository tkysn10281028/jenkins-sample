package com.sono;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		System.out.println(list.isEmpty());
		
		list.stream().filter(str -> str.length()>0).forEach(t -> System.out.println(t));
	}
}
