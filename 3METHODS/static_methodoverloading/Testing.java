import java.util.Scanner;
import java.util.Arrays;

class Testing{

static String languagesSpeaken[] = new String[3];


public static void main(String a[]){

Scanner sc = new Scanner(System.in);

System.out.println("enter the first language :");
languagesSpeaken[0] = sc.next();

System.out.println("enter the second language :");
languagesSpeaken[1]= sc.next();

System.out.println("enter the third language :");
languagesSpeaken[2] = sc.next();

System.out.println(Arrays.toString(languagesSpeaken));
}

}