class Keyboard{
String name;
String buttons;
short length;
float price;
String warranty;

Keyboard(String nam){
name=nam;
}
Keyboard(String na,String bu,short le,float pr,String wa){
name=na;

buttons=bu;
length=le;
price=pr;
 warranty=wa;
}

String display(){
String display=name+"  "+buttons+"  "+length+"   "+price+"  "+warranty;
return display;

}


}