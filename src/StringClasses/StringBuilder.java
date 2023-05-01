package StringClasses;

public class StringBuilder {
	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder("Wiley");
//		sb.append(" Edge");
		
		
		StringBuilder logMessage = new StringBuilder();
		
		long timestamp = System.currentTimeMillis();
		
		logMessage.append("[").append(timestamp).append("] ");
		int userId = 123456;
		
		logMessage.append("User ").append(userId).append(": ");
		
		String message = "Login Successfully";
		logMessage.append(message);
		
		System.out.println(logMessage); 
		
	}

}