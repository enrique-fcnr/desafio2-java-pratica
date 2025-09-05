package Application;

import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int num = sc.nextInt();
        sc.nextLine();

        List<Product> list = new ArrayList<>();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        for(int i = 0; i < num; i++){
            System.out.printf("Product #%d data: ", i+1);
            System.out.println();
            System.out.print("Common, used or imported (c/u/i): ");
            char cui = sc.nextLine().charAt(0);

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            Double price = sc.nextDouble();
            sc.nextLine();

            if(cui == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String manufacture = sc.nextLine();
                Date manufactureDate = formatter.parse(manufacture);
                list.add(new UsedProduct(name, price,manufactureDate));

            } else if (cui == 'i') {
                System.out.print("Customs fee: ");
                Double fee = sc.nextDouble();
                sc.nextLine();
                list.add(new ImportedProduct(name, price, fee));
            } else{
                list.add(new Product(name, price));
            }
        }

        System.out.println("PRICE TAGS: ");
        for(Product prod: list){
            System.out.println(prod.priceTag());
        }
    }
}
