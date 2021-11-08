class TestTime{
public static void main(String []args){
	int hours=10;
	byte mins=4;
	byte secs=29;
	String zone="GMT+5.30";
Time.currenttime();
Time.currenttime(hours,mins,secs);
System.out.println(Time.timeInAmerica(5)); 

}

}