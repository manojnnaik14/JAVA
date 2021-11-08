class TestAutomobiles{
 public static void main(String []args){

 Automobiles mobi= new Automobiles();
    
   
    mobi.name = "motorbike";
    String name=mobi.name;
   System.out.println(name);

 
  String vehiclebrand = mobi.brand;
    System.out.println(vehiclebrand);

  mobi.price = 55000;
  int price= mobi.price;
   System.out.println(price);

  mobi.colour="blackcement";
  String vehiclecolour=mobi.colour;
    System.out.println(vehiclecolour);


byte tankCapacity=mobi.tankCapacity;
    System.out.println(tankCapacity);

short maxSpeed=mobi.maxSpeed;
    System.out.println(maxSpeed);



 
   }

 }