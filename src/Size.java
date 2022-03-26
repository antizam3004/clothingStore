public class Size {

    private Object size;

    public Size(int size){
        this.size=size;
    }

    public Size(String size){
        this.size=size;
    }

    public Object getSizeValue(){
        return size.toString();
    }
}
