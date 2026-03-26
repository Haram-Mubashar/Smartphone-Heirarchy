public class Electronics extends Product{

       private String brand;
       private String warranty;

       public Electronics(int productId,String name,double price,String brand,String warranty){

       super(productId,name,price);
       this.brand=brand;
       this.warranty=warranty;
      
       }

       
       public String toString(){

       return String.format("%s\nBrand: %s\nWarranty: %s",super.toString(),brand,warranty);

       }

       }
       