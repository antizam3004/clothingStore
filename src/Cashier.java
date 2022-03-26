import java.time.LocalDate;
import java.util.ArrayList;

public class Cashier {

    public Cashier(LocalDate purchaseDate, ArrayList<Product> productList, double subtotal, double discountAmount, double total){

        System.out.println("Date: "+purchaseDate);
        System.out.println("--Products--");
        for(int i=0;i<productList.size();i++) {
            System.out.println(productList.get(i).getFullDescriptionName()+" - "+productList.get(i).getBrand());
            System.out.println("$"+productList.get(i).getPrice());
            System.out.println("#discount "+productList.get(i).getDiscount()+"% - $"+productList.get(i).getDiscountAmount()+"\n");
        }
        System.out.println("----------------------------------------------------------");
        System.out.println("SUBTOTAL: $"+subtotal);
        System.out.println("DISCOUNT: $"+discountAmount+"\n");
        System.out.println("TOTAL: $"+total);
    }
}
