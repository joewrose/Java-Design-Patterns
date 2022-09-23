import java.util.ArrayList;

public class ErrorWriter {
	private static ErrorWriter instance;
	private ArrayList<String> errors = new ArrayList<String>();
	
	private ErrorWriter() {
	}
	
	public static ErrorWriter getInstance() {
		if(instance == null) {
			instance = new ErrorWriter();
		}
		return instance;
	}
	
	public void listRequests() {
		for(String error: errors) {
			System.out.println(error);
		}
	}
	
	public void addRequest(String error) {
		errors.add(error);
	}
}
