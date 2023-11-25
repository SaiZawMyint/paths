package com.itech.tools;

public class Main {
	public static void main(String[] args) {
		System.out.println("URL comparator with path variable");
		System.out.println("e.g.");
		String configURL = "/itech/tools/path/{id}/child/{childId}";
		String compareURL = "/itech/tools/path/10/child/134";
		System.out.println(PathComparations.compare(configURL, compareURL));
	}
}
