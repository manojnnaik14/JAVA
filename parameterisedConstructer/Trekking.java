class Trekking{
String district;
String place;
short distance;
float expenditure;
boolean wannago;

Trekking(String di,String pl){
district=di;
place =pl;
}
Trekking(String dis,String pl,short dist,float exp,boolean wan){
 district=dis;
 place=pl;
 distance=dist;
 expenditure=exp;
 wannago=wan;

}

String display(){
String display=district+"  "+place+"  "+distance+"   "+expenditure+"  "+wannago;
return display;

}


}