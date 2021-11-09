class Monuments{
String name;
String location;
short YOC;
float area;

Monuments(String n){
name=n;
}
Monuments(String na,String l,short yoc){
name=na;
location=l;
YOC=yoc;
}

String printAll(){
String display=name+"  "+location+"  "+YOC+"  "+area;
return display;

}


}