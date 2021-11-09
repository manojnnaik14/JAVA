class TestMonuments{

public static void main(String []a){

Monuments tm=new Monuments("taj");
String result=tm.printAll();
System.out.println(result);

short yoc=1631;
Monuments tmm=new Monuments("taj","agra",yoc);
System.out.println(tmm.display());
}

}