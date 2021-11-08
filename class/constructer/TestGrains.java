class TestGrains{
 public static void main(String []args){
  
 Grains type = new Grains();
 
 type.types=8;
 byte graintypes=type.types;
 System.out.println(graintypes);

type.name ="greengram";
 String grainname =type.name;
 System.out.println(grainname);

 type.colour ="green";
 String graincolour=type.colour;
 System.out.println(graincolour);

type.protein= 77.8f;
 float grainprotein=type.protein;
 System.out.println(grainprotein);

    }

} 