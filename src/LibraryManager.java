
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class LibraryManager {

	private List<String> books = new ArrayList<>();
	private List<String> users = new ArrayList<>();

	public void processLoan(String user, String book, int day) {
		if (!users.contains(user) || !books.contains(book))
			return;
		System.out.println("Verificando disponibilidad...");
		boolean isAvailable = true;
		if (!isAvailable)
			return;
		System.out.println("Prestamo realizado");
		books.remove(book);
		// Return date calculation
		imprimirFechaDevolucion(day);
	}

	private void imprimirFechaDevolucion(int day) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, day);
		System.out.println("Fecha devolucion: " + cal.getTime());

	}
}
