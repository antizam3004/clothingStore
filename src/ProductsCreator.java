import java.util.ArrayList;

//***************klasa u kojoj kreiramo random produkte sa random bojom, brendom itd...**********************//
public class ProductsCreator {

    String[] colors={"Blue", "Red", "Yellow", "Black", "White", "Green", "Purple","Grey"};
    String[] brands={"BrandA","BrandB","BrandC","BrandD","BrandE","BrandF","BrandG","BrandH"};

    int numberOfProducts;
    Class[] posibleClasses={Shoes.class, Shirt.class, Jacket.class, Trousers.class};

    public ProductsCreator(int numberOfProducts){
        this.numberOfProducts=numberOfProducts;
    }

    public ArrayList<Product> getRandomProducts() throws IllegalAccessException, InstantiationException {
        ArrayList<Product>productsList=new ArrayList();

        for(int i=0;i<numberOfProducts;i++){
            Product product=(Product) posibleClasses[(int) (Math.floor(Math.random()*posibleClasses.length))].newInstance();
            product.setBrand(brands[(int) (Math.floor(Math.random()*brands.length))]);
            product.setColor(colors[(int) (Math.floor(Math.random()*colors.length))]);
            product.setPrice(30.00+Math.floor(Math.random()*100));
            product.setSize(product.getAvailableSize()[(int)Math.floor(Math.random()*product.getAvailableSize().length)]);
            productsList.add(product);
        }

        return productsList;
    }
}
