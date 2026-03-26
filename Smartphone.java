public class Smartphone extends Electronics{

       private String storage;
       private String cameraMP;
       private String battery;

       public Smartphone(int productId,String name,double price,String brand,String warranty,String storage,String cameraMP,String battery){

       super(productId,name,price,brand,warranty);
       this.storage=storage;
       this.cameraMP=cameraMP;
       this.battery=battery;

       }

      
       
       public String showSpecs(){

       return String.format("%s\nStorage: %s\nCameraMP: %s\nBattery: %s",super.toString(),storage,cameraMP,battery);
       }
 
       }