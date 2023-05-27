package GroupProject2;

public abstract class Car {

    double carPrice;
    String color;

    abstract double calculateSalePrice();
}
class Truck extends Car{
    int weight;

    public Truck(int weight, double carPrice, String color) {
        this.weight = weight;
        this.carPrice=carPrice;
        this.color=color;
    }

    @Override
 double calculateSalePrice() {
        double discount;
        if(weight>2000)
        {discount=this.carPrice*0.1;
         this.carPrice=carPrice-discount;

        }
        else
        {discount=carPrice*0.2;
        this.carPrice=carPrice-discount;
        }
        return this.carPrice;
    }

}
class Sedan extends Car{
    int length;
    Sedan(int length, double carPrice, String color){
        this.length=length;
        this.carPrice=carPrice;
        this.color=color;
    }

    @Override
    double calculateSalePrice() {
        double discount;
        if(length>20){
       discount=carPrice*0.05;
       this.carPrice=carPrice-discount;
        }
        else {
            discount=carPrice*0.1;
            this.carPrice=carPrice-discount;
        }
        return this.carPrice;
    }
}
class CarTesrer{
    public static void main(String[] args) {
        Truck truck=new Truck(2000,30000.0,"Black");
        double salePrice=truck.calculateSalePrice();
        System.out.println("The discounted price for your truck is: "+salePrice);

        Sedan sedan=new Sedan(22,50000.0,"White");
        double salesPrice= sedan.calculateSalePrice();
        System.out.println("The discounted price for your sedan is: "+salesPrice);
    }

}
