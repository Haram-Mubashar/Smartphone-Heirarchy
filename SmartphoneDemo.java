public class SmartphoneDemo{

       public static void main(){

       Smartphone first=new Smartphone(01,"OPPO A5 Pro",50000,"OPPO","2 years","128 GB","50 MP","5800mAh");
        
       Product third=new Product(02,"Samsung A4",20000);

       Electronics second=new Electronics(03,"Samsung A5",60000,"SAMSUNG","4 years");

       System.out.println("Smartphone > child class object:");
       System.out.println(first);

       System.out.println("\nElectronics > child class object:");
       System.out.println(second);

       System.out.println("\nProduct > parent class object:");
       System.out.println(third);
       


 

       }

       }