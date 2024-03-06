enum Laptop{
    Asus(35000), Mackbook(200000), Pavilion(85000);
    private int price;
    private Laptop(){
        price=30000;
    }
    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
public class Enumpgm {
    public static void main(String[] args) {
        Laptop s=Laptop.Mackbook;
        System.out.println(s);
        System.out.println(s.getPrice());
        Laptop[] alllap=Laptop.values();
        for (Laptop i: alllap){
            System.out.println(i + " - Price: "+i.getPrice());
        }
    }
}
