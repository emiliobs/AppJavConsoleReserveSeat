package Logic.Ticket;

import java.util.List;

/**
 *
 * @author Emilio
 */
public class Customer
{
     private int id;
     private String dni;
     private String name;
     private String  lastName;
     //one to many
     private List<Ticket> ListTickets;
     

    public Customer()
    {
    }

    public Customer(int id, String dni, String name, String lastName, List<Ticket> ListTickets)
    {
        this.id = id;
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.ListTickets = ListTickets;
    }

    public List<Ticket> getListTickets()
    {
        return ListTickets;
    }

    public void setListTickets(List<Ticket> ListTickets)
    {
        this.ListTickets = ListTickets;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getDni()
    {
        return dni;
    }

    public void setDni(String dni)
    {
        this.dni = dni;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    @Override
    public String toString()
    {
        return "Customer{" + "id=" + id + ", dni=" + dni + ", name=" + name + ", lastName=" + lastName + ", ListTickets=" + ListTickets + '}';
    }

    
     
}
