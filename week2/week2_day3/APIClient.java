package week2.day3;

public class APIClient {
	
	//- Inside the APIClient class, define the sendRequest method with multiple overloaded versions. 
	//- One version should accept one input argument: a String for the endpoint.
	//- Another version of the sendRequest method should accept three input arguments: 
			//a String for the endpoint, a String for the requestBody, and a boolean parameter requestStatus to verify whether the request is successful.

	public void sendRequest(String endpoint) {
		System.out.println("Single arg value : "+endpoint);
	}
	
	public void sendRequest(String endpoint,String requestBody,boolean param) {
		System.out.println("Multiple arg values : "+endpoint+requestBody+param);
	}
	public static void main(String[] args) {
		APIClient obj=new APIClient();
		obj.sendRequest("One arg");
		obj.sendRequest("1st arg", "2nd arg", false);

	}

}
