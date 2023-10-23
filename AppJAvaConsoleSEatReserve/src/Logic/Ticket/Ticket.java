
package Logic.Ticket;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Emilio
 */
public class Ticket
{
    private int  number;
    private int row;
    private int seat;
    private double price;
    private Date dateOfPurchase;
    private Date  validDate;
    //one to one
     private Customer customer;   

    public Ticket()
    {
    }

    public Ticket(int number, int row, int seat, double price, Date dateOfPurchase, Date validDate)
    {
        this.number = number;
        this.row = row;
        this.seat = seat;
        this.price = price;
        this.dateOfPurchase = dateOfPurchase;
        this.validDate = validDate;
    }

    public int getNumber()
    {
        return number;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public int getRow()
    {
        return row;
    }

    public void setRow(int row)
    {
        this.row = row;
    }

    public int getSeat()
    {
        return seat;
    }

    public void setSeat(int seat)
    {
        this.seat = seat;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public Date getDateOfPurchase()
    {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(Date dateOfPurchase)
    {
        this.dateOfPurchase = dateOfPurchase;
    }

    public Date getValidDate()
    {
        return validDate;
    }

    public void setValidDate(Date validDate)
    {
        this.validDate = validDate;
    }

    @Override
    public String toString()
    {
        return "Ticket{" + "number=" + number + ", row=" + row + ", seat=" + seat + ", price=" + price + ", dateOfPurchase=" + dateOfPurchase + ", validDate=" + validDate + '}';
    }



 

    

   
   

    
    
    
}
