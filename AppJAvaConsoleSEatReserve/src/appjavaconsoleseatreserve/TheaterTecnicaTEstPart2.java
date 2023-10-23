package appjavaconsoleseatreserve;

import Logic.Ticket.Customer;
import Logic.Ticket.Ticket;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Emilio
 */
public class TheaterTecnicaTEstPart2
{

    public static void main(String[] args)
    {

        //Structure the datas Created;
        List<Ticket> listTickets = new ArrayList<Ticket>();
      
        //Customer Test
        Customer customer = new Customer();
        
        //I created Ticket
        Ticket ticket = new Ticket(120, 5, 5, 55, new Date(), new Date());
        Ticket ticket2 = new Ticket(121, 5, 6, 55, new Date(), new Date());

        //I creae ticket using empty contructorand ap;y encapsulation
        Ticket ticket3 = new Ticket();
        ticket3.setNumber(555);
        ticket3.setRow(45);
        ticket3.setSeat(25);
        ticket3.setPrice(120);
        ticket3.setDateOfPurchase(new Date());
        ticket3.setValidDate(new Date());

        // I add elemtos to the list:
        listTickets.add(ticket);
        listTickets.add(ticket2);
        listTickets.add(ticket3);

        //Sum of Price
        double sum = 0;
        for (Ticket listTicket : listTickets)
        {
            sum += listTicket.getPrice();
        }

        System.out.println("############################## ");
        System.out.println("The Sum of Price are: £" + sum);
        System.out.println("###############################");
        System.out.println("");

        //Inset dataa#s;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, Enter the row You want to see the tickets for:  ");
        int row = scanner.nextInt();
        System.out.println("");
        System.out.println("############################## ");

        boolean flag = false;
        for (Ticket listTicket : listTickets)
        {
            if (listTicket.getRow() == row)
            {

                System.out.println("The tickets of the Row are: \n" + listTicket.toString());
                flag = true;

            }

        }

        if (flag == false)
        {
            System.out.println("Sorry. No data was found for the row in question.");
        }
        System.out.println("###############################");
        System.out.println("");

        

        customer.setId(1);
        customer.setName("Emilio");
        customer.setLastName("Barrera");
        customer.setDni("55555");
        customer.getListTickets().add(ticket3);

        Ticket ticket4 = new Ticket();
        ticket3.setNumber(45);
        ticket3.setRow(23);
        ticket3.setSeat(5);
        ticket3.setPrice(200);
        ticket3.setDateOfPurchase(new Date());
        ticket3.setValidDate(new Date());

        customer.getListTickets().add(ticket4);
        
   
        
        System.out.println("Customer: " + customer.toString() );

    }
}
