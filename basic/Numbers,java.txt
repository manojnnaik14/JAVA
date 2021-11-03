class Numbers{
static String[] even={"0","2","4","6","8","10","12"};
 static String[] odd={"1","3","5","7","9","11","13"};

public static void main(String a[]){
System.out.println("main method started");
getEven(even);
 

getOdd(odd);
}


public static void getEven(String[] even){
for(int i=0;i<even.length;i++){
System.out.println(even[i]);
}
}
public static String getEven(String even){
return even;
}

public static void getOdd(String[] odd){
for(int i=0;i<odd.length;i++){
System.out.println(odd[i]);
}
}




} 