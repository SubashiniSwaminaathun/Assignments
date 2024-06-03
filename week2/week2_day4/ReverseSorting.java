package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseSorting {

	public static void main(String[] args) {
		

		List<String> company=new ArrayList<String>();
		//{HCL, Wipro,  SysAspiretems, CTS}
		
		company.add("HCL");
		company.add("Wipro");
		company.add("Aspire Systems");
		company.add("CTS");
		
		Collections.sort(company);
		
		for (int i = company.size()-1; i >= 0; i--) {
			System.out.println(company.get(i));
		}
	}

}
