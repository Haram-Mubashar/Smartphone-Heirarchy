public class Product{

       private int productId;
       private String name;
       private double price;
      


       public Product(int productId,String name,double price){

       this.productId=productId;
       this.name=name;
       this.price=price;
       }

       public double calDiscount(){
       
       double DiscountedPrice= 0.7*price;
       
       return DiscountedPrice;
       }


       
       public String toString(){

       return String.format("Product ID: %d\nName: %s\nPrice: %.2f",productId,name,calDiscount());
       }
 
       }
