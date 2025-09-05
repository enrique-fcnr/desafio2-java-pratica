package Entities;

public class ImportedProduct extends Product{

    //ATTRIBUTES//
    private Double customsFee;

    //CONSTRUCTORS//
    public ImportedProduct(){
        super();
    }
    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    //METHODS//
    public Double totalPrice(){
        return getPrice() + customsFee;
    }

    @Override
    public final String priceTag(){
        return getName() +
                String.format(" $%.2f ", totalPrice()) +
                String.format("(Customs fee: $%.2f)", customsFee);
    }
}
