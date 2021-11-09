class TestTrekking{

public static void main(String []a){
short dist=20;
Trekking tr=new Trekking("chickmagaluru","mullangiri",dist,2000.0f,true);

System.out.println(tr.display());

short distance=15;
Trekking t=new Trekking("chikkamgaluru","kudremukha",distance,3000.0f,true);
System.out.println(t.display());
}

}