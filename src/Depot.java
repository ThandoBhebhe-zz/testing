import java.util.Iterator;
import java.util.Random;
import java.util.ArrayList;

public class Depot {
    ArrayList<Product> productArrayList = new ArrayList();

    private int stockA=0;
    private int stockB=0;
    private int stockC=0;
    private double delivery=java.lang.Math.random()*9.99;

    static Random random = new Random();
    static int instanceCounter;
    int depotCounter=0;

    public Depot(){
        int randNum1;
        int randNum2;
        int randNum3;

        this.stockA = randNum1 =random.nextInt(40 - 5 + 1) + 15;//between 15 and 50
        this.stockB = randNum2 =random.nextInt(40 - 15 + 1) + 3;//between 3 and 40
        this.stockC = randNum3 =random.nextInt(40 - 15 + 1) + 3;

        this.instanceCounter+=1;
        this.depotCounter = instanceCounter;
        createProducts();
        System.out.println("Created depot "+(depotCounter)+" \n  Default stock:\n  A - "+stockA+"\n  B - "+stockB+"\n  C - "+stockC);
    }

    /** method for creating products
     * */
    public void createProducts(){

        for(int i = 0;i<stockA;i++){
            Product product= new Product("A");
            productArrayList.add(product);
        }
        for(int i = 0;i<stockB;i++){
            Product product= new Product("B");
            productArrayList.add(product);
        }
        for(int i = 0;i<stockC;i++){
            Product product= new Product("C");
            productArrayList.add(product);
        }
        System.out.println("==============================");
       // System.out.println("Default stock:\nA - "+stockA+"\nB - "+stockB+"\nC - "+stockC);
    }

    public Product getProduct(){
        int count = 0;

        Iterator productIterator = productArrayList.iterator();

        while (productIterator.hasNext()){
            count++;
           try{

              // System.out.println(productArrayList.get(count));
               return productArrayList.get(count);
           }catch (Exception ex){
               System.out.println("Someting went wrong "+ex);
           }


        }
        System.out.println("Nothing in the List");
        return productArrayList.get(10000000);
    }

    /**Method to add more stock to depot either for A, B or C in the case of a purchase*/
    public void add(String subtractFromWhat_a_or_b_or_c,int numberOfProductUnits){

        subtractFromWhat_a_or_b_or_c.toLowerCase();

        switch (subtractFromWhat_a_or_b_or_c){
            case "a":
                this.stockA += numberOfProductUnits;
                break;
            case "b":
                this.stockB += numberOfProductUnits;
                break;
            case "c":
                this.stockC += numberOfProductUnits;
        }
    }
    /**Method to subtract stock from depot either for product A, B or C in the case of selling*/
    public void subtract(String addToWhat_a_or_b_or_c,int numberOfProductUnits){

        addToWhat_a_or_b_or_c.toLowerCase();

        switch (addToWhat_a_or_b_or_c){
            case "a":
                this.stockA -= numberOfProductUnits;
                break;
            case "b":
                this.stockB -= numberOfProductUnits;
                break;
            case "c":
                this.stockC -= numberOfProductUnits;
        }
    }



    @Override
    public String toString(){

        return "Depot "+stockA+" " +" "+stockB +" "+stockC;
    }

    public int getStockA() {
        return this.stockA;
    }

    public int getStockB(){
        return this.stockB;
   }

    public int getStockC(){
       return this.stockC;
   }

    public void setStockA(int stockA) {
        this.stockA = stockA;
    }

    public void setStockB(int stockB) {
        this.stockB = stockB;
    }

    public void setStockC(int stockC) {
        this.stockC = stockC;
    }

    public double getDelivery() {
        return delivery;
    }
}
