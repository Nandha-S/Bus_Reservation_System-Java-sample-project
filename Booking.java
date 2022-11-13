import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
public class Booking {
    String name;
    int busNO;
    Date date;

    Booking() throws ParseException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Passenger name: ");
        name = input.next();
        System.out.println("Enter bus no: ");
        busNO = input.nextInt();
        System.out.println("Enter date dd-mm-yyyy");
        String dateInput = input.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public boolean isAvailble(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
        int capacity = 0;
        for (Bus bus : buses) {
            if (bus.getBusNo() == busNO) {
                capacity = bus.getCapacity();

            }
        }
            int count = 0;
            for (Booking b : bookings) {
                if (b.busNO == busNO && b.date.equals(date)) {
                    count++;
                }
            }
            return count<capacity?true:false;
        }
    }

