package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		
		List<Integer> nums=new ArrayList<Integer>();
		
		//{1, 2, 3, 4, 10, 6, 8}. - Do a comparison check if there is a gap in the
		nums.add(3);
		nums.add(2);
		nums.add(1);
		nums.add(4);
		nums.add(6);
		nums.add(7);
		
		System.out.println(nums);
		Collections.sort(nums);
		System.out.println(nums);
		
		for (int i = 1; i < nums.size(); i++) {
			//System.out.println(i + nums.get(i));
			if(i!=nums.get(i-1)) {
				System.out.println(i);
			}
				
		}
		
	}
}
