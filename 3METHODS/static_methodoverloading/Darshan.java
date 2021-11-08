class Darshan{


static String[] getNoOfLanguagesSpeak(String []languages){
languages[0]="kannada";
languages[1]="hindi";
languages[2]="telugu";

for (int i=0; i<languages.length;i++){
System.out.println(languages[i]);
}
return languages;
}

public static void main(String args[]){

long[] id={8761387l,967489l,9879813l,983724982l,3487039l};
for(int i =0;i<id.length;i++){
System.out.println(id[i]);
}
getNoOfLanguagesSpeak(languages);
}
}