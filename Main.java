import java.text.ParseException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner input=new Scanner(System.in);
        ArrayList<Bus> buses=new ArrayList<Bus>();
        ArrayList<Booking> bookings=new ArrayList<Booking>();
        buses.add(new Bus(1,true,30));
        buses.add(new Bus(2,false,10));
        buses.add(new Bus(3,true,2));
        buses.add(new Bus(4,false,50));
        int userOpt=1;
        for(Bus b: buses){
            b.displayDetails();
        }
        while (userOpt==1) {
            System.out.println("Enter 1 for Ticket booking and 2 for exit");
            userOpt = input.nextInt();
            if (userOpt == 1) {
                Booking booking=new Booking();
                if(booking.isAvailble(bookings,buses)){
                    bookings.add(booking);
                    System.out.println("Booking confirmed");

                }else {
                    System.out.println("Sorry. Bus is full.Try another date or bus");
                }
            }
        }
    }
}