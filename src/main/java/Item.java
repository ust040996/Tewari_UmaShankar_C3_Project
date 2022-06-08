public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return  name + ":"
                + price
                + "\n"
                ;
    }
    public String getPriceAndName(int price,String name){
        return getPrice()+" "+getName();
    }
}
