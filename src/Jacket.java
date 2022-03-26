public class Jacket extends Product {
    private Size[] availableSize={new Size(42),new Size(44),new Size(46),new Size(48),new Size(50),new Size(52),new Size(54),new Size(56)
                                 ,new Size(58),new Size(60),new Size(62),new Size(64),new Size(66)};

    @Override
    public String getName() {
        return "Jacket";
    }


    @Override
    public Size[] getAvailableSize() {
        return availableSize;
    }
}

