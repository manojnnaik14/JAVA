class Crackers{
String brand;
String type;
short height;
float price;
boolean harmful;

Crackers(String b){
brand=b;
}
Crackers(String b,String ty,short he,float pr,boolean ha){
 brand=b;
type=ty;
height=he;
price=pr;
harmful=ha;
}

String display(){
String display=brand+"  "+type+"  "+height+"   "+price+"  "+harmful;
return display;

}


}