class TestSolarsystem
{
public static void main(String []planets){
  
  Solarsystem.show(planets);
  System.out.println(Solarsystem.count());

System.out.println(Solarsystem.nextPlanet("mercury","    venus"));
System.out.println(Solarsystem.nextPlanet("mars   ","earth    ","    jupiter"));
}
}