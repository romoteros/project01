import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class LibraryManager {

	private List<String> books = new ArrayList<>();
	private List<String> users = new ArrayList<>();

	public void processLoan(String user, String book, int days) {
		// Guard Clause: Check if user and book exist
		if (!users.contains(user) || !books.contains(book)) {
			return;
		}
			
		System.out.println("Checking availability...");
		
		// In a real scenario, this would check a database
		boolean isAvailable = true;
		
		// Guard Clause: Check if the book is actually available
		if (!isAvailable) {
			return;
		}
			
		System.out.println("Loan completed successfully");
		books.remove(book);
		
		// Method call to handle date logic
		printReturnDate(days);
	}

	private void printReturnDate(int days) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, days);
		System.out.println("Return date: " + calendar.getTime());
	}
}