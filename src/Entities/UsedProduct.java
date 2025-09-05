package Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{

    //ATTRIBUTES//
    private Date manufactureDate;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    //CONSTRUCTORS//
    public UsedProduct(){
        super();
    }
    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    //GETTERS AND SETTERS//
    public Date getManufactureDate() {
        return manufactureDate;
    }
    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    //METHODS//
    @Override
    public final String priceTag(){
        return String.format(getName() +
                String.format(" $%.2f ", getPrice()) +
                "(Manufacture date: " + formatter.format(manufactureDate)) + ") ";
    }
}
