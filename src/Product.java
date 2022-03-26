public class Product {

    private String name, brand, color;
    private double price;
    private Size[] availableSize;
    Size size;
    int discount=0;
    int tuesdayDiscount=0;

    private String[] materials={"Cotton","Leather","Suede", "Linen","Silk"};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size[] getAvailableSize() {
        return availableSize;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getTuesdayDiscount() {
        return tuesdayDiscount;
    }

    public double getDiscountAmount() {
        return price*discount/100;
    }

    public String getFullDescriptionName(){
        return this.getColor()+" "+materials[(int) Math.floor(Math.random()*materials.length)]+" "+this.getName();
    }
}
