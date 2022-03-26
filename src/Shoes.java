public class Shoes extends Product {
    private Size[] availableSize={new Size(39),new Size(40),new Size(41),new Size(42),new Size(43),new Size(44),new Size(45),new Size(46)};

    @Override
    public String getName() {
        return "Shoes";
    }

    @Override
    public Size[] getAvailableSize() {
        return availableSize;
    }

    @Override
    public int getTuesdayDiscount(){
        return 25;
    }


}
