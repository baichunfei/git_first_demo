package day0714;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		
	
		List<Integer> list = new ArrayList<>();
		System.out.println(List.class); // interface java.util.List
		System.out.println(ArrayList.class);//class java.util.ArrayList
		System.out.println(list.getClass());//class java.util.ArrayList
		System.out.println(list.getClass().getName());
		int[]   a = new int[20];
	}

}
