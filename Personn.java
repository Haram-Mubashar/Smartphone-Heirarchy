public class Personn{

       String name;
       int age;

       public Personn(String name,int age){
      
       this.name=name;
       this.age=age;
       }
       

       public toString(){
               return String.format("Name: %s\nAge: %d",name,age);
       }