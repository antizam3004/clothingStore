import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;


//*********************** klasa na kojoj obračunavamo iznos popusta *******************************************//

public class Cart {
    ArrayList<Product> productList=new ArrayList<>();
    LocalDate purchaseDate;
    boolean isTuesday=false;
    double subtotal=0;
    double discountAmount=0;
    double total=0;

    public Cart(ArrayList<Product> productList, LocalDate purchaseDate)
    {
        this.productList=productList;
        this.purchaseDate=purchaseDate;

        isTuesday=purchaseDate.getDayOfWeek()==DayOfWeek.TUESDAY ? true: false;

        calculateDiscount();
    }

    public void calculateDiscount()
    {
        int discount=0;

        if(productList.size()>2){
            discount=20;
        }

        //za svaki artikal
        for(int i=0;i<productList.size();i++) {
            //ako je više od 3 proizvoda ide popust od 20%
            if(productList.get(i).getDiscount()<discount){
                productList.get(i).setDiscount(discount);
            }
            //a ako je utorak, provjeravamo jeli veći popust od postojećeg
            if(isTuesday && productList.get(i).getDiscount()<productList.get(i).getTuesdayDiscount()){
                productList.get(i).setDiscount(productList.get(i).getTuesdayDiscount());
            }

            subtotal+=productList.get(i).getPrice();
            discountAmount+=productList.get(i).getDiscountAmount();
        }
        total=subtotal-discountAmount;

        printReceipt();
    }

    public void printReceipt(){
        new Cashier(purchaseDate, productList, subtotal, discountAmount, total);
    }

}
