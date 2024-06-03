package week2.day4;

public class JavaConnection implements DatabseConnection{

	public static void main(String[] args) {
		JavaConnection obj=new JavaConnection();
		obj.connect();
		obj.disconnect();
		obj.executeUpdate();

	}

	public void connect() {
		System.out.println("Connected to DB");
		
	}

	public void disconnect() {
		System.out.println("DIsconnected from DB");
		
	}

	public void executeUpdate() {
		System.out.println("Execute update method");
		
	}

}
