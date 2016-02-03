package java_0203;

import java.util.*;

class TreeSetEx1 {
	public static void main(String[] args) {
		
		//공백 숫자  대문자 소문자 순서대로 오름차순 정렬
		
		TreeSet <String> set = new TreeSet<String>();

		String from = "b";
		String to = "d";

		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("dzzzz");
		set.add("elephant");
		set.add("elevator");
		set.add("fan");
		set.add("flower");
		set.add("su");
		set.add("cjin");

		System.out.println(set);
		System.out.println("range search : from " + from + " to " + to);
		System.out.println("result1 : " + set.subSet(from, to));
		System.out.println("result2 : " + set.subSet(from, to + "zzz"));
	}
}
