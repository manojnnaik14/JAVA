class Marks{
public static void main(String[] marks){
for(int mark=0;mark<marks.length;mark++){
String cgpa=marks[mark];
int per=Integer.parseInt(cgpa);
float avg=Float.parseFloat(cgpa);
System.out.println(cgpa+"  "+per+"  "+avg);
}

}
} 