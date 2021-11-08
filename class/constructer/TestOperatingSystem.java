class TestOperatingSystem{

public static void main(String[] a){

OperatingSystem os=new OperatingSystem();
String name=os.name;
System.out.println(os.name);

OperatingSystem ver=new OperatingSystem();
int version=ver.version;
ver.version=45;
System.out.println(ver.version);



}
}