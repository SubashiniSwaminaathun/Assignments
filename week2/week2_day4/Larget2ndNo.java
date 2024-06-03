package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Larget2ndNo {

	public static void main(String[] args) {
		
		List<Integer> nums=new ArrayList<Integer>();
	
		nums.add(3);
		nums.add(2);
		nums.add(11);
		nums.add(4);
		nums.add(6);
		nums.add(7);
		System.out.println(nums);
		
		Collections.sort(nums);
		System.out.println(nums);
		
		System.out.println("2nd largest number in list is "+nums.get(1));
		
	}
}
