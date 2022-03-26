public class Shirt extends Product {
    private Size[] availableSize={new Size("XS"),new Size("S"),new Size("M"),new Size("L"),new Size("XL"),new Size("2XL")};

    @Override
    public String getName() {
        return "Shirt";
    }

    @Override
    public Size[] getAvailableSize() {
        return availableSize;
    }

    @Override
    public int getTuesdayDiscount(){
        return 10;
    }
}
