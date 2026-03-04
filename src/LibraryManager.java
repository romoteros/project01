
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class LibraryManager {

    private List<String> books = new ArrayList<>();
    private List<String> users = new ArrayList<>();
    
    public void procesarPrestamo(String user, String book, int day) {
	    if (users.contains(user) && books.contains(book)) {
	        System.out.println("Verificando disponibilidad...");
	        boolean isAvailable = true;
	        if (isAvailable) {
	            System.out.println("Prestamo realizado");
	            books.remove(book);

	            // Return date calculation
	            Calendar cal = Calendar.getInstance();
	            cal.add(Calendar.DAY_OF_MONTH, day);
	            System.out.println("Fecha devolucion: " + cal.getTime());
	        }
	    }
	}
}
