package week1.day3;
import java.util.Arrays;
public class MissingElement {

	public static void main(String[] args) {
		int arr[]= {1,6,2,8,3,10,5,7,9};
		Arrays.sort(arr);
		for (int i = 1; i <arr.length; i++) {
			//System.out.println(arr[i]);
			if(i!=arr[i-1])
				//System.out.println("i= "+i + "arr[i]= "+arr[i]);
				{System.out.println(i);
			    break;}
		}

	}

}
