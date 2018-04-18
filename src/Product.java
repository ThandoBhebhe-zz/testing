public class Product {

    private  double price;
    private String name;// A B C

    private static double generatedPrice;

    public Product(String name){
        this(name, generatedPrice);
        double price =java.lang.Math.random()*8;

    }

    private Product(String name, double price){
       // super(defaultStockA, defaultStockB, defaultStockC);
        this.name = name;
        this.price = java.lang.Math.random()*8;
        //System.out.println("Product "+name+" created");
        //System.out.println("Price €"+ String.format("%.2f",this.price));
    }

    @Override
    public String toString(){
        return "Name: "+this.name+" Price: "+this.price;
    }
}
