import java.time.LocalDate;
import java.util.ArrayList;

public class ClothingStore {

    public static void main(String[] args) {
        ClothingStore clothingStore=new ClothingStore();
    }

    public ClothingStore()
    {
        //fiksno postavljen datum(utorak), za provjeru ostalih dana u tjednu promjeniti purchaseDate
        LocalDate purchaseDate=DateParser.parseDate("29.03.2022.");

        ArrayList<Product> productList=new ArrayList<>();

        //klasa koja nam kreira produkte, samo u konstruktoru preko argumenta navedemo koliko želimo produkata
        ProductsCreator productsCreator=new ProductsCreator(5);
        try {
            productList=productsCreator.getRandomProducts();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        //rezultat šaljemo u klasu za obračun popusta i dalje na print
        Cart cart=new Cart(productList, purchaseDate);
    }
}
